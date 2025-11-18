package com.example.theeastereggguide;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HOME_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Handle the splash screen transition.
        SplashScreen.installSplashScreen(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_maps) {
                startActivity(new Intent(getApplicationContext(), MAPS_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            }
            return false;
        });
    }
}