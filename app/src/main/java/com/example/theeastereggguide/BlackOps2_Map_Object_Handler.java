package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlackOps2_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops II --------------------------

        mapObjects.put(
                Enums.COD_MAP.TRANZIT,
                new Map_OBJECT(
                        Enums.COD_MAP.TRANZIT.toString(),
                        R.drawable.tranzit_boii,
                        new ArrayList<>(Collections.singletonList(
                                "Tower of Babble Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Bus Parts",
                                "Song - Carrion",
                                "Nacht der Untoten Hidden Area",
                                "Denizen Teleporters",
                                "TV Tower Morse/Event"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Turbine",
                                "Zombie Shield",
                                "Jet Gun - Thrustodyne Aeronautics Model 23",
                                "Electric Trap",
                                "Turret Trap"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.TOWN,
                new Map_OBJECT(
                        Enums.COD_MAP.TOWN.toString(),
                        R.drawable.town_boii,
                        new ArrayList<>(Collections.singletonList("None")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Carrion (shared with TranZit)",
                                "Lava Challenges"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Pack A Punch",
                                "Lava Hazards",
                                "Wall Weapons"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.FARM,
                new Map_OBJECT(
                        Enums.COD_MAP.FARM.toString(),
                        R.drawable.farm_boii,
                        new ArrayList<>(Collections.singletonList("None")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Carrion (shared)",
                                "Cornfield Secrets"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Wall Weapons",
                                "Lava Hazards"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.BUS_DEPOT,
                new Map_OBJECT(
                        Enums.COD_MAP.BUS_DEPOT.toString(),
                        R.drawable.busdepot_boii,
                        new ArrayList<>(Collections.singletonList("None")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Carrion (shared)",
                                "No Perks Challenge"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Wall Weapons",
                                "Lava Hazards"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.NUKETOWN_ZOMBIES,
                new Map_OBJECT(
                        Enums.COD_MAP.NUKETOWN_ZOMBIES.toString(),
                        R.drawable.nuketown_boii,
                        new ArrayList<>(Collections.singletonList("None")),
                        new ArrayList<>(Arrays.asList(
                                "Song - She’s Not There",
                                "Randomized Perk Drops",
                                "Round-Based Nuke Events",
                                "Population Counter"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Randomized Perk Machines",
                                "Pack A Punch",
                                "Nuke Collapse Event"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DIE_RISE,
                new Map_OBJECT(
                        Enums.COD_MAP.DIE_RISE.toString(),
                        R.drawable.dierise_boii,
                        new ArrayList<>(Collections.singletonList(
                                "High Maintenance Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - We All Fall Down",
                                "Jumping Jacks Free Perk",
                                "Elevator Key",
                                "TV/Radio Messages"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Sliquifier",
                                "Trample Steam",
                                "Navcard Table",
                                "Random Elevator System"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.MOB_OF_THE_DEAD,
                new Map_OBJECT(
                        Enums.COD_MAP.MOB_OF_THE_DEAD.toString(),
                        R.drawable.motd_boii,
                        new ArrayList<>(Collections.singletonList(
                                "Pop Goes the Weasel Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Rusty Cage",
                                "Afterlife Puzzles",
                                "Skull Locations",
                                "Plane Part Fetch Quest",
                                "Golden Spork Challenge"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Acid Gat Kit",
                                "Plane to Golden Gate Bridge",
                                "Hell’s Retriever/Hell’s Redeemer",
                                "Shield Buildable"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.BURIED,
                new Map_OBJECT(
                        Enums.COD_MAP.BURIED.toString(),
                        R.drawable.buried_boii,
                        new ArrayList<>(Collections.singletonList(
                                "Mined Games Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Always Running",
                                "Leroy Tasks",
                                "Witch Maze",
                                "Free Perk from Witches",
                                "Navcard Table"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Trample Steam",
                                "Turbine",
                                "Subsurface Resonator",
                                "Head Chopper",
                                "Time Bomb"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.ORIGINS,
                new Map_OBJECT(
                        Enums.COD_MAP.ORIGINS.toString(),
                        R.drawable.origins_boii,
                        new ArrayList<>(Collections.singletonList(
                                "Little Lost Girl Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Archangel",
                                "Maxis/Staff Chamber Radios",
                                "Giant Robots",
                                "Challenges (Generators, Box, Headshots)",
                                "Panzer Soldat Event"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Elemental Staffs (4 + Upgrades)",
                                "Maxis Drone",
                                "One Inch Punch / Iron Fist",
                                "Generators System",
                                "Tank Vehicle"
                        ))
                )
        );
        return mapObjects;
    }
}
