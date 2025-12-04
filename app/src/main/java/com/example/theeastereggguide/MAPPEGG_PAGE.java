package com.example.theeastereggguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MAPPEGG_PAGE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapegg_page);

        Intent intent = getIntent();
        String mapName = intent.getStringExtra("mapName");
        ArrayList<String> mainQuest = (ArrayList<String>) intent.getSerializableExtra("mainQuest");
        ArrayList<String> sideQuests = (ArrayList<String>) intent.getSerializableExtra("sideQuests");
        ArrayList<String> buildables = (ArrayList<String>) intent.getSerializableExtra("buildables");

        TextView titleText = findViewById(R.id.title_text);
        titleText.setText(mapName);

        LinearLayout mainQuestContent = findViewById(R.id.main_quest_content);
        populateExpandableList(mainQuestContent, mainQuest);

        LinearLayout sideQuestsContent = findViewById(R.id.side_quests_content);
        populateExpandableList(sideQuestsContent, sideQuests);

        LinearLayout buildablesContent = findViewById(R.id.buildables_content);
        populateExpandableList(buildablesContent, buildables);
    }

    private void populateExpandableList(LinearLayout container, ArrayList<String> items) {
        if (items != null) {
            for (String itemText : items) {
                // Create item container
                LinearLayout itemContainer = new LinearLayout(this);
                itemContainer.setOrientation(LinearLayout.VERTICAL);
                LinearLayout.LayoutParams itemContainerParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                itemContainerParams.setMargins(0, 0, 0, 8); // This margin separates the expandable items
                itemContainer.setLayoutParams(itemContainerParams);

                // Create the button
                Button itemButton = new Button(this);
                itemButton.setText(itemText);
                itemButton.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                itemButton.setTextSize(16);
                itemButton.setBackground(getResources().getDrawable(R.drawable.rounded_rectangle_button));
                LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                itemButton.setLayoutParams(buttonParams);

                // Create steps container
                LinearLayout stepsContainer = new LinearLayout(this);
                stepsContainer.setOrientation(LinearLayout.VERTICAL);
                stepsContainer.setVisibility(View.GONE); // Initially hidden
                LinearLayout.LayoutParams stepsParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                stepsParams.setMargins(32, 8, 16, 8); // Indent steps, add some margin top.
                stepsContainer.setLayoutParams(stepsParams);

                // Add steps to stepsContainer
                TextView startStep = new TextView(this);
                startStep.setText("1. Start");
                startStep.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                stepsContainer.addView(startStep);

                TextView middleStep = new TextView(this);
                middleStep.setText("2. Middle");
                middleStep.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                stepsContainer.addView(middleStep);

                TextView endStep = new TextView(this);
                endStep.setText("3. End");
                endStep.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                stepsContainer.addView(endStep);

                // Set OnClickListener
                itemButton.setOnClickListener(v -> {
                    if (stepsContainer.getVisibility() == View.VISIBLE) {
                        stepsContainer.setVisibility(View.GONE);
                    } else {
                        stepsContainer.setVisibility(View.VISIBLE);
                    }
                });

                itemContainer.addView(itemButton);
                itemContainer.addView(stepsContainer);

                container.addView(itemContainer);
            }
        }
    }
}