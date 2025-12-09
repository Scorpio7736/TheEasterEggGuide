package com.example.theeastereggguide;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
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
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
    private Uri photoURI;

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

    private final ActivityResultLauncher<Intent> cameraLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    profileImage.setImageURI(photoURI);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(IMAGE_URI_KEY, photoURI.toString());
                    editor.remove(IMAGE_RESOURCE_ID_KEY);
                    editor.apply();
                }
            });

    private final ActivityResultLauncher<String> requestPermissionLauncher = registerForActivityResult(
            new ActivityResultContracts.RequestPermission(),
            isGranted -> {
                if (isGranted) {
                    dispatchTakePictureIntent();
                } else {
                    Toast.makeText(this, "Camera permission is required to take a photo.", Toast.LENGTH_SHORT).show();
                }
            });


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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

        profileImage.setOnClickListener(v -> showImagePickerDialog());

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

    private void showImagePickerDialog()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Profile Picture");
        builder.setItems(new CharSequence[]{"Take Photo", "Choose from Gallery"},
                (dialog, which) -> {
                    switch (which) {
                        case 0:
                            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                                    == PackageManager.PERMISSION_GRANTED) {
                                dispatchTakePictureIntent();
                            } else {
                                requestPermissionLauncher.launch(Manifest.permission.CAMERA);
                            }
                            break;
                        case 1:
                            Intent galleryIntent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
                            galleryIntent.addCategory(Intent.CATEGORY_OPENABLE);
                            galleryIntent.setType("image/*");
                            galleryLauncher.launch(galleryIntent);
                            break;
                    }
                });
        builder.show();
    }

    private void dispatchTakePictureIntent()
    {
        String PAGE_TAG = "PROFILE_PAGE";
        String ERROR_MESSAGE = "Error creating image file";
        String FILE_ERROR = "FileProvider Error:";
        String FILE_CONFIG_ERROR = "FileProvider error. Please check your configuration.";
        String CAMERA_NOT_FOUND = "No camera app found.";



        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            File photoFile = null;
            try {
                photoFile = createImageFile();
            } catch (IOException ex) {
                Log.e(PAGE_TAG, ERROR_MESSAGE, ex);
                Toast.makeText(this, ERROR_MESSAGE, Toast.LENGTH_SHORT).show();
                return; // Return if file creation fails
            }
            if (photoFile != null) {
                try {
                    photoURI = FileProvider.getUriForFile(this,
                            "com.example.theeastereggguide.provider",
                            photoFile);
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                    cameraLauncher.launch(takePictureIntent);
                } catch (IllegalArgumentException e) {
                    Log.e(PAGE_TAG, FILE_ERROR + e.getMessage());
                    Toast.makeText(this, FILE_CONFIG_ERROR, Toast.LENGTH_LONG).show();
                }
            }
        } else {
            Toast.makeText(this, CAMERA_NOT_FOUND, Toast.LENGTH_SHORT).show();
        }
    }

    private File createImageFile() throws IOException
    {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );
        return image;
    }

    private void EggListener()
    {
        String WAW_RELEASE_DATE = "11/11/2008";
        String EGG_TAG = "EASTER_EGG_NAME";


        String username = nameEditText.getText().toString().trim();
        List<EasterEgg> easterEggs = EasterEgg_Object_Handler.getEasterEggs();

        for (EasterEgg egg : easterEggs) {
            if (username.equalsIgnoreCase(egg.getIncitementName())) {
                nameEditText.setText(egg.getFullName());
                aboutMeEditText.setText(egg.getAffiliation());
                birthdayText.setText(WAW_RELEASE_DATE);
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
                intent.putExtra(EGG_TAG, egg.getIncitementName());
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return; // Stop further execution
            }
        }

        // If no match is found, proceed with saving data
        saveData();
    }

    private void saveData()
    {
        String TOAST_MSG = "Profile Saved!";

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NAME_KEY, nameEditText.getText().toString());
        editor.putString(BIRTHDAY_KEY, birthdayText.getText().toString());
        editor.putInt(GENDER_KEY, genderSpinner.getSelectedItemPosition());
        editor.putString(ABOUT_KEY, aboutMeEditText.getText().toString());
        editor.apply();
        Toast.makeText(this, TOAST_MSG, Toast.LENGTH_SHORT).show();
    }

    private void loadData()
    {
        String DEFAULT_NAME = "";
        String BIRTHDAY_TITLE = "Select Birthday";
        int DEFAULT_GENDER = 0;
        String DEFAULT_ABOUT = "";
        String PAGE_TAG = "PROFILE_PAGE";



        try {
            nameEditText.setText(sharedPreferences.getString(NAME_KEY, DEFAULT_NAME));
            birthdayText.setText(sharedPreferences.getString(BIRTHDAY_KEY, BIRTHDAY_TITLE));
            genderSpinner.setSelection(sharedPreferences.getInt(GENDER_KEY, DEFAULT_GENDER));
            aboutMeEditText.setText(sharedPreferences.getString(ABOUT_KEY, DEFAULT_ABOUT));
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
            Log.e(PAGE_TAG, "Error loading data from SharedPreferences. Resetting profile data.", e);
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
