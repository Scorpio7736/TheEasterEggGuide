package com.example.theeastereggguide;

import java.io.Serializable;
import java.util.ArrayList;

public class ExpandableItem implements Serializable {
    private String name;
    private ArrayList<String> steps;

    public ExpandableItem(String name, ArrayList<String> steps) {
        this.name = name;
        this.steps = steps;
    }

    public ExpandableItem()
    {
        // No Quest Constructor
        this.name = "None";
        this.steps = new ArrayList<String>();
        this.steps.add("There are no steps as there is no quest.");
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }
}
