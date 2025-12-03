package com.example.theeastereggguide;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Calendar;
import de.hdodenhof.circleimageview.CircleImageView;

public class PROFILE_PAGE extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE = 1;
    private static final String PREFS_NAME = "ProfilePrefs";
    private static final String NAME_KEY = "name";
    private static final String BIRTHDAY_KEY = "birthday";
    private static final String GENDER_KEY = "gender";
    private static final String MAP_KEY = "map";
    private static final String ABOUT_KEY = "about";
    private static final String IMAGE_URI_KEY = "imageUri";

    private CircleImageView profileImage;
    private EditText nameEditText, aboutMeEditText;
    private TextView birthdayText;
    private Spinner genderSpinner, favoriteMapSpinner;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        profileImage = findViewById(R.id.profile_image);
        nameEditText = findViewById(R.id.name_edittext);
        birthdayText = findViewById(R.id.birthday_text);
        genderSpinner = findViewById(R.id.gender_spinner);
        favoriteMapSpinner = findViewById(R.id.favorite_map_spinner);
        aboutMeEditText = findViewById(R.id.about_me_edittext);
        Button saveButton = findViewById(R.id.save_button);

        profileImage.setOnClickListener(v -> {
            Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
        });

        birthdayText.setOnClickListener(v -> {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year1, monthOfYear, dayOfMonth) -> {
                birthdayText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year1);
            }, year, month, day);
            datePickerDialog.show();
        });

        saveButton.setOnClickListener(v -> saveData());

        // Gender Spinner
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this,
                R.array.genders, R.layout.custom_spinner_item);
        genderAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        // Favorite Map Spinner
        ArrayAdapter<CharSequence> mapAdapter = ArrayAdapter.createFromResource(this,
                R.array.cod_maps, R.layout.custom_spinner_item);
        mapAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item);
        favoriteMapSpinner.setAdapter(mapAdapter);

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
            }
            return false;
        });
    }

    private void saveData() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NAME_KEY, nameEditText.getText().toString());
        editor.putString(BIRTHDAY_KEY, birthdayText.getText().toString());
        editor.putInt(GENDER_KEY, genderSpinner.getSelectedItemPosition());
        editor.putInt(MAP_KEY, favoriteMapSpinner.getSelectedItemPosition());
        editor.putString(ABOUT_KEY, aboutMeEditText.getText().toString());
        // The profile image URI is saved in onActivityResult
        editor.apply();
        Toast.makeText(this, "Profile Saved!", Toast.LENGTH_SHORT).show();
    }

    private void loadData() {
        nameEditText.setText(sharedPreferences.getString(NAME_KEY, ""));
        birthdayText.setText(sharedPreferences.getString(BIRTHDAY_KEY, "Select Birthday"));
        genderSpinner.setSelection(sharedPreferences.getInt(GENDER_KEY, 0));
        favoriteMapSpinner.setSelection(sharedPreferences.getInt(MAP_KEY, 0));
        aboutMeEditText.setText(sharedPreferences.getString(ABOUT_KEY, ""));

        String imageUriString = sharedPreferences.getString(IMAGE_URI_KEY, null);
        if (imageUriString != null) {
            profileImage.setImageURI(Uri.parse(imageUriString));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            profileImage.setImageURI(selectedImage);

            // Save the image URI immediately
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(IMAGE_URI_KEY, selectedImage.toString());
            editor.apply();
        }
    }
}