package com.example.theeastereggguide;

import android.content.Intent;
import android.os.Bundle;
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
        if (mainQuest != null) {
            for (String step : mainQuest) {
                TextView stepTextView = new TextView(this);
                stepTextView.setText(step);
                stepTextView.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_secondary_light));
                stepTextView.setTextSize(16);
                stepTextView.setPadding(0, 4, 0, 4);
                mainQuestContent.addView(stepTextView);
            }
        }

        LinearLayout sideQuestsContent = findViewById(R.id.side_quests_content);
        if (sideQuests != null) {
            for (String quest : sideQuests) {
                TextView questTextView = new TextView(this);
                questTextView.setText(quest);
                questTextView.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_secondary_light));
                questTextView.setTextSize(16);
                questTextView.setPadding(0, 4, 0, 4);
                sideQuestsContent.addView(questTextView);
            }
        }

        LinearLayout buildablesContent = findViewById(R.id.buildables_content);
        if (buildables != null) {
            for (String buildable : buildables) {
                TextView buildableTextView = new TextView(this);
                buildableTextView.setText(buildable);
                buildableTextView.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_secondary_light));
                buildableTextView.setTextSize(16);
                buildableTextView.setPadding(0, 4, 0, 4);
                buildablesContent.addView(buildableTextView);
            }
        }
    }
}
