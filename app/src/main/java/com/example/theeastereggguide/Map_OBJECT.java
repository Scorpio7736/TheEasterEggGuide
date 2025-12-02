package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.List;

public class Map_OBJECT {

    private String mapName;
    private ArrayList<String> mainQuest;
    private List<String> sideQuests;
    private List<String> buildables;

    public Map_OBJECT() {
        this.mainQuest = new ArrayList<>();
        this.sideQuests = new ArrayList<>();
        this.buildables = new ArrayList<>();
    }

    public Map_OBJECT(String mapName, ArrayList<String> mainQuest, List<String> sideQuests, List<String> buildables) {
        this.mapName = mapName;
        this.mainQuest = mainQuest;
        this.sideQuests = sideQuests;
        this.buildables = buildables;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public ArrayList<String> getMainQuest() {
        return mainQuest;
    }

    public void setMainQuest(ArrayList<String> mainQuest) {
        this.mainQuest = mainQuest;
    }

    public List<String> getSideQuests() {
        return sideQuests;
    }

    public void setSideQuests(List<String> sideQuests) {
        this.sideQuests = sideQuests;
    }

    public List<String> getBuildables() {
        return buildables;
    }

    public void setBuildables(List<String> buildables) {
        this.buildables = buildables;
    }
}
