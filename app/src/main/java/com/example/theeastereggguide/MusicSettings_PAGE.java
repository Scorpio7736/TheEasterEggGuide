package com.example.theeastereggguide;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MusicSettings_PAGE extends AppCompatActivity {

    private static final String PREFS_NAME = "Settings";
    private static final String SOUND_ENABLED_KEY = "sound_enabled";
    private static final String MUSIC_ENABLED_KEY = "music_enabled";
    private static final String SELECTED_SONG_KEY = "selected_song";
    private boolean userIsInteracting = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_settings);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean soundEnabled = settings.getBoolean(SOUND_ENABLED_KEY, true);
        boolean musicEnabled = settings.getBoolean(MUSIC_ENABLED_KEY, true);

        Switch soundSwitch = findViewById(R.id.sound_switch);
        soundSwitch.setChecked(soundEnabled);

        soundSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean(SOUND_ENABLED_KEY, isChecked);
            editor.apply();
        });

        Switch musicSwitch = findViewById(R.id.music_switch);
        musicSwitch.setChecked(musicEnabled);

        musicSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean(MUSIC_ENABLED_KEY, isChecked);
            editor.apply();
            if (isChecked) {
                MusicManager.getInstance().startMusic();
            } else {
                MusicManager.getInstance().stopMusic();
            }
        });

        Spinner songChoiceSpinner = findViewById(R.id.song_choice_spinner);
        ArrayAdapter<Enums.App_Music> adapter = new ArrayAdapter<>(this, R.layout.spinner_item_layout, Enums.App_Music.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        songChoiceSpinner.setAdapter(adapter);

        int selectedSongOrdinal = settings.getInt(SELECTED_SONG_KEY, 0);
        songChoiceSpinner.setSelection(selectedSongOrdinal);

        songChoiceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (userIsInteracting) {
                    Enums.App_Music selectedMusic = (Enums.App_Music) parent.getItemAtPosition(position);
                    MusicManager.getInstance().changeSong(selectedMusic.getMusicResId());
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt(SELECTED_SONG_KEY, selectedMusic.ordinal());
                    editor.apply();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        userIsInteracting = true;
    }
}
