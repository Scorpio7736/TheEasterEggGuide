package com.example.theeastereggguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
        ArrayList<ExpandableItem> mainQuest = (ArrayList<ExpandableItem>) intent.getSerializableExtra("mainQuest");
        ArrayList<ExpandableItem> sideQuests = (ArrayList<ExpandableItem>) intent.getSerializableExtra("sideQuests");
        ArrayList<ExpandableItem> buildables = (ArrayList<ExpandableItem>) intent.getSerializableExtra("buildables");

        TextView titleText = findViewById(R.id.title_text);
        titleText.setText(mapName);

        LinearLayout mainQuestContent = findViewById(R.id.main_quest_content);
        populateExpandableList(mainQuestContent, mainQuest);

        LinearLayout sideQuestsContent = findViewById(R.id.side_quests_content);
        populateExpandableList(sideQuestsContent, sideQuests);

        LinearLayout buildablesContent = findViewById(R.id.buildables_content);
        populateExpandableList(buildablesContent, buildables);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MusicManager.getInstance().resumeMusic(this);
    }

    private void populateExpandableList(LinearLayout container, ArrayList<ExpandableItem> items) {
        if (items != null) {
            for (ExpandableItem item : items) {
                LinearLayout itemContainer = new LinearLayout(this);
                itemContainer.setOrientation(LinearLayout.VERTICAL);
                LinearLayout.LayoutParams itemContainerParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                itemContainerParams.setMargins(0, 0, 0, 8);
                itemContainer.setLayoutParams(itemContainerParams);

                Button itemButton = new Button(this);
                itemButton.setText(item.getName());
                itemButton.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                itemButton.setTextSize(16);
                itemButton.setBackground(getResources().getDrawable(R.drawable.rounded_rectangle_button));
                LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                itemButton.setLayoutParams(buttonParams);

                LinearLayout stepsContainer = new LinearLayout(this);
                stepsContainer.setOrientation(LinearLayout.VERTICAL);
                stepsContainer.setVisibility(View.GONE);
                LinearLayout.LayoutParams stepsParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                stepsParams.setMargins(32, 8, 16, 8);
                stepsContainer.setLayoutParams(stepsParams);

                ArrayList<String> steps = item.getSteps();
                if (steps != null && !steps.isEmpty()) {
                    for (int i = 0; i < steps.size(); i++) {
                        TextView stepView = new TextView(this);
                        stepView.setText((i + 1) + ". " + steps.get(i));
                        stepView.setTextColor(getResources().getColor(R.color.CUSTOM_ITEM_text_primary_light));
                        stepsContainer.addView(stepView);
                    }
                }

                itemButton.setOnClickListener(v -> {
                    if (stepsContainer.getVisibility() == View.VISIBLE) {
                        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
                        stepsContainer.startAnimation(slideUp);
                        slideUp.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {
                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                stepsContainer.setVisibility(View.GONE);
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {
                            }
                        });
                    } else {
                        stepsContainer.setVisibility(View.VISIBLE);
                        Animation slideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down);
                        stepsContainer.startAnimation(slideDown);
                    }
                });

                itemContainer.addView(itemButton);
                itemContainer.addView(stepsContainer);

                container.addView(itemContainer);
            }
        }
    }
}
