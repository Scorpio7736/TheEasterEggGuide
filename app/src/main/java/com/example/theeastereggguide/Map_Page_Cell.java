package com.example.theeastereggguide;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;

import java.io.Serializable;

public class Map_Page_Cell {

    private final Enums.COD_MAP map;
    private final Maps_OBJECT_HANDLER mapsObjectHandler = new Maps_OBJECT_HANDLER();

    public Map_Page_Cell(Enums.COD_MAP map) {
        this.map = map;
    }

    // Overloaded method for simplicity when no refresh action is needed
    public View createView(Context context, ViewGroup parent) {
        return createView(context, parent, null);
    }

    public View createView(Context context, ViewGroup parent, @Nullable Runnable onFavoriteChanged) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View cellView = inflater.inflate(R.layout.map_cell_layout, parent, false);

        TextView mapNameTextView = cellView.findViewById(R.id.map_name_text);
        ImageView mapCoverImageView = cellView.findViewById(R.id.map_cover_image);
        ToggleButton favoriteButton = cellView.findViewById(R.id.favorite_button);

        Map_OBJECT mapData = mapsObjectHandler.getMapObject(map);
        mapNameTextView.setText(mapData.getMapName());
        mapCoverImageView.setImageResource(mapData.getMapIcon());

        SharedPreferences sharedPreferences = context.getSharedPreferences("favorites", Context.MODE_PRIVATE);
        favoriteButton.setChecked(sharedPreferences.getBoolean(map.name(), false));

        favoriteButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(map.name(), isChecked);
            editor.apply();

            // If a refresh action was provided, run it
            if (onFavoriteChanged != null) {
                onFavoriteChanged.run();
            }
        });

        cellView.setOnClickListener(v -> {
            Intent intent = new Intent(context, MAPPEGG_PAGE.class);
            intent.putExtra("mapName", mapData.getMapName());
            intent.putExtra("mainQuest", mapData.getMainQuest());
            intent.putExtra("sideQuests", (Serializable) mapData.getSideQuests());
            intent.putExtra("buildables", (Serializable) mapData.getBuildables());
            context.startActivity(intent);
        });

        return cellView;
    }

    public Enums.COD_MAP getMap() {
        return map;
    }
}