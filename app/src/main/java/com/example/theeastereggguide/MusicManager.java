package com.example.theeastereggguide;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;

public class MusicManager {

    private static MusicManager instance;
    private MediaPlayer mediaPlayer;
    private Context context;
    private static final String PREFS_NAME = "Settings";
    private static final String MUSIC_ENABLED_KEY = "music_enabled";

    private MusicManager() {
    }

    public static synchronized MusicManager getInstance() {
        if (instance == null) {
            instance = new MusicManager();
        }
        return instance;
    }

    public void initialize(Context context) {
        this.context = context.getApplicationContext();
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this.context, R.raw.damned_boii);
            mediaPlayer.setLooping(true);
        }
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean musicEnabled = settings.getBoolean(MUSIC_ENABLED_KEY, true);
        if (musicEnabled) {
            startMusic();
        }
    }

    public void startMusic() {
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.setVolume(0f, 0f);
            mediaPlayer.start();
            ValueAnimator fadeAnim = ValueAnimator.ofFloat(0f, 1f);
            fadeAnim.setDuration(1000);
            fadeAnim.addUpdateListener(animation -> {
                float volume = (float) animation.getAnimatedValue();
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(volume, volume);
                }
            });
            fadeAnim.start();
        }
    }

    public void stopMusic() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            ValueAnimator fadeAnim = ValueAnimator.ofFloat(1f, 0f);
            fadeAnim.setDuration(1000);
            fadeAnim.addUpdateListener(animation -> {
                float volume = (float) animation.getAnimatedValue();
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(volume, volume);
                }
            });
            fadeAnim.addListener(new android.animation.AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(android.animation.Animator animation) {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    }
                }
            });
            fadeAnim.start();
        }
    }
    
    public void pauseMusic() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    public void resumeMusic(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean musicEnabled = settings.getBoolean(MUSIC_ENABLED_KEY, true);
        if (musicEnabled && mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }

    public void changeSong(int musicResId) {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(context, musicResId);
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
            SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            boolean musicEnabled = settings.getBoolean(MUSIC_ENABLED_KEY, true);
            if (musicEnabled) {
                startMusic();
            }
        }
    }

    public void releaseMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
