package com.example.theeastereggguide;

import java.util.ArrayList;

public class Map_OBJECT {

    private String mapName;
    private int mapIcon;
    private ArrayList<ExpandableItem> mainQuest;
    private ArrayList<ExpandableItem> sideQuests;
    private ArrayList<ExpandableItem> buildables;
    private boolean isFavorite;

    public Map_OBJECT() {
        this.mainQuest = new ArrayList<>();
        this.sideQuests = new ArrayList<>();
        this.buildables = new ArrayList<>();
        this.isFavorite = false;
    }

    public Map_OBJECT(String mapName, int mapIcon, ArrayList<ExpandableItem> mainQuest, ArrayList<ExpandableItem> sideQuests, ArrayList<ExpandableItem> buildables) {
        this.mapName = mapName;
        this.mapIcon = mapIcon;
        this.mainQuest = mainQuest;
        this.sideQuests = sideQuests;
        this.buildables = buildables;
        this.isFavorite = false; // Default to not favorite
    }

    public Map_OBJECT(String mapName, int mapIcon, ArrayList<ExpandableItem> mainQuest, ArrayList<ExpandableItem> sideQuests, ArrayList<ExpandableItem> buildables, boolean isFavorite) {
        this.mapName = mapName;
        this.mapIcon = mapIcon;
        this.mainQuest = mainQuest;
        this.sideQuests = sideQuests;
        this.buildables = buildables;
        this.isFavorite = isFavorite;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getMapIcon() {
        return mapIcon;
    }

    public void setMapIcon(int mapIcon) {
        this.mapIcon = mapIcon;
    }

    public ArrayList<ExpandableItem> getMainQuest() {
        return mainQuest;
    }

    public void setMainQuest(ArrayList<ExpandableItem> mainQuest) {
        this.mainQuest = mainQuest;
    }

    public ArrayList<ExpandableItem> getSideQuests() {
        return sideQuests;
    }

    public void setSideQuests(ArrayList<ExpandableItem> sideQuests) {
        this.sideQuests = sideQuests;
    }

    public ArrayList<ExpandableItem> getBuildables() {
        return buildables;
    }

    public void setBuildables(ArrayList<ExpandableItem> buildables) {
        this.buildables = buildables;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
