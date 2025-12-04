package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlackOps2_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops II --------------------------

        ArrayList<ExpandableItem> tranzitMainQuest = new ArrayList<>();
        tranzitMainQuest.add(new ExpandableItem("Tower of Babble Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> tranzitSideQuests = new ArrayList<>();
        tranzitSideQuests.add(new ExpandableItem("Bus Parts", new ArrayList<>()));
        tranzitSideQuests.add(new ExpandableItem("Song - Carrion", new ArrayList<>()));
        tranzitSideQuests.add(new ExpandableItem("Nacht der Untoten Hidden Area", new ArrayList<>()));
        tranzitSideQuests.add(new ExpandableItem("Denizen Teleporters", new ArrayList<>()));
        tranzitSideQuests.add(new ExpandableItem("TV Tower Morse/Event", new ArrayList<>()));

        ArrayList<ExpandableItem> tranzitBuildables = new ArrayList<>();
        tranzitBuildables.add(new ExpandableItem("Turbine", new ArrayList<>()));
        tranzitBuildables.add(new ExpandableItem("Zombie Shield", new ArrayList<>()));
        tranzitBuildables.add(new ExpandableItem("Jet Gun - Thrustodyne Aeronautics Model 23", new ArrayList<>()));
        tranzitBuildables.add(new ExpandableItem("Electric Trap", new ArrayList<>()));
        tranzitBuildables.add(new ExpandableItem("Turret Trap", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.TRANZIT,
                new Map_OBJECT(
                        Enums.COD_MAP.TRANZIT.toString(),
                        R.drawable.tranzit_boii,
                        tranzitMainQuest,
                        tranzitSideQuests,
                        tranzitBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> townSideQuests = new ArrayList<>();
        townSideQuests.add(new ExpandableItem("Song - Carrion (shared with TranZit)", new ArrayList<>()));
        townSideQuests.add(new ExpandableItem("Lava Challenges", new ArrayList<>()));

        ArrayList<ExpandableItem> townBuildables = new ArrayList<>();
        townBuildables.add(new ExpandableItem("Pack A Punch", new ArrayList<>()));
        townBuildables.add(new ExpandableItem("Lava Hazards", new ArrayList<>()));
        townBuildables.add(new ExpandableItem("Wall Weapons", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.TOWN,
                new Map_OBJECT(
                        Enums.COD_MAP.TOWN.toString(),
                        R.drawable.town_boii,
                        new ArrayList<>(),
                        townSideQuests,
                        townBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> farmSideQuests = new ArrayList<>();
        farmSideQuests.add(new ExpandableItem("Song - Carrion (shared)", new ArrayList<>()));
        farmSideQuests.add(new ExpandableItem("Cornfield Secrets", new ArrayList<>()));

        ArrayList<ExpandableItem> farmBuildables = new ArrayList<>();
        farmBuildables.add(new ExpandableItem("Wall Weapons", new ArrayList<>()));
        farmBuildables.add(new ExpandableItem("Lava Hazards", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.FARM,
                new Map_OBJECT(
                        Enums.COD_MAP.FARM.toString(),
                        R.drawable.farm_boii,
                        new ArrayList<>(),
                        farmSideQuests,
                        farmBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> busDepotSideQuests = new ArrayList<>();
        busDepotSideQuests.add(new ExpandableItem("Song - Carrion (shared)", new ArrayList<>()));
        busDepotSideQuests.add(new ExpandableItem("No Perks Challenge", new ArrayList<>()));

        ArrayList<ExpandableItem> busDepotBuildables = new ArrayList<>();
        busDepotBuildables.add(new ExpandableItem("Wall Weapons", new ArrayList<>()));
        busDepotBuildables.add(new ExpandableItem("Lava Hazards", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.BUS_DEPOT,
                new Map_OBJECT(
                        Enums.COD_MAP.BUS_DEPOT.toString(),
                        R.drawable.busdepot_boii,
                        new ArrayList<>(),
                        busDepotSideQuests,
                        busDepotBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> nuketownSideQuests = new ArrayList<>();
        nuketownSideQuests.add(new ExpandableItem("Song - She’s Not There", new ArrayList<>()));
        nuketownSideQuests.add(new ExpandableItem("Randomized Perk Drops", new ArrayList<>()));
        nuketownSideQuests.add(new ExpandableItem("Round-Based Nuke Events", new ArrayList<>()));
        nuketownSideQuests.add(new ExpandableItem("Population Counter", new ArrayList<>()));

        ArrayList<ExpandableItem> nuketownBuildables = new ArrayList<>();
        nuketownBuildables.add(new ExpandableItem("Randomized Perk Machines", new ArrayList<>()));
        nuketownBuildables.add(new ExpandableItem("Pack A Punch", new ArrayList<>()));
        nuketownBuildables.add(new ExpandableItem("Nuke Collapse Event", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.NUKETOWN_ZOMBIES,
                new Map_OBJECT(
                        Enums.COD_MAP.NUKETOWN_ZOMBIES.toString(),
                        R.drawable.nuketown_boii,
                        new ArrayList<>(),
                        nuketownSideQuests,
                        nuketownBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> dieRiseMainQuest = new ArrayList<>();
        dieRiseMainQuest.add(new ExpandableItem("High Maintenance Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> dieRiseSideQuests = new ArrayList<>();
        dieRiseSideQuests.add(new ExpandableItem("Song - We All Fall Down", new ArrayList<>()));
        dieRiseSideQuests.add(new ExpandableItem("Jumping Jacks Free Perk", new ArrayList<>()));
        dieRiseSideQuests.add(new ExpandableItem("Elevator Key", new ArrayList<>()));
        dieRiseSideQuests.add(new ExpandableItem("TV/Radio Messages", new ArrayList<>()));

        ArrayList<ExpandableItem> dieRiseBuildables = new ArrayList<>();
        dieRiseBuildables.add(new ExpandableItem("Sliquifier", new ArrayList<>()));
        dieRiseBuildables.add(new ExpandableItem("Trample Steam", new ArrayList<>()));
        dieRiseBuildables.add(new ExpandableItem("Navcard Table", new ArrayList<>()));
        dieRiseBuildables.add(new ExpandableItem("Random Elevator System", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.DIE_RISE,
                new Map_OBJECT(
                        Enums.COD_MAP.DIE_RISE.toString(),
                        R.drawable.dierise_boii,
                        dieRiseMainQuest,
                        dieRiseSideQuests,
                        dieRiseBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> motdMainQuest = new ArrayList<>();
        motdMainQuest.add(new ExpandableItem("Pop Goes the Weasel Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> motdSideQuests = new ArrayList<>();
        motdSideQuests.add(new ExpandableItem("Song - Rusty Cage", new ArrayList<>()));
        motdSideQuests.add(new ExpandableItem("Afterlife Puzzles", new ArrayList<>()));
        motdSideQuests.add(new ExpandableItem("Skull Locations", new ArrayList<>()));
        motdSideQuests.add(new ExpandableItem("Plane Part Fetch Quest", new ArrayList<>()));
        motdSideQuests.add(new ExpandableItem("Golden Spork Challenge", new ArrayList<>()));

        ArrayList<ExpandableItem> motdBuildables = new ArrayList<>();
        motdBuildables.add(new ExpandableItem("Acid Gat Kit", new ArrayList<>()));
        motdBuildables.add(new ExpandableItem("Plane to Golden Gate Bridge", new ArrayList<>()));
        motdBuildables.add(new ExpandableItem("Hell’s Retriever/Hell’s Redeemer", new ArrayList<>()));
        motdBuildables.add(new ExpandableItem("Shield Buildable", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.MOB_OF_THE_DEAD,
                new Map_OBJECT(
                        Enums.COD_MAP.MOB_OF_THE_DEAD.toString(),
                        R.drawable.motd_boii,
                        motdMainQuest,
                        motdSideQuests,
                        motdBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> buriedMainQuest = new ArrayList<>();
        buriedMainQuest.add(new ExpandableItem("Mined Games Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> buriedSideQuests = new ArrayList<>();
        buriedSideQuests.add(new ExpandableItem("Song - Always Running", new ArrayList<>()));
        buriedSideQuests.add(new ExpandableItem("Leroy Tasks", new ArrayList<>()));
        buriedSideQuests.add(new ExpandableItem("Witch Maze", new ArrayList<>()));
        buriedSideQuests.add(new ExpandableItem("Free Perk from Witches", new ArrayList<>()));
        buriedSideQuests.add(new ExpandableItem("Navcard Table", new ArrayList<>()));

        ArrayList<ExpandableItem> buriedBuildables = new ArrayList<>();
        buriedBuildables.add(new ExpandableItem("Trample Steam", new ArrayList<>()));
        buriedBuildables.add(new ExpandableItem("Turbine", new ArrayList<>()));
        buriedBuildables.add(new ExpandableItem("Subsurface Resonator", new ArrayList<>()));
        buriedBuildables.add(new ExpandableItem("Head Chopper", new ArrayList<>()));
        buriedBuildables.add(new ExpandableItem("Time Bomb", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.BURIED,
                new Map_OBJECT(
                        Enums.COD_MAP.BURIED.toString(),
                        R.drawable.buried_boii,
                        buriedMainQuest,
                        buriedSideQuests,
                        buriedBuildables,
                        false
                )
        );

        ArrayList<ExpandableItem> originsMainQuest = new ArrayList<>();
        originsMainQuest.add(new ExpandableItem("Little Lost Girl Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> originsSideQuests = new ArrayList<>();
        originsSideQuests.add(new ExpandableItem("Song - Archangel", new ArrayList<>()));
        originsSideQuests.add(new ExpandableItem("Maxis/Staff Chamber Radios", new ArrayList<>()));
        originsSideQuests.add(new ExpandableItem("Giant Robots", new ArrayList<>()));
        originsSideQuests.add(new ExpandableItem("Challenges (Generators, Box, Headshots)", new ArrayList<>()));
        originsSideQuests.add(new ExpandableItem("Panzer Soldat Event", new ArrayList<>()));

        ArrayList<ExpandableItem> originsBuildables = new ArrayList<>();
        originsBuildables.add(new ExpandableItem("Elemental Staffs (4 + Upgrades)", new ArrayList<>()));
        originsBuildables.add(new ExpandableItem("Maxis Drone", new ArrayList<>()));
        originsBuildables.add(new ExpandableItem("One Inch Punch / Iron Fist", new ArrayList<>()));
        originsBuildables.add(new ExpandableItem("Generators System", new ArrayList<>()));
        originsBuildables.add(new ExpandableItem("Tank Vehicle", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.ORIGINS,
                new Map_OBJECT(
                        Enums.COD_MAP.ORIGINS.toString(),
                        R.drawable.origins_boii,
                        originsMainQuest,
                        originsSideQuests,
                        originsBuildables,
                        false
                )
        );
        return mapObjects;
    }
}
