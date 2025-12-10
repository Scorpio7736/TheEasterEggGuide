package com.example.theeastereggguide;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapRecomend_PAGE extends AppCompatActivity {

    private final Maps_OBJECT_HANDLER mapsObjectHandler = new Maps_OBJECT_HANDLER();
    private View mapCell;
    private ImageView mapCoverImage;
    private TextView mapNameText;
    private Map_OBJECT recommendedMap;

    private Handler handler = new Handler();
    private Runnable mapCycler;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maprecomend_page);

        final ConstraintLayout mapRecommendLayout = findViewById(R.id.map_recommend_layout);
        final Button recommendMapButton = findViewById(R.id.recommend_map_button);
        mapCell = findViewById(R.id.map_cell);
        mapCoverImage = mapCell.findViewById(R.id.map_cover_image);
        mapNameText = mapCell.findViewById(R.id.map_name_text);
        View favoriteButton = mapCell.findViewById(R.id.favorite_button);
        favoriteButton.setVisibility(View.GONE);

        recommendMapButton.setOnClickListener(v -> {
            recommendMapButton.setEnabled(false);

            if (mapCycler != null) {
                handler.removeCallbacks(mapCycler);
            }
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }

            mediaPlayer = MediaPlayer.create(MapRecomend_PAGE.this, R.raw.mystery_box_opening);

            mapRecommendLayout.setBackgroundResource(R.drawable.box_open);
            mapCell.setVisibility(View.VISIBLE);

            List<Map_OBJECT> allMaps = new ArrayList<>(mapsObjectHandler.getAllMaps());
            Collections.shuffle(allMaps);

            if (!allMaps.isEmpty()) {
                recommendedMap = allMaps.get(allMaps.size() - 1);

                final int[] currentIndex = {0};
                mapCycler = () -> {
                    Map_OBJECT currentMap = allMaps.get(currentIndex[0]);
                    mapCoverImage.setImageResource(currentMap.getMapIcon());
                    mapNameText.setText(currentMap.getMapName());
                    currentIndex[0] = (currentIndex[0] + 1) % allMaps.size();
                    handler.postDelayed(mapCycler, 100);
                };
                handler.post(mapCycler);

                mediaPlayer.start();

                handler.postDelayed(() -> {
                    handler.removeCallbacks(mapCycler);
                    mapCoverImage.setImageResource(recommendedMap.getMapIcon());
                    mapNameText.setText(recommendedMap.getMapName());
                }, 6000);


                mediaPlayer.setOnCompletionListener(mp -> {
                    mp.release();
                    mediaPlayer = null;
                    recommendMapButton.setEnabled(true);
                });
            } else {
                recommendMapButton.setEnabled(true);
            }
        });

        mapCell.setOnClickListener(v -> {
            if (recommendedMap != null) {
                Intent intent = new Intent(MapRecomend_PAGE.this, MAPPEGG_PAGE.class);
                intent.putExtra("mapName", recommendedMap.getMapName());
                intent.putExtra("mainQuest", recommendedMap.getMainQuest());
                intent.putExtra("sideQuests", (Serializable) recommendedMap.getSideQuests());
                intent.putExtra("buildables", (Serializable) recommendedMap.getBuildables());
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;
        }
        if (handler != null && mapCycler != null) {
            handler.removeCallbacks(mapCycler);
        }
    }
}
