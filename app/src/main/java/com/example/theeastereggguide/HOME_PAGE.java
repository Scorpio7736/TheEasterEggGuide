package com.example.theeastereggguide;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HOME_PAGE extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private final Handler sliderHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);

        if (firstStart) {
            showFirstTimeDialog();
        }

        viewPager2 = findViewById(R.id.view_pager_slideshow);

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.slide_bocw);
        imageList.add(R.drawable.slide_boi);
        imageList.add(R.drawable.slide_boii);
        imageList.add(R.drawable.slide_boiii);
        imageList.add(R.drawable.slide_boiiii);
        imageList.add(R.drawable.slide_waw);

        ImageSliderAdapter adapter = new ImageSliderAdapter(imageList);
        viewPager2.setAdapter(adapter);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 10000); // 10 seconds delay
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_maps) {
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
            } else if (itemId == R.id.nav_favorites) {
                startActivity(new Intent(getApplicationContext(), Favorites_PAGE.class));
                overridePendingTransition(0, 0);
                return true;
            }
            return false;
        });
    }

    private final Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            if (viewPager2.getAdapter() != null) {
                int currentItem = viewPager2.getCurrentItem();
                int itemCount = viewPager2.getAdapter().getItemCount();
                if (currentItem < itemCount - 1) {
                    viewPager2.setCurrentItem(currentItem + 1);
                } else {
                    viewPager2.setCurrentItem(0);
                }
            }
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 10000);
    }

    private void showFirstTimeDialog()
    {
        String titleText = "Welcome!";
        String messageText = "Welcome to the Easter Egg Guide";
        String buttonText = "OK";

        new AlertDialog.Builder(this)
                .setTitle(titleText)
                .setMessage(messageText)
                .setPositiveButton(buttonText, (dialog, which) -> {
                    SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putBoolean("firstStart", false);
                    editor.apply();
                    dialog.dismiss();
                })
                .create().show();
    }
}
