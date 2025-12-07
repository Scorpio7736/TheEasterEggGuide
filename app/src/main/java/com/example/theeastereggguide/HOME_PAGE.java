package com.example.theeastereggguide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.NonNull;
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
        viewPager2.setUserInputEnabled(false);

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.slide_waw);
        imageList.add(R.drawable.slide_boi);
        imageList.add(R.drawable.slide_boii);
        imageList.add(R.drawable.slide_boiii);
        imageList.add(R.drawable.slide_boiiii);
        imageList.add(R.drawable.slide_bocw);

        ImageSliderAdapter adapter = new ImageSliderAdapter(imageList);
        viewPager2.setAdapter(adapter);

        viewPager2.setPageTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                page.setTranslationX(-position * page.getWidth());
                page.setAlpha(1 - Math.abs(position));
            }
        });

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
                int nextItem;
                if (currentItem < itemCount - 1) {
                    nextItem = currentItem + 1;
                } else {
                    nextItem = 0;
                }

                ValueAnimator animator = ValueAnimator.ofInt(0, viewPager2.getWidth());
                animator.setDuration(500); // DELAY FOR FADE TIMING

                final int[] lastDragPosition = {0};
                viewPager2.beginFakeDrag();
                animator.addUpdateListener(valueAnimator -> {
                    int dragPosition = (int) valueAnimator.getAnimatedValue();
                    int delta = dragPosition - lastDragPosition[0];
                    viewPager2.fakeDragBy(-delta);
                    lastDragPosition[0] = dragPosition;
                });
                animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        viewPager2.endFakeDrag();
                        viewPager2.setCurrentItem(nextItem, false);
                    }
                });
                animator.start();
            }
        }
    };

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
