package com.example.theeastereggguide;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

public class TheEasterEggGuideApplication extends Application implements ComponentCallbacks2, Application.ActivityLifecycleCallbacks {

    private int numStarted = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        MusicManager.getInstance().initialize(this);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            MusicManager.getInstance().pauseMusic();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        MusicManager.getInstance().releaseMusic();
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    @Override
    public void onActivityStarted(Activity activity) {
        if (numStarted == 0) {
            MusicManager.getInstance().resumeMusic(this);
        }
        numStarted++;
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
        numStarted--;
        if (numStarted == 0) {
            MusicManager.getInstance().pauseMusic();
        }
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }
}