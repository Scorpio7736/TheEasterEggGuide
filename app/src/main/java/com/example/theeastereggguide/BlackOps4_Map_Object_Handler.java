package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlackOps4_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops 4 --------------------------

        ArrayList<ExpandableItem> ixMainQuest = new ArrayList<>();
        ixMainQuest.add(new ExpandableItem("Viking Funeral Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> ixSideQuests = new ArrayList<>();
        ixSideQuests.add(new ExpandableItem("Song - Mad Hatter", new ArrayList<>()));
        ixSideQuests.add(new ExpandableItem("Shield Upgrade Quest", new ArrayList<>()));
        ixSideQuests.add(new ExpandableItem("Free Perk Side EE", new ArrayList<>()));
        ixSideQuests.add(new ExpandableItem("Viking Funeral Pyre EE", new ArrayList<>()));

        ArrayList<ExpandableItem> ixBuildables = new ArrayList<>();
        ixBuildables.add(new ExpandableItem("Death of Orion", new ArrayList<>()));
        ixBuildables.add(new ExpandableItem("Brazen Bull Shield", new ArrayList<>()));
        ixBuildables.add(new ExpandableItem("Challenge Banners", new ArrayList<>()));
        ixBuildables.add(new ExpandableItem("Gong/Drum System", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.IX,
                new Map_OBJECT(
                        Enums.COD_MAP.IX.toString(),
                        R.drawable.ix_boiiii,
                        ixMainQuest,
                        ixSideQuests,
                        ixBuildables,
                        "https://www.youtube.com/watch?v=Vi-FfUSUaAM&rco=1"
                )
        );

        ArrayList<ExpandableItem> vodMainQuest = new ArrayList<>();
        vodMainQuest.add(new ExpandableItem("The Final Stop Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> vodSideQuests = new ArrayList<>();
        vodSideQuests.add(new ExpandableItem("Song - Drowning", new ArrayList<>()));
        vodSideQuests.add(new ExpandableItem("Sentinel Artifact EE", new ArrayList<>()));
        vodSideQuests.add(new ExpandableItem("Clock Time Change EE", new ArrayList<>()));
        vodSideQuests.add(new ExpandableItem("Pack-a-Punch Upgrade Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> vodBuildables = new ArrayList<>();
        vodBuildables.add(new ExpandableItem("Kraken Wonder Weapon", new ArrayList<>()));
        vodBuildables.add(new ExpandableItem("Ballistic Shield", new ArrayList<>()));
        vodBuildables.add(new ExpandableItem("Stoker's Key / Sentinel Artifact", new ArrayList<>()));
        vodBuildables.add(new ExpandableItem("Elemental Kraken Upgrades", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.VOYAGE_OF_DESPAIR,
                new Map_OBJECT(
                        Enums.COD_MAP.VOYAGE_OF_DESPAIR.toString(),
                        R.drawable.voyageofdespair_boiiii,
                        vodMainQuest,
                        vodSideQuests,
                        vodBuildables,
                        "https://www.youtube.com/watch?v=ffvg7cR68-Q&rco=1"
                )
        );

        ArrayList<ExpandableItem> botdMainQuest = new ArrayList<>();
        botdMainQuest.add(new ExpandableItem("A Cursed Soul Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> botdSideQuests = new ArrayList<>();
        botdSideQuests.add(new ExpandableItem("Song - Where Are We Going (Remix)", new ArrayList<>()));
        botdSideQuests.add(new ExpandableItem("Golden Spork / Sporknife EE", new ArrayList<>()));
        botdSideQuests.add(new ExpandableItem("Free Blundergat EE", new ArrayList<>()));
        botdSideQuests.add(new ExpandableItem("Magmagat Upgrade Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> botdBuildables = new ArrayList<>();
        botdBuildables.add(new ExpandableItem("Spectral Shield", new ArrayList<>()));
        botdBuildables.add(new ExpandableItem("Acidgat / Magmagat", new ArrayList<>()));
        botdBuildables.add(new ExpandableItem("Hell's Retriever / Redeemer", new ArrayList<>()));
        botdBuildables.add(new ExpandableItem("Warden's Office / House", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.BLOOD_OF_THE_DEAD,
                new Map_OBJECT(
                        Enums.COD_MAP.BLOOD_OF_THE_DEAD.toString(),
                        R.drawable.botd_boiiii,
                        botdMainQuest,
                        botdSideQuests,
                        botdBuildables,
                        "https://www.youtube.com/watch?v=lNSL5IbA_4Y&rco=1"
                )
        );

        ArrayList<ExpandableItem> classifiedMainQuest = new ArrayList<>();
        classifiedMainQuest.add(new ExpandableItem("Project Skadi Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> classifiedSideQuests = new ArrayList<>();
        classifiedSideQuests.add(new ExpandableItem("Song - Shockwave", new ArrayList<>()));
        classifiedSideQuests.add(new ExpandableItem("Free Winter's Howl EE", new ArrayList<>()));
        classifiedSideQuests.add(new ExpandableItem("Groom Lake Transmission EE", new ArrayList<>()));
        classifiedSideQuests.add(new ExpandableItem("Groom Lake Documents EE", new ArrayList<>()));

        ArrayList<ExpandableItem> classifiedBuildables = new ArrayList<>();
        classifiedBuildables.add(new ExpandableItem("Winter's Howl", new ArrayList<>()));
        classifiedBuildables.add(new ExpandableItem("Teleporter System", new ArrayList<>()));
        classifiedBuildables.add(new ExpandableItem("Nova 6 Crawlers", new ArrayList<>()));
        classifiedBuildables.add(new ExpandableItem("Pack-a-Punch Access", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.CLASSIFIED,
                new Map_OBJECT(
                        Enums.COD_MAP.CLASSIFIED.toString(),
                        R.drawable.classified_boiiii,
                        classifiedMainQuest,
                        classifiedSideQuests,
                        classifiedBuildables,
                        "https://www.youtube.com/watch?v=Qo5r89mlnh0"
                )
        );

        ArrayList<ExpandableItem> dotnMainQuest = new ArrayList<>();
        dotnMainQuest.add(new ExpandableItem("The Alistair's Folly Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> dotnSideQuests = new ArrayList<>();
        dotnSideQuests.add(new ExpandableItem("Song - Mystery", new ArrayList<>()));
        dotnSideQuests.add(new ExpandableItem("Savage Impaler Upgrade Quest", new ArrayList<>()));
        dotnSideQuests.add(new ExpandableItem("Free Silver Bullets EE", new ArrayList<>()));
        dotnSideQuests.add(new ExpandableItem("Knight Boss Fight EE", new ArrayList<>()));

        ArrayList<ExpandableItem> dotnBuildables = new ArrayList<>();
        dotnBuildables.add(new ExpandableItem("Alistair's Folly", new ArrayList<>()));
        dotnBuildables.add(new ExpandableItem("Chaos Theory", new ArrayList<>()));
        dotnBuildables.add(new ExpandableItem("Silver Bullets", new ArrayList<>()));
        dotnBuildables.add(new ExpandableItem("Stake Knife", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.DEAD_OF_THE_NIGHT,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OF_THE_NIGHT.toString(),
                        R.drawable.dotn_boiiii,
                        dotnMainQuest,
                        dotnSideQuests,
                        dotnBuildables,
                        "https://www.youtube.com/watch?v=ISZs847uoMg"
                )
        );

        ArrayList<ExpandableItem> aeMainQuest = new ArrayList<>();
        aeMainQuest.add(new ExpandableItem("The Spear of Destiny Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> aeSideQuests = new ArrayList<>();
        aeSideQuests.add(new ExpandableItem("Song - Stormbound", new ArrayList<>()));
        aeSideQuests.add(new ExpandableItem("Pegasus Strike Upgrade Quest", new ArrayList<>()));
        aeSideQuests.add(new ExpandableItem("God Hand Upgrade Quests", new ArrayList<>()));
        aeSideQuests.add(new ExpandableItem("Oracle Tribute EE", new ArrayList<>()));

        ArrayList<ExpandableItem> aeBuildables = new ArrayList<>();
        aeBuildables.add(new ExpandableItem("God Hands (4 Variants)", new ArrayList<>()));
        aeBuildables.add(new ExpandableItem("Pegasus Strike", new ArrayList<>()));
        aeBuildables.add(new ExpandableItem("Oracle's Amphitheater", new ArrayList<>()));
        aeBuildables.add(new ExpandableItem("Apollo's Will", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.ANCIENT_EVIL,
                new Map_OBJECT(
                        Enums.COD_MAP.ANCIENT_EVIL.toString(),
                        R.drawable.ancientevil_boiiii,
                        aeMainQuest,
                        aeSideQuests,
                        aeBuildables,
                        "https://www.youtube.com/watch?v=8ClZC3GDU6w&rco=1"
                )
        );

        ArrayList<ExpandableItem> aoMainQuest = new ArrayList<>();
        aoMainQuest.add(new ExpandableItem("The Beginning of the End Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> aoSideQuests = new ArrayList<>();
        aoSideQuests.add(new ExpandableItem("Song - I Am the Well", new ArrayList<>()));
        aoSideQuests.add(new ExpandableItem("Ray Gun Mk. II Upgrade Quests", new ArrayList<>()));
        aoSideQuests.add(new ExpandableItem("Rushmore Code EE", new ArrayList<>()));
        aoSideQuests.add(new ExpandableItem("Mannequin EE", new ArrayList<>()));

        ArrayList<ExpandableItem> aoBuildables = new ArrayList<>();
        aoBuildables.add(new ExpandableItem("Ray Gun Mk. II (4 Variants)", new ArrayList<>()));
        aoBuildables.add(new ExpandableItem("Elemental Ray Guns", new ArrayList<>()));
        aoBuildables.add(new ExpandableItem("Rushmore (A.I.)", new ArrayList<>()));
        aoBuildables.add(new ExpandableItem("Telepads", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.ALPHA_OMEGA,
                new Map_OBJECT(
                        Enums.COD_MAP.ALPHA_OMEGA.toString(),
                        R.drawable.alphaomega_boiiii,
                        aoMainQuest,
                        aoSideQuests,
                        aoBuildables,
                        "https://www.youtube.com/watch?v=0q0ZZXrErf8"
                )
        );

        ArrayList<ExpandableItem> tdtMainQuest = new ArrayList<>();
        tdtMainQuest.add(new ExpandableItem("Salvation Lies Above Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> tdtSideQuests = new ArrayList<>();
        tdtSideQuests.add(new ExpandableItem("Song - A Light from the Shore", new ArrayList<>()));
        tdtSideQuests.add(new ExpandableItem("Wunderwaffe DG-Scharfschütze Upgrade", new ArrayList<>()));
        tdtSideQuests.add(new ExpandableItem("Golden Pack-a-Punch EE", new ArrayList<>()));
        tdtSideQuests.add(new ExpandableItem("Secret Facility EE", new ArrayList<>()));

        ArrayList<ExpandableItem> tdtBuildables = new ArrayList<>();
        tdtBuildables.add(new ExpandableItem("Tundra Gun", new ArrayList<>()));
        tdtBuildables.add(new ExpandableItem("Zipline Network", new ArrayList<>()));
        tdtBuildables.add(new ExpandableItem("Dynamite Bombs", new ArrayList<>()));
        tdtBuildables.add(new ExpandableItem("Golden Pack-a-Punch", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.TAG_DER_TOTEN,
                new Map_OBJECT(
                        Enums.COD_MAP.TAG_DER_TOTEN.toString(),
                        R.drawable.tagdertoten_boiiii,
                        tdtMainQuest,
                        tdtSideQuests,
                        tdtBuildables,
                        "https://www.youtube.com/watch?v=fYou_KHcvbQ"
                )
        );

        ArrayList<ExpandableItem> doa3MainQuest = new ArrayList<>();
        doa3MainQuest.add(new ExpandableItem("Defeat the Mamaback Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> doa3SideQuests = new ArrayList<>();
        doa3SideQuests.add(new ExpandableItem("Advanced Start Locations EE", new ArrayList<>()));
        doa3SideQuests.add(new ExpandableItem("Donut Trial EE", new ArrayList<>()));
        doa3SideQuests.add(new ExpandableItem("Secret Treasure Rooms EE", new ArrayList<>()));
        doa3SideQuests.add(new ExpandableItem("Bonus Round EE", new ArrayList<>()));

        ArrayList<ExpandableItem> doa3Buildables = new ArrayList<>();
        doa3Buildables.add(new ExpandableItem("Fates", new ArrayList<>()));
        doa3Buildables.add(new ExpandableItem("Divine Shield", new ArrayList<>()));
        doa3Buildables.add(new ExpandableItem("Wildcards", new ArrayList<>()));
        doa3Buildables.add(new ExpandableItem("Power-Ups", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.DEAD_OPS_ARCADE_3,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OPS_ARCADE_3.toString(),
                        R.drawable.deadopsarcade_boiiii,
                        doa3MainQuest,
                        doa3SideQuests,
                        doa3Buildables,
                        "https://www.youtube.com/watch?v=U7fYWjejJYk"
                )
        );

        return mapObjects;
    }
}
