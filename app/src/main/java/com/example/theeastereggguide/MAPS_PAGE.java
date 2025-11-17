package com.example.theeastereggguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MAPS_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_page);

        // --- Navigation --- //
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.nav_maps);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                startActivity(new Intent(getApplicationContext(), HOME_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            }
            return false;
        });

        // --- Game Spinner --- //
        Spinner gameSpinner = findViewById(R.id.game_spinner);
        ArrayAdapter<Enums.COD_GAME> adapter = new ArrayAdapter<>(
                this,
                R.layout.custom_spinner_item, // Use our custom layout
                Enums.COD_GAME.values()
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gameSpinner.setAdapter(adapter);
    }
}