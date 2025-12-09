package com.example.theeastereggguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MapRecomend_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maprecomend_page);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
    }
}
