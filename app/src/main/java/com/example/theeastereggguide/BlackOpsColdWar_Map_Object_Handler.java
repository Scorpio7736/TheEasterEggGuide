package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlackOpsColdWar_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops Cold War --------------------------

        ArrayList<ExpandableItem> dieMaschineMainQuest = new ArrayList<>();
        dieMaschineMainQuest.add(new ExpandableItem("Die Maschine Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> dieMaschineSideQuests = new ArrayList<>();
        dieMaschineSideQuests.add(new ExpandableItem("Song - Alone", new ArrayList<>()));
        dieMaschineSideQuests.add(new ExpandableItem("Dancing Zombies EE", new ArrayList<>()));
        dieMaschineSideQuests.add(new ExpandableItem("Coffin Dance EE", new ArrayList<>()));
        dieMaschineSideQuests.add(new ExpandableItem("Aetherscope Parts EE", new ArrayList<>()));

        ArrayList<ExpandableItem> dieMaschineBuildables = new ArrayList<>();
        dieMaschineBuildables.add(new ExpandableItem("D.I.E. Wonder Weapon (4 Upgrades)", new ArrayList<>()));
        dieMaschineBuildables.add(new ExpandableItem("Aether Tunnel System", new ArrayList<>()));
        dieMaschineBuildables.add(new ExpandableItem("Dark Aether Vision", new ArrayList<>()));
        dieMaschineBuildables.add(new ExpandableItem("Crafting Table", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.DIE_MASCHINE,
                new Map_OBJECT(
                        Enums.COD_MAP.DIE_MASCHINE.toString(),
                        R.drawable.diemachine_bocw,
                        dieMaschineMainQuest,
                        dieMaschineSideQuests,
                        dieMaschineBuildables
                )
        );

        ArrayList<ExpandableItem> firebaseZMainQuest = new ArrayList<>();
        firebaseZMainQuest.add(new ExpandableItem("Firebase Z Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> firebaseZSideQuests = new ArrayList<>();
        firebaseZSideQuests.add(new ExpandableItem("Song - Lost", new ArrayList<>()));
        firebaseZSideQuests.add(new ExpandableItem("Rabbit EE", new ArrayList<>()));
        firebaseZSideQuests.add(new ExpandableItem("Monkey Bomb Upgrade EE", new ArrayList<>()));
        firebaseZSideQuests.add(new ExpandableItem("Free Juggernog EE", new ArrayList<>()));

        ArrayList<ExpandableItem> firebaseZBuildables = new ArrayList<>();
        firebaseZBuildables.add(new ExpandableItem("RAI K-84 Wonder Weapon", new ArrayList<>()));
        firebaseZBuildables.add(new ExpandableItem("Assault Rounds", new ArrayList<>()));
        firebaseZBuildables.add(new ExpandableItem("Teleporter System", new ArrayList<>()));
        firebaseZBuildables.add(new ExpandableItem("Orda Boss Fight", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.FIREBASE_Z,
                new Map_OBJECT(
                        Enums.COD_MAP.FIREBASE_Z.toString(),
                        R.drawable.firebasez_bocw,
                        firebaseZMainQuest,
                        firebaseZSideQuests,
                        firebaseZBuildables
                )
        );

        ArrayList<ExpandableItem> mfsTooMainQuest = new ArrayList<>();
        mfsTooMainQuest.add(new ExpandableItem("Mauer der Toten Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> mfsTooSideQuests = new ArrayList<>();
        mfsTooSideQuests.add(new ExpandableItem("Song - Amoeba", new ArrayList<>()));
        mfsTooSideQuests.add(new ExpandableItem("Free CRBR-S EE", new ArrayList<>()));
        mfsTooSideQuests.add(new ExpandableItem("Bunny Disco EE", new ArrayList<>()));
        mfsTooSideQuests.add(new ExpandableItem("Safe Dial EE", new ArrayList<>()));

        ArrayList<ExpandableItem> mfsTooBuildables = new ArrayList<>();
        mfsTooBuildables.add(new ExpandableItem("CRBR-S Wonder Weapon", new ArrayList<>()));
        mfsTooBuildables.add(new ExpandableItem("Klaus (A.I. Companion)", new ArrayList<>()));
        mfsTooBuildables.add(new ExpandableItem("Zipline System", new ArrayList<>()));
        mfsTooBuildables.add(new ExpandableItem("Train System", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.MFS_TOO,
                new Map_OBJECT(
                        Enums.COD_MAP.MFS_TOO.toString(),
                        R.drawable.mauerdertoten_bocw,
                        mfsTooMainQuest,
                        mfsTooSideQuests,
                        mfsTooBuildables
                )
        );

        ArrayList<ExpandableItem> forsakenMainQuest = new ArrayList<>();
        forsakenMainQuest.add(new ExpandableItem("Forsaken Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> forsakenSideQuests = new ArrayList<>();
        forsakenSideQuests.add(new ExpandableItem("Song - Never Gonna Give You Up", new ArrayList<>()));
        forsakenSideQuests.add(new ExpandableItem("Arcade Games EE", new ArrayList<>()));
        forsakenSideQuests.add(new ExpandableItem("Free Chrysalax EE", new ArrayList<>()));
        forsakenSideQuests.add(new ExpandableItem("Perkaholic EE", new ArrayList<>()));

        ArrayList<ExpandableItem> forsakenBuildables = new ArrayList<>();
        forsakenBuildables.add(new ExpandableItem("Chrysalax Wonder Weapon", new ArrayList<>()));
        forsakenBuildables.add(new ExpandableItem("Teleporter System", new ArrayList<>()));
        forsakenBuildables.add(new ExpandableItem("Abomination Boss Fight", new ArrayList<>()));
        forsakenBuildables.add(new ExpandableItem("Aetherium Neutralizer", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.FORSAKEN,
                new Map_OBJECT(
                        Enums.COD_MAP.FORSAKEN.toString(),
                        R.drawable.forsaken_bocw,
                        forsakenMainQuest,
                        forsakenSideQuests,
                        forsakenBuildables
                )
        );

        return mapObjects;
    }
}
