package com.example.theeastereggguide;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Calendar;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PROFILE_PAGE extends AppCompatActivity {

    private static final String PREFS_NAME = "ProfilePrefs";
    private static final String NAME_KEY = "name";
    private static final String BIRTHDAY_KEY = "birthday";
    private static final String GENDER_KEY = "gender";
    private static final String ABOUT_KEY = "about";
    private static final String IMAGE_URI_KEY = "imageUri";
    private static final String IMAGE_RESOURCE_ID_KEY = "imageResourceId";

    private CircleImageView profileImage;
    private EditText nameEditText, aboutMeEditText;
    private TextView birthdayText;
    private Spinner genderSpinner;
    private SharedPreferences sharedPreferences;

    private final ActivityResultLauncher<Intent> galleryLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK && result.getData() != null) {
                    Uri selectedImage = result.getData().getData();
                    if (selectedImage != null) {
                        final int takeFlags = Intent.FLAG_GRANT_READ_URI_PERMISSION;
                        getContentResolver().takePersistableUriPermission(selectedImage, takeFlags);
                        profileImage.setImageURI(selectedImage);

                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString(IMAGE_URI_KEY, selectedImage.toString());
                        editor.remove(IMAGE_RESOURCE_ID_KEY);
                        editor.apply();
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        profileImage = findViewById(R.id.profile_image);
        nameEditText = findViewById(R.id.name_edittext);
        birthdayText = findViewById(R.id.birthday_text);
        genderSpinner = findViewById(R.id.gender_spinner);
        aboutMeEditText = findViewById(R.id.about_me_edittext);
        Button saveButton = findViewById(R.id.save_button);
        Button cancelButton = findViewById(R.id.cancel_button);

        profileImage.setOnClickListener(v -> {
            Intent galleryIntent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            galleryIntent.addCategory(Intent.CATEGORY_OPENABLE);
            galleryIntent.setType("image/*");
            galleryLauncher.launch(galleryIntent);
        });

        birthdayText.setOnClickListener(v -> {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year1, monthOfYear, dayOfMonth) ->
                    birthdayText.setText(String.format("%d/%d/%d", dayOfMonth, monthOfYear + 1, year1)), year, month, day);
            datePickerDialog.show();
        });

        saveButton.setOnClickListener(v -> EggListener());

        cancelButton.setOnClickListener(v -> {
            loadData();
            Toast.makeText(this, "Changes reverted", Toast.LENGTH_SHORT).show();
        });

        // Gender Spinner
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this,
                R.array.genders, R.layout.custom_spinner_item);
        genderAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        loadData();

        // --- Navigation --- //
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.nav_profile);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                startActivity(new Intent(getApplicationContext(), HOME_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_maps) {
                startActivity(new Intent(getApplicationContext(), MAPS_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_settings) {
                startActivity(new Intent(getApplicationContext(), SETTINGS_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_favorites) {
                startActivity(new Intent(getApplicationContext(), Favorites_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            }
            return false;
        });
    }

    private void EggListener() {
        String username = nameEditText.getText().toString().trim();
        List<EasterEgg> easterEggs = EasterEgg_Object_Handler.getEasterEggs();

        for (EasterEgg egg : easterEggs) {
            if (username.equalsIgnoreCase(egg.getIncitementName())) {
                nameEditText.setText(egg.getFullName());
                aboutMeEditText.setText(egg.getAffiliation());
                birthdayText.setText("11/11/2008"); // Call of Duty: World at War release date
                profileImage.setImageResource(egg.getImageResourceId());

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(NAME_KEY, nameEditText.getText().toString());
                editor.putString(BIRTHDAY_KEY, birthdayText.getText().toString());
                editor.putInt(GENDER_KEY, genderSpinner.getSelectedItemPosition());
                editor.putString(ABOUT_KEY, aboutMeEditText.getText().toString());
                editor.putInt(IMAGE_RESOURCE_ID_KEY, egg.getImageResourceId());
                editor.remove(IMAGE_URI_KEY);
                editor.apply();

                MediaPlayer.create(this, R.raw.easter_egg_found).start();

                Intent intent = new Intent(this, EasterEgg_Reveal_Page.class);
                intent.putExtra("EASTER_EGG_NAME", egg.getIncitementName());
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return; // Stop further execution
            }
        }

        // If no match is found, proceed with saving data
        saveData();
    }

    private void saveData() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NAME_KEY, nameEditText.getText().toString());
        editor.putString(BIRTHDAY_KEY, birthdayText.getText().toString());
        editor.putInt(GENDER_KEY, genderSpinner.getSelectedItemPosition());
        editor.putString(ABOUT_KEY, aboutMeEditText.getText().toString());
        editor.apply();
        Toast.makeText(this, "Profile Saved!", Toast.LENGTH_SHORT).show();
    }

    private void loadData() {
        try {
            nameEditText.setText(sharedPreferences.getString(NAME_KEY, ""));
            birthdayText.setText(sharedPreferences.getString(BIRTHDAY_KEY, "Select Birthday"));
            genderSpinner.setSelection(sharedPreferences.getInt(GENDER_KEY, 0));
            aboutMeEditText.setText(sharedPreferences.getString(ABOUT_KEY, ""));

            int imageResId = sharedPreferences.getInt(IMAGE_RESOURCE_ID_KEY, 0);
            if (imageResId != 0) {
                profileImage.setImageResource(imageResId);
            } else {
                String imageUriString = sharedPreferences.getString(IMAGE_URI_KEY, null);
                if (imageUriString != null) {
                    profileImage.setImageURI(Uri.parse(imageUriString));
                } else {
                    profileImage.setImageResource(R.drawable.profile_icon);
                }
            }
        } catch (Exception e) { // Catch all exceptions for robustness
            Log.e("PROFILE_PAGE", "Error loading data from SharedPreferences. Resetting profile data.", e);
            // Clear corrupted preferences to prevent future crashes
            sharedPreferences.edit().clear().apply();
            // Reset the UI to its default state
            nameEditText.setText("");
            birthdayText.setText("Select Birthday");
            genderSpinner.setSelection(0);
            aboutMeEditText.setText("");
            profileImage.setImageResource(R.drawable.profile_icon);
            // Optionally, inform the user that their data was reset
            Toast.makeText(this, "Profile data was corrupted and has been reset.", Toast.LENGTH_LONG).show();
        }
    }
}
