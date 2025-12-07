package com.example.theeastereggguide;

import android.app.Application;
import android.content.ComponentCallbacks2;

public class TheEasterEggGuideApplication extends Application implements ComponentCallbacks2 {

    @Override
    public void onCreate() {
        super.onCreate();
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
}