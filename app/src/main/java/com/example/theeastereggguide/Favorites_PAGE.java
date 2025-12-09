package com.example.theeastereggguide;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Favorites_PAGE extends AppCompatActivity {

    private GridLayout favoritesContainer;
    private TextView noFavoritesText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites_page);

        favoritesContainer = findViewById(R.id.favorites_container);
        noFavoritesText = findViewById(R.id.no_favorites_text);

        // --- Navigation --- //
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.nav_favorites);

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
            } else if (itemId == R.id.nav_profile) {
                startActivity(new Intent(getApplicationContext(), PROFILE_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            }
            return false;
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayFavoriteMaps();
    }

    private void displayFavoriteMaps() {
        favoritesContainer.removeAllViews();
        SharedPreferences sharedPreferences = getSharedPreferences("favorites", MODE_PRIVATE);
        boolean hasFavorites = false;

        for (Enums.COD_MAP map : Enums.COD_MAP.values()) {
            if (sharedPreferences.getBoolean(map.name(), false)) {
                hasFavorites = true;
                Map_Page_Cell mapCell = new Map_Page_Cell(map);
                // When a favorite is toggled on this page, refresh the display
                View cellView = mapCell.createView(this, favoritesContainer, this::displayFavoriteMaps);
                favoritesContainer.addView(cellView);
            }
        }

        if (hasFavorites) {
            noFavoritesText.setVisibility(View.GONE);
            favoritesContainer.setVisibility(View.VISIBLE);
        } else {
            noFavoritesText.setVisibility(View.VISIBLE);
            favoritesContainer.setVisibility(View.GONE);
        }
    }
}