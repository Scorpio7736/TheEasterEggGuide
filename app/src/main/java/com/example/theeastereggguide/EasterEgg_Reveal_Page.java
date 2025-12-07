package com.example.theeastereggguide;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class EasterEgg_Reveal_Page extends AppCompatActivity {

    private static final String PREFS_NAME = "Settings";
    private static final String SOUND_ENABLED_KEY = "sound_enabled";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easter_egg_reveal_page);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean soundEnabled = settings.getBoolean(SOUND_ENABLED_KEY, true);

        if (soundEnabled) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.easter_egg_found);
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
        }

        // Get the EasterEgg object from the intent
        String easterEggName = getIntent().getStringExtra("EASTER_EGG_NAME");
        EasterEgg easterEgg = getEasterEggObject(easterEggName);

        if (easterEgg != null) {
            // Get references to the views
            ImageView characterImage = findViewById(R.id.character_image);
            TextView fullNameText = findViewById(R.id.full_name_text);
            TextView affiliationText = findViewById(R.id.affiliation_text);
            TextView firstAppearanceText = findViewById(R.id.first_appearance_text);
            TextView biographyContent = findViewById(R.id.biography_content);
            TextView traitsContent = findViewById(R.id.traits_content);
            TextView quotesContent = findViewById(R.id.quotes_content);
            TextView roleContent = findViewById(R.id.role_content);

            // Set the data
            characterImage.setImageResource(easterEgg.getImageResourceId());
            fullNameText.setText(easterEgg.getFullName());
            affiliationText.setText(easterEgg.getAffiliation());
            firstAppearanceText.setText(easterEgg.getFirstAppearance());
            biographyContent.setText(easterEgg.getBiography());

            // Format and set lists as strings
            traitsContent.setText(android.text.TextUtils.join("\n• ", easterEgg.getPersonalityTraits()));
            quotesContent.setText(android.text.TextUtils.join("\n", easterEgg.getNotableQuotes()));
            roleContent.setText(easterEgg.getRoleInStory());

            // Adjust the image matrix to perform a "top-crop"
            characterImage.post(() -> {
                Matrix matrix = new Matrix();
                characterImage.setScaleType(ImageView.ScaleType.MATRIX);
                matrix.set(characterImage.getImageMatrix());

                float viewWidth = characterImage.getWidth();
                float viewHeight = characterImage.getHeight();
                float drawableWidth = characterImage.getDrawable().getIntrinsicWidth();
                float drawableHeight = characterImage.getDrawable().getIntrinsicHeight();

                float scale = Math.max(viewWidth / drawableWidth, viewHeight / drawableHeight);

                matrix.setScale(scale, scale);
                characterImage.setImageMatrix(matrix);
            });
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        MusicManager.getInstance().resumeMusic(this);
    }

    private EasterEgg getEasterEggObject(String name) {
        if (name == null) return null;
        List<EasterEgg> easterEggs = EasterEgg_Object_Handler.getEasterEggs();
        for (EasterEgg egg : easterEggs) {
            if (name.equals(egg.getIncitementName())) {
                return egg;
            }
        }
        return null;
    }
}