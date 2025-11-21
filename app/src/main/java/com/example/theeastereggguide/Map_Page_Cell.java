package com.example.theeastereggguide;

import android.content.Context;
import android.content.Intent;
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

    public View createView(Context context, ViewGroup parent) {
        // Inflate the layout for the cell
        LayoutInflater inflater = LayoutInflater.from(context);
        View cellView = inflater.inflate(R.layout.map_cell_layout, parent, false);

        // Get the UI elements
        TextView mapNameTextView = cellView.findViewById(R.id.map_name_text);
        ImageView mapCoverImageView = cellView.findViewById(R.id.map_cover_image);

        // Set the data
        mapNameTextView.setText(map.toString());

        // TODO: Set the cover image for the map from the drawable folder you created.
        // You will need a way to map the enum to a drawable resource name.

        cellView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MAPPEGG_PAGE.class);
                context.startActivity(intent);
            }
        });

        return cellView;
    }

    public Enums.COD_MAP getMap() {
        return map;
    }
}
