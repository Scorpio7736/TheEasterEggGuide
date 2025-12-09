package com.example.theeastereggguide;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

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

        List<Enums.COD_MAP> favoriteMaps = new ArrayList<>();
        for (Enums.COD_MAP map : Enums.COD_MAP.values()) {
            if (sharedPreferences.getBoolean(map.name(), false)) {
                favoriteMaps.add(map);
            }
        }

        if (!favoriteMaps.isEmpty()) {
            noFavoritesText.setVisibility(View.GONE);
            favoritesContainer.setVisibility(View.VISIBLE);

            for (Enums.COD_MAP map : favoriteMaps) {
                Map_Page_Cell mapCell = new Map_Page_Cell(map);
                View cellView = mapCell.createView(this, favoritesContainer, this::displayFavoriteMaps);
                favoritesContainer.addView(cellView);
            }

            // If there's an odd number of favorites, add a dummy view to balance the layout
            if (favoriteMaps.size() % 2 != 0) {
                android.widget.Space dummyView = new android.widget.Space(this);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.width = 0;
                params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
                dummyView.setLayoutParams(params);
                favoritesContainer.addView(dummyView);
            }
        } else {
            noFavoritesText.setVisibility(View.VISIBLE);
            favoritesContainer.setVisibility(View.GONE);
        }
    }
}
