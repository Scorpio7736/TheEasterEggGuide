package com.example.theeastereggguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapRecomend_PAGE extends AppCompatActivity {

    private final Maps_OBJECT_HANDLER mapsObjectHandler = new Maps_OBJECT_HANDLER();
    private final Handler handler = new Handler();
    private List<Map_OBJECT> allMaps;
    private int currentIndex = 0;
    private View mapCell;
    private ImageView mapCoverImage;
    private TextView mapNameText;
    private final long startDelay = 50; // ms
    private final long endDelay = 500; // ms

    private final Runnable slideshowRunnable = new Runnable() {
        @Override
        public void run() {
            if (currentIndex < allMaps.size()) {
                Map_OBJECT currentMap = allMaps.get(currentIndex);
                mapCoverImage.setImageResource(currentMap.getMapIcon());
                mapNameText.setText(currentMap.getMapName());

                long delay;
                int totalMaps = allMaps.size();
                if (totalMaps > 1) {
                    delay = startDelay + (long)((endDelay - startDelay) * ((double)currentIndex / (totalMaps - 1)));
                } else {
                    delay = endDelay;
                }

                currentIndex++;
                handler.postDelayed(this, delay);
            } else {
                // Slideshow finished, the last image remains on screen.
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maprecomend_page);

        final ConstraintLayout mapRecommendLayout = findViewById(R.id.map_recommend_layout);
        final Button recommendMapButton = findViewById(R.id.recommend_map_button);
        mapCell = findViewById(R.id.map_cell);
        mapCoverImage = mapCell.findViewById(R.id.map_cover_image);
        mapNameText = mapCell.findViewById(R.id.map_name_text);

        recommendMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapRecommendLayout.setBackgroundResource(R.drawable.box_open);
                mapCell.setVisibility(View.VISIBLE);
                startMapSlideshow();
            }
        });
    }

    private void startMapSlideshow() {
        allMaps = new ArrayList<>(mapsObjectHandler.getAllMaps());
        Collections.shuffle(allMaps);
        currentIndex = 0;
        handler.post(slideshowRunnable);
    }

    @Override
    protected void onStop() {
        super.onStop();
        handler.removeCallbacks(slideshowRunnable);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
    }
}
