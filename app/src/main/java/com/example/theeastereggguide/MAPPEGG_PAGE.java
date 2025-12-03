package com.example.theeastereggguide;

import android.content.Intent;
import android.os.Bundle;
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
        if (mainQuest != null) {
            for (String step : mainQuest) {
                Button stepButton = new Button(this);
                stepButton.setText(step);
                stepButton.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                stepButton.setTextSize(16);
                stepButton.setBackground(getResources().getDrawable(R.drawable.rounded_rectangle_button));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(0, 0, 0, 8);
                stepButton.setLayoutParams(params);
                mainQuestContent.addView(stepButton);
            }
        }

        LinearLayout sideQuestsContent = findViewById(R.id.side_quests_content);
        if (sideQuests != null) {
            for (String quest : sideQuests) {
                Button questButton = new Button(this);
                questButton.setText(quest);
                questButton.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                questButton.setTextSize(16);
                questButton.setBackground(getResources().getDrawable(R.drawable.rounded_rectangle_button));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(0, 0, 0, 8);
                questButton.setLayoutParams(params);
                sideQuestsContent.addView(questButton);
            }
        }

        LinearLayout buildablesContent = findViewById(R.id.buildables_content);
        if (buildables != null) {
            for (String buildable : buildables) {
                Button buildableButton = new Button(this);
                buildableButton.setText(buildable);
                buildableButton.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                buildableButton.setTextSize(16);
                buildableButton.setBackground(getResources().getDrawable(R.drawable.rounded_rectangle_button));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(0, 0, 0, 8);
                buildableButton.setLayoutParams(params);
                buildablesContent.addView(buildableButton);
            }
        }
    }
}
