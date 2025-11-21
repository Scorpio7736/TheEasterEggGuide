package com.example.theeastereggguide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Map_Page_Cell {

    private final Enums.COD_MAP map;

    public Map_Page_Cell(Enums.COD_MAP map) {
        this.map = map;
    }

    @SuppressLint("DiscouragedApi")
    public View createView(Context context, ViewGroup parent) {
        // Inflate the layout for the cell
        LayoutInflater inflater = LayoutInflater.from(context);
        View cellView = inflater.inflate(R.layout.map_cell_layout, parent, false);

        // Get the UI elements
        TextView mapNameTextView = cellView.findViewById(R.id.map_name_text);
        ImageView mapCoverImageView = cellView.findViewById(R.id.map_cover_image);

        // Set the data
        mapNameTextView.setText(map.toString());

        if (mapCoverImageView != null) {
            int drawableResourceId = context.getResources().getIdentifier(map.name().toLowerCase(), "drawable", context.getPackageName());
            if (drawableResourceId != 0) {
                mapCoverImageView.setImageResource(drawableResourceId);
            }
        }

        return cellView;
    }
}