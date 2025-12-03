package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlackOps1_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops I --------------------------

        mapObjects.put(
                Enums.COD_MAP.MOON,
                new Map_OBJECT(
                        Enums.COD_MAP.MOON.toString(),
                        R.drawable.moon_boi,
                        new ArrayList<>(Collections.singletonList("Cryogenic Slumber Party")),
                        new ArrayList<>(Collections.singletonList(
                                "Pack A Punch"
                        )),
                        new ArrayList<>(Collections.singletonList("None"))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.SHANGRI_LA,
                new Map_OBJECT(
                        Enums.COD_MAP.SHANGRI_LA.toString(),
                        R.drawable.shangrila_boi,
                        new ArrayList<>(Collections.singletonList("Time Travel Will Tell")),
                        new ArrayList<>(Arrays.asList(
                                "Brock and Gary Radio Messages",
                                "Monkey Bomb Easter Egg",
                                "Song - Pareidolia",
                                "Pack A Punch"
                        )),
                        new ArrayList<>(Collections.singletonList("None"))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.KINO_DER_TOTEN,
                new Map_OBJECT(
                        Enums.COD_MAP.KINO_DER_TOTEN.toString(),
                        R.drawable.kinodertoten_boi,
                        new ArrayList<>(Collections.singletonList("Film Reel Story Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - 115",
                                "Radios",
                                "Teddy Bears",
                                "Projector",
                                "Clock",
                                "Pack A Punch"
                        )),
                        new ArrayList<>(Collections.singletonList("None"))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.FIVE,
                new Map_OBJECT(
                        Enums.COD_MAP.FIVE.toString(),
                        R.drawable.five_boi,
                        new ArrayList<>(Collections.singletonList("None")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Won't Back Down",
                                "The Pig",
                                "Pack A Punch"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Electric Trap",
                                "Teleporter Network",
                                "Auto-Turret"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.ASCENSION,
                new Map_OBJECT(
                        Enums.COD_MAP.ASCENSION.toString(),
                        R.drawable.ascension_boi,
                        new ArrayList<>(Collections.singletonList(
                                "Ascension Main Quest - Lunar Lander Rocket Launch"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Pareidolia",
                                "Gersch Device EE Steps",
                                "Free Perk from Space Monkeys",
                                "Radio Messages"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Lunar Landers",
                                "Pack A Punch",
                                "Rocket Launch Sequence"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.CALL_OF_THE_DEAD,
                new Map_OBJECT(
                        Enums.COD_MAP.CALL_OF_THE_DEAD.toString(),
                        R.drawable.cotd_boi,
                        new ArrayList<>(Collections.singletonList(
                                "Stand-In Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Not Ready to Die",
                                "Hidden Radios",
                                "Golden Rod Quest Steps",
                                "Fog Horn Easter Egg"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Pack A Punch Lighthouse",
                                "Zipline",
                                "Flinger",
                                "V-R11 Wonder Weapon"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DEAD_OPS_ARCADE,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OPS_ARCADE.toString(),
                        R.drawable.deadopsarcade_boi,
                        new ArrayList<>(Collections.singletonList(
                                "None"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Top-Down Arcade Shooter Mode",
                                "Silverback Storyline",
                                "Bonus Rooms",
                                "Hidden Fate Rooms"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "First-Person Powerup",
                                "Vehicle Powerups",
                                "Gem Scoring System",
                                "Special Weapons Drops"
                        ))
                )
        );
        return mapObjects;
    }
}
