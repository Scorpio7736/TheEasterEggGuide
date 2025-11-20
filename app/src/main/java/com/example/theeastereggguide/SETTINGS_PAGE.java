package com.example.theeastereggguide;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SETTINGS_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);

        Button aboutMeButton = findViewById(R.id.about_me_button);
        aboutMeButton.setOnClickListener(v -> {
            startActivity(new Intent(SETTINGS_PAGE.this, ABOUT_ME.class));
        });

        Button wifiCheckButton = findViewById(R.id.wifi_check_button);
        wifiCheckButton.setOnClickListener(v -> {
            checkWifi();
        });
    }

    private void checkWifi() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            new AlertDialog.Builder(this)
                    .setTitle("Wi-Fi Check")
                    .setMessage("You are connected to the internet.")
                    .setPositiveButton("OK", null)
                    .show();
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Wi-Fi Check")
                    .setMessage("You are not connected to the internet.")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }
}