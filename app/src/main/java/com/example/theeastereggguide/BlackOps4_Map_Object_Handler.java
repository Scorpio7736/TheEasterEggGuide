package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlackOps4_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops 4 --------------------------

        mapObjects.put(
                Enums.COD_MAP.IX,
                new Map_OBJECT(
                        Enums.COD_MAP.IX.toString(),
                        R.drawable.ix_boiiii,
                        new ArrayList<>(Collections.singletonList("Viking Funeral Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Mad Hatter",
                                "Shield Upgrade Quest",
                                "Free Perk Side EE",
                                "Viking Funeral Pyre EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Death of Orion",
                                "Brazen Bull Shield",
                                "Challenge Banners",
                                "Gong/Drum System"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.VOYAGE_OF_DESPAIR,
                new Map_OBJECT(
                        Enums.COD_MAP.VOYAGE_OF_DESPAIR.toString(),
                        R.drawable.voyageofdespair_boiiii,
                        new ArrayList<>(Collections.singletonList("The Final Stop Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Drowning",
                                "Sentinel Artifact EE",
                                "Clock Time Change EE",
                                "Pack-a-Punch Upgrade Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Kraken Wonder Weapon",
                                "Ballistic Shield",
                                "Stoker's Key / Sentinel Artifact",
                                "Elemental Kraken Upgrades"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.BLOOD_OF_THE_DEAD,
                new Map_OBJECT(
                        Enums.COD_MAP.BLOOD_OF_THE_DEAD.toString(),
                        R.drawable.botd_boiiii,
                        new ArrayList<>(Collections.singletonList("A Cursed Soul Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Where Are We Going (Remix)",
                                "Golden Spork / Sporknife EE",
                                "Free Blundergat EE",
                                "Magmagat Upgrade Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Spectral Shield",
                                "Acidgat / Magmagat",
                                "Hell's Retriever / Redeemer",
                                "Warden's Office / House"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.CLASSIFIED,
                new Map_OBJECT(
                        Enums.COD_MAP.CLASSIFIED.toString(),
                        R.drawable.classified_boiiii,
                        new ArrayList<>(Collections.singletonList("Project Skadi Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Shockwave",
                                "Free Winter's Howl EE",
                                "Groom Lake Transmission EE",
                                "Groom Lake Documents EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Winter's Howl",
                                "Teleporter System",
                                "Nova 6 Crawlers",
                                "Pack-a-Punch Access"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DEAD_OF_THE_NIGHT,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OF_THE_NIGHT.toString(),
                        R.drawable.dotn_boiiii,
                        new ArrayList<>(Collections.singletonList("The Alistair's Folly Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Mystery",
                                "Savage Impaler Upgrade Quest",
                                "Free Silver Bullets EE",
                                "Knight Boss Fight EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Alistair's Folly",
                                "Chaos Theory",
                                "Silver Bullets",
                                "Stake Knife"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.ANCIENT_EVIL,
                new Map_OBJECT(
                        Enums.COD_MAP.ANCIENT_EVIL.toString(),
                        R.drawable.ancientevil_boiiii,
                        new ArrayList<>(Collections.singletonList("The Spear of Destiny Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Stormbound",
                                "Pegasus Strike Upgrade Quest",
                                "God Hand Upgrade Quests",
                                "Oracle Tribute EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "God Hands (4 Variants)",
                                "Pegasus Strike",
                                "Oracle's Amphitheater",
                                "Apollo's Will"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.ALPHA_OMEGA,
                new Map_OBJECT(
                        Enums.COD_MAP.ALPHA_OMEGA.toString(),
                        R.drawable.alphaomega_boiiii,
                        new ArrayList<>(Collections.singletonList("The Beginning of the End Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - I Am the Well",
                                "Ray Gun Mk. II Upgrade Quests",
                                "Rushmore Code EE",
                                "Mannequin EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Ray Gun Mk. II (4 Variants)",
                                "Elemental Ray Guns",
                                "Rushmore (A.I.)",
                                "Telepads"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.TAG_DER_TOTEN,
                new Map_OBJECT(
                        Enums.COD_MAP.TAG_DER_TOTEN.toString(),
                        R.drawable.tagdertoten_boiiii,
                        new ArrayList<>(Collections.singletonList("Salvation Lies Above Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - A Light from the Shore",
                                "Wunderwaffe DG-Scharfschütze Upgrade",
                                "Golden Pack-a-Punch EE",
                                "Secret Facility EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Tundra Gun",
                                "Zipline Network",
                                "Dynamite Bombs",
                                "Golden Pack-a-Punch"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DEAD_OPS_ARCADE_3,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OPS_ARCADE_3.toString(),
                        R.drawable.deadopsarcade_boiiii,
                        new ArrayList<>(Collections.singletonList("Defeat the Mamaback Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Advanced Start Locations EE",
                                "Donut Trial EE",
                                "Secret Treasure Rooms EE",
                                "Bonus Round EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Fates",
                                "Divine Shield",
                                "Wildcards",
                                "Power-Ups"
                        ))
                )
        );

        return mapObjects;
    }
}
