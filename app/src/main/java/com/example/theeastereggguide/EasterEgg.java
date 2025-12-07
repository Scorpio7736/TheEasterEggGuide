package com.example.theeastereggguide;

import java.util.List;

public class EasterEgg {

    public String incitementName;
    private String fullName;
    private String affiliation;
    private String firstAppearance;
    private String biography;
    private List<String> personalityTraits;
    private List<String> notableQuotes;
    private String roleInStory;
    private int imageResourceId;

    public EasterEgg(String incitementName, String fullName, String affiliation, String firstAppearance, String biography, List<String> personalityTraits, List<String> notableQuotes, String roleInStory, int imageResourceId) {
        this.incitementName = incitementName;
        this.fullName = fullName;
        this.affiliation = affiliation;
        this.firstAppearance = firstAppearance;
        this.biography = biography;
        this.personalityTraits = personalityTraits;
        this.notableQuotes = notableQuotes;
        this.roleInStory = roleInStory;
        this.imageResourceId = imageResourceId;
    }

    public String getIncitementName() {
        return incitementName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public String getBiography() {
        return biography;
    }

    public List<String> getPersonalityTraits() {
        return personalityTraits;
    }

    public List<String> getNotableQuotes() {
        return notableQuotes;
    }

    public String getRoleInStory() {
        return roleInStory;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}