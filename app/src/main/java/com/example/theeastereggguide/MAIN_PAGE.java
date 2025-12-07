package com.example.theeastereggguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

public class MAIN_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Handle the splash screen transition.
        SplashScreen.installSplashScreen(this);

        super.onCreate(savedInstanceState);

        Intent intent = new Intent(MAIN_PAGE.this, HOME_PAGE.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MusicManager.getInstance().resumeMusic(this);
    }
}