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

    public String getName() {
        return name;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }
}
