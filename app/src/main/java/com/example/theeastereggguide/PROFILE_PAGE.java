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

    // ---- Constants ----
    private static final int RESULT_LOAD_IMAGE = 1;
    private static final String PREFS_NAME     = "ProfilePrefs";

    private static final String NAME_KEY       = "name";
    private static final String BIRTHDAY_KEY   = "birthday";
    private static final String GENDER_KEY     = "gender";
    private static final String MAP_KEY        = "map";
    private static final String ABOUT_KEY      = "about";
    private static final String IMAGE_URI_KEY  = "imageUri";

    // ---- Views / State ----
    private CircleImageView profileImage;
    private EditText nameEditText, aboutMeEditText;
    private TextView birthdayText;
    private Spinner genderSpinner, favoriteMapSpinner;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        // ----- SharedPreferences -----
        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        // ----- View Binding -----
        profileImage      = findViewById(R.id.profile_image);
        nameEditText      = findViewById(R.id.name_edittext);
        birthdayText      = findViewById(R.id.birthday_text);
        genderSpinner     = findViewById(R.id.gender_spinner);
        favoriteMapSpinner= findViewById(R.id.favorite_map_spinner);
        aboutMeEditText   = findViewById(R.id.about_me_edittext);
        Button saveButton = findViewById(R.id.save_button);

        // ----- Profile Image Picker -----
        profileImage.setOnClickListener(v -> {
            Intent galleryIntent =
                    new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
        });

        // ----- Birthday Picker -----
        birthdayText.setOnClickListener(v -> {
            final Calendar c = Calendar.getInstance();
            int year  = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day   = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    PROFILE_PAGE.this,
                    (view, year1, monthOfYear, dayOfMonth) ->
                            birthdayText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year1),
                    year, month, day
            );
            datePickerDialog.show();
        });

        // ----- Spinners -----
        // Genders: uses res/values/arrays.xml -> <string-array name="genders">
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.genders,
                R.layout.custom_spinner_item
        );
        genderAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        // Maps: uses res/values/arrays.xml -> <string-array name="cod_maps">
        ArrayAdapter<CharSequence> mapAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.cod_maps,
                R.layout.custom_spinner_item
        );
        mapAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item);
        favoriteMapSpinner.setAdapter(mapAdapter);

        // ----- Load Saved Data -----
        loadData(genderAdapter, mapAdapter);

        // ----- Save Button -----
        saveButton.setOnClickListener(v -> {
            saveData();
            Toast.makeText(PROFILE_PAGE.this, "Profile saved", Toast.LENGTH_SHORT).show();
        });

        // ----- Bottom Navigation -----
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null); // keep original icon colors
        bottomNavigationView.setSelectedItemId(R.id.nav_profile);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.nav_home) {
                startActivity(new Intent(PROFILE_PAGE.this, HOME_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_maps) {
                startActivity(new Intent(PROFILE_PAGE.this, MAPS_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_settings) {
                startActivity(new Intent(PROFILE_PAGE.this, SETTINGS_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            }
            // nav_profile or nav_favorites fall through (no-op here)
            return false;
        });
    }

    // ---- Save profile to SharedPreferences ----
    private void saveData() {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(NAME_KEY,     nameEditText.getText().toString().trim());
        editor.putString(BIRTHDAY_KEY, birthdayText.getText().toString().trim());
        editor.putString(GENDER_KEY,
                genderSpinner.getSelectedItem() != null
                        ? genderSpinner.getSelectedItem().toString()
                        : "");
        editor.putString(MAP_KEY,
                favoriteMapSpinner.getSelectedItem() != null
                        ? favoriteMapSpinner.getSelectedItem().toString()
                        : "");
        editor.putString(ABOUT_KEY,    aboutMeEditText.getText().toString().trim());

        editor.apply();
    }

    // ---- Load profile from SharedPreferences ----
    private void loadData(ArrayAdapter<CharSequence> genderAdapter,
                          ArrayAdapter<CharSequence> mapAdapter) {

        String name      = sharedPreferences.getString(NAME_KEY, "");
        String birthday  = sharedPreferences.getString(BIRTHDAY_KEY, "");
        String gender    = sharedPreferences.getString(GENDER_KEY, "");
        String map       = sharedPreferences.getString(MAP_KEY, "");
        String about     = sharedPreferences.getString(ABOUT_KEY, "");
        String imageUri  = sharedPreferences.getString(IMAGE_URI_KEY, null);

        nameEditText.setText(name);
        birthdayText.setText(birthday);
        aboutMeEditText.setText(about);

        if (!gender.isEmpty()) {
            int pos = genderAdapter.getPosition(gender);
            if (pos >= 0) genderSpinner.setSelection(pos);
        }

        if (!map.isEmpty()) {
            int pos = mapAdapter.getPosition(map);
            if (pos >= 0) favoriteMapSpinner.setSelection(pos);
        }

        if (imageUri != null) {
            Uri uri = Uri.parse(imageUri);
            profileImage.setImageURI(uri);
        }
    }

    // ---- Handle gallery result ----
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            if (selectedImage != null) {
                profileImage.setImageURI(selectedImage);

                // Save the image URI immediately
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(IMAGE_URI_KEY, selectedImage.toString());
                editor.apply();
            }
        }
    }
}
