package com.example.theeastereggguide;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SETTINGS_PAGE extends AppCompatActivity {

    private static final String PREFS_NAME = "Settings";
    private static final String SOUND_ENABLED_KEY = "sound_enabled";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean soundEnabled = settings.getBoolean(SOUND_ENABLED_KEY, true);

        SwitchMaterial soundSwitch = findViewById(R.id.sound_switch);
        soundSwitch.setChecked(soundEnabled);

        soundSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean(SOUND_ENABLED_KEY, isChecked);
            editor.apply();
        });

        Button aboutMeButton = findViewById(R.id.about_me_button);
        aboutMeButton.setOnClickListener(v -> startActivity(new Intent(SETTINGS_PAGE.this, ABOUT_ME_PAGE.class)));

        Button wifiCheckButton = findViewById(R.id.wifi_check_button);
        wifiCheckButton.setOnClickListener(v -> checkWifi());

        // --- Navigation --- //
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.nav_settings);

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
            } else if (itemId == R.id.nav_profile) {
                startActivity(new Intent(getApplicationContext(), PROFILE_PAGE.class));
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

    private void checkWifi() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        Network network = connectivityManager.getActiveNetwork();
        if (network == null) {
            showWifiMessage(false);
            return;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        boolean isConnected = networkCapabilities != null && networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
        showWifiMessage(isConnected);
    }

    private void showWifiMessage(boolean isConnected) {
        new AlertDialog.Builder(this)
                .setTitle("Wi-Fi Check")
                .setMessage(isConnected ? "You are connected to the internet." : "You are not connected to the internet.")
                .setPositiveButton("OK", null)
                .show();
    }
}