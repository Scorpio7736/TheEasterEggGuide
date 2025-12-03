package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlackOps3_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops III --------------------------

        mapObjects.put(
                Enums.COD_MAP.SHADOWS_OF_EVIL,
                new Map_OBJECT(
                        Enums.COD_MAP.SHADOWS_OF_EVIL.toString(),
                        R.drawable.soe_boiii,
                        new ArrayList<>(Arrays.asList(
                                "Main Quest - Sacrifice Rituals and Gateworms",
                                "Summoning the Apothicon and Shadowman Boss Fight"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Snakeskin Boots",
                                "Sword Upgrade Quest",
                                "Civil Protector Fuses",
                                "Flag Step Defense",
                                "Margwa Heart / Eggs Side Tasks"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Ritual Altars",
                                "Apothicon Servant",
                                "Civil Protector",
                                "Beast Mode Mechanic",
                                "Pack A Punch Rift"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.THE_GIANT,
                new Map_OBJECT(
                        Enums.COD_MAP.THE_GIANT.toString(),
                        R.drawable.thegiant_boiii,
                        new ArrayList<>(Collections.singletonList(
                                "Hidden Beacon Main Quest (Annihilator / Teleporter Panel Step)"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Beauty of Annihilation (Remix)",
                                "Fly Trap Easter Egg",
                                "Monkey Bomb Plinko",
                                "Secret Perk Easter Egg"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Teleporters",
                                "Pack A Punch",
                                "HV Flamethrower Trap Variant",
                                "Dog Rounds"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DER_EISENDRACHE,
                new Map_OBJECT(
                        Enums.COD_MAP.DER_EISENDRACHE.toString(),
                        R.drawable.de_boiii,
                        new ArrayList<>(Arrays.asList(
                                "My Brother's Keeper Main Quest",
                                "Keeper Boss Fight and Moon Destruction"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Dead Again",
                                "Wrath of the Ancients Upgrade Quests (4 Bows)",
                                "Ragnarok DG-4 Parts Quest",
                                "Plunger / Clock Side EE",
                                "Lava/Storm Rocket Pad Events"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Wrath of the Ancients Bow",
                                "Ragnarok DG-4",
                                "Wunderfizz",
                                "Anti-Gravity Room",
                                "Rocket Test Area"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.ZETSUBOU_NO_SHIMA,
                new Map_OBJECT(
                        Enums.COD_MAP.ZETSUBOU_NO_SHIMA.toString(),
                        R.drawable.zetsubounoshima_boiii,
                        new ArrayList<>(Arrays.asList(
                                "Seeds of Doubt / Division 9 Main Quest",
                                "Takeo's Ending and Spider Boss Fight"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Dead Flowers",
                                "KT-4 / Masamune Upgrade Quest",
                                "Skull of Nan Sapwe Trial",
                                "Spider Bait Side EE",
                                "Plant Mutations and Challenges"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "KT-4 / Masamune",
                                "Skull of Nan Sapwe",
                                "Shield Buildable",
                                "Gas Mask",
                                "Bucket / Water Irrigation System"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.GOROD_KROVI,
                new Map_OBJECT(
                        Enums.COD_MAP.GOROD_KROVI.toString(),
                        R.drawable.gorodkrovi_boiii,
                        new ArrayList<>(Arrays.asList(
                                "Love and War / Dragon Control Main Quest",
                                "Nikolai 1.0 Boss Fight"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Ace of Spades",
                                "Dragon Egg Challenge",
                                "Trials Board",
                                "Bomb Step Patterns",
                                "Sophia Drone Side EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Dragon Network / Ride System",
                                "Gauntlet of Siegfried",
                                "Shield (Dragon Shield)",
                                "Wrath of the Valkyrie / SOPHIA Systems",
                                "Pack A Punch on Dragon Command"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.REVELATIONS,
                new Map_OBJECT(
                        Enums.COD_MAP.REVELATIONS.toString(),
                        R.drawable.revelations_boiii,
                        new ArrayList<>(Arrays.asList(
                                "A Better Tomorrow Main Quest",
                                "Apothicon Interior and Shadowman Boss Fight"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - The Gift",
                                "Corruption Engine Rituals",
                                "Free Perk Side EE",
                                "Helmet / Mask Collection",
                                "Lil Arnie Upgrade Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Apothicon Servant Upgrade",
                                "Keeper Protector",
                                "Corruption Turrets",
                                "Multiple Classic Map Zones (Nacht, Kino, etc.)",
                                "Pack A Punch inside the Apothicon"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.NACHT_DER_UNTOTEN_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.NACHT_DER_UNTOTEN_ZC.toString(),
                        R.drawable.nacht_boiii,
                        new ArrayList<>(Arrays.asList(
                                "No Main Quest (Survival Map)"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Undone",
                                "Musical EE (3 Radios)",
                                "Rebuild Boards for Power-Ups"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "GobbleGums Added (ZC)",
                                "Wonderfizz Machine",
                                "Classic Mystery Box"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.VERRUCKT_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.VERRUCKT_ZC.toString(),
                        R.drawable.verruckt_boiii,
                        new ArrayList<>(Arrays.asList(
                                "No Main Quest (Survival Map)"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Lullaby for a Deadman",
                                "Easter Egg Radios",
                                "Power Switch Door Link"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Wonderfizz Machine",
                                "Traps",
                                "HVK Wallbuy Added (ZC)"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.SHI_NO_NUMA_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.SHI_NO_NUMA_ZC.toString(),
                        R.drawable.shinonuma_boiii,
                        new ArrayList<>(Arrays.asList(
                                "No Main Quest (Survival Flow)"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - The One",
                                "115 Rock EE",
                                "Flogger Trap EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Wonderfizz Machine",
                                "Random Perk Huts",
                                "Flogger Trap"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.KINO_DER_TOTEN_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.KINO_DER_TOTEN_ZC.toString(),
                        R.drawable.kinodertoten_boiii,
                        new ArrayList<>(Arrays.asList(
                                "No Main Quest (Story Ties in ZC)"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - 115",
                                "Reel Projector EE",
                                "Shootable Power-Up EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Buildable Shield (ZC)",
                                "Teleporter Pads",
                                "Trap Circuit"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.ASCENSION_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.ASCENSION_ZC.toString(),
                        R.drawable.ascension_boiii,
                        new ArrayList<>(Arrays.asList(
                                "Main Quest (Launch Rocket & Gersh EE)"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Pareidolia",
                                "Gersh Devices",
                                "Monkey Round EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Matryoshka Dolls",
                                "Lunar Lander System",
                                "Launch Pad Power"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.SHANGRI_LA_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.SHANGRI_LA_ZC.toString(),
                        R.drawable.shangrila_boiii,
                        new ArrayList<>(Arrays.asList(
                                "Time Travel Will Tell Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Pareidolia",
                                "Focusing Stone EE",
                                "Napalm & Shriekers"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "31-79 JGb215 (Baby Gun)",
                                "Water Slide",
                                "Minecart System"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.MOON_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.MOON_ZC.toString(),
                        R.drawable.moon_boiii,
                        new ArrayList<>(Arrays.asList(
                                "Richtofen's Grand Scheme Main Quest"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Coming Home",
                                "Hacker EE",
                                "Maxis Side Steps"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Wave Gun / Zap Guns",
                                "QED & Gersh Devices",
                                "Low Gravity Mechanics"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.ORIGINS_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.ORIGINS_ZC.toString(),
                        R.drawable.origins_boii,
                        new ArrayList<>(Arrays.asList(
                                "Little Lost Girl Main Quest",
                                "Free Samantha and Complete the Final Ritual"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Song - Archangel",
                                "Elemental Staff Upgrade Quests",
                                "Challenge Chest Rewards",
                                "Giant Robots Head EE",
                                "Maxis Drone Parts & Side EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Elemental Staffs (Fire, Ice, Lightning, Wind)",
                                "Maxis Drone",
                                "One Inch Punch / Iron Fists",
                                "Shield Buildable",
                                "Tank Path Access to Parts"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DEAD_OPS_ARCADE_2,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OPS_ARCADE_2.toString(),
                        R.drawable.deadopsarcade_boiii,
                        new ArrayList<>(Arrays.asList(
                                "Cosmic Silverback Main Quest",
                                "Escape the Island and Complete All Arenas"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Hidden Room EE",
                                "Fate & Fortune System",
                                "Boss Wave Challenges",
                                "8-Bit Retro Arcade Room",
                                "First Person Mode Power-Up"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Upgradable Weapons",
                                "Vehicle Power-Ups (Tank, Mech, Dragon)",
                                "Gem & Treasure System",
                                "Arena Progression Path",
                                "Friendship Bear Mechanic"
                        ))
                )
        );

        return mapObjects;
    }
}
