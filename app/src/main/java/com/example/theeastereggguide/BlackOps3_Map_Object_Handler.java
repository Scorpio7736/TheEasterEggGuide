package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlackOps3_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops III --------------------------

        ArrayList<ExpandableItem> soeMainQuest = new ArrayList<>();
        soeMainQuest.add(new ExpandableItem("Main Quest - Sacrifice Rituals and Gateworms", new ArrayList<>()));
        soeMainQuest.add(new ExpandableItem("Summoning the Apothicon and Shadowman Boss Fight", new ArrayList<>()));

        ArrayList<ExpandableItem> soeSideQuests = new ArrayList<>();
        soeSideQuests.add(new ExpandableItem("Song - Snakeskin Boots", new ArrayList<>()));
        soeSideQuests.add(new ExpandableItem("Sword Upgrade Quest", new ArrayList<>()));
        soeSideQuests.add(new ExpandableItem("Civil Protector Fuses", new ArrayList<>()));
        soeSideQuests.add(new ExpandableItem("Flag Step Defense", new ArrayList<>()));
        soeSideQuests.add(new ExpandableItem("Margwa Heart / Eggs Side Tasks", new ArrayList<>()));

        ArrayList<ExpandableItem> soeBuildables = new ArrayList<>();
        soeBuildables.add(new ExpandableItem("Ritual Altars", new ArrayList<>()));
        soeBuildables.add(new ExpandableItem("Apothicon Servant", new ArrayList<>()));
        soeBuildables.add(new ExpandableItem("Civil Protector", new ArrayList<>()));
        soeBuildables.add(new ExpandableItem("Beast Mode Mechanic", new ArrayList<>()));
        soeBuildables.add(new ExpandableItem("Pack A Punch Rift", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.SHADOWS_OF_EVIL,
                new Map_OBJECT(
                        Enums.COD_MAP.SHADOWS_OF_EVIL.toString(),
                        R.drawable.soe_boiii,
                        soeMainQuest,
                        soeSideQuests,
                        soeBuildables
                )
        );

        ArrayList<ExpandableItem> giantMainQuest = new ArrayList<>();
        giantMainQuest.add(new ExpandableItem("Hidden Beacon Main Quest (Annihilator / Teleporter Panel Step)", new ArrayList<>()));

        ArrayList<ExpandableItem> giantSideQuests = new ArrayList<>();
        giantSideQuests.add(new ExpandableItem("Song - Beauty of Annihilation (Remix)", new ArrayList<>()));
        giantSideQuests.add(new ExpandableItem("Fly Trap Easter Egg", new ArrayList<>()));
        giantSideQuests.add(new ExpandableItem("Monkey Bomb Plinko", new ArrayList<>()));
        giantSideQuests.add(new ExpandableItem("Secret Perk Easter Egg", new ArrayList<>()));

        ArrayList<ExpandableItem> giantBuildables = new ArrayList<>();
        giantBuildables.add(new ExpandableItem("Teleporters", new ArrayList<>()));
        giantBuildables.add(new ExpandableItem("Pack A Punch", new ArrayList<>()));
        giantBuildables.add(new ExpandableItem("HV Flamethrower Trap Variant", new ArrayList<>()));
        giantBuildables.add(new ExpandableItem("Dog Rounds", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.THE_GIANT,
                new Map_OBJECT(
                        Enums.COD_MAP.THE_GIANT.toString(),
                        R.drawable.thegiant_boiii,
                        giantMainQuest,
                        giantSideQuests,
                        giantBuildables
                )
        );

        ArrayList<ExpandableItem> deMainQuest = new ArrayList<>();
        deMainQuest.add(new ExpandableItem("My Brother's Keeper Main Quest", new ArrayList<>()));
        deMainQuest.add(new ExpandableItem("Keeper Boss Fight and Moon Destruction", new ArrayList<>()));

        ArrayList<ExpandableItem> deSideQuests = new ArrayList<>();
        deSideQuests.add(new ExpandableItem("Song - Dead Again", new ArrayList<>()));
        deSideQuests.add(new ExpandableItem("Wrath of the Ancients Upgrade Quests (4 Bows)", new ArrayList<>()));
        deSideQuests.add(new ExpandableItem("Ragnarok DG-4 Parts Quest", new ArrayList<>()));
        deSideQuests.add(new ExpandableItem("Plunger / Clock Side EE", new ArrayList<>()));
        deSideQuests.add(new ExpandableItem("Lava/Storm Rocket Pad Events", new ArrayList<>()));

        ArrayList<ExpandableItem> deBuildables = new ArrayList<>();
        deBuildables.add(new ExpandableItem("Wrath of the Ancients Bow", new ArrayList<>()));
        deBuildables.add(new ExpandableItem("Ragnarok DG-4", new ArrayList<>()));
        deBuildables.add(new ExpandableItem("Wunderfizz", new ArrayList<>()));
        deBuildables.add(new ExpandableItem("Anti-Gravity Room", new ArrayList<>()));
        deBuildables.add(new ExpandableItem("Rocket Test Area", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.DER_EISENDRACHE,
                new Map_OBJECT(
                        Enums.COD_MAP.DER_EISENDRACHE.toString(),
                        R.drawable.de_boiii,
                        deMainQuest,
                        deSideQuests,
                        deBuildables
                )
        );

        ArrayList<ExpandableItem> znsMainQuest = new ArrayList<>();
        znsMainQuest.add(new ExpandableItem("Seeds of Doubt / Division 9 Main Quest", new ArrayList<>()));
        znsMainQuest.add(new ExpandableItem("Takeo's Ending and Spider Boss Fight", new ArrayList<>()));

        ArrayList<ExpandableItem> znsSideQuests = new ArrayList<>();
        znsSideQuests.add(new ExpandableItem("Song - Dead Flowers", new ArrayList<>()));
        znsSideQuests.add(new ExpandableItem("KT-4 / Masamune Upgrade Quest", new ArrayList<>()));
        znsSideQuests.add(new ExpandableItem("Skull of Nan Sapwe Trial", new ArrayList<>()));
        znsSideQuests.add(new ExpandableItem("Spider Bait Side EE", new ArrayList<>()));
        znsSideQuests.add(new ExpandableItem("Plant Mutations and Challenges", new ArrayList<>()));

        ArrayList<ExpandableItem> znsBuildables = new ArrayList<>();
        znsBuildables.add(new ExpandableItem("KT-4 / Masamune", new ArrayList<>()));
        znsBuildables.add(new ExpandableItem("Skull of Nan Sapwe", new ArrayList<>()));
        znsBuildables.add(new ExpandableItem("Shield Buildable", new ArrayList<>()));
        znsBuildables.add(new ExpandableItem("Gas Mask", new ArrayList<>()));
        znsBuildables.add(new ExpandableItem("Bucket / Water Irrigation System", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.ZETSUBOU_NO_SHIMA,
                new Map_OBJECT(
                        Enums.COD_MAP.ZETSUBOU_NO_SHIMA.toString(),
                        R.drawable.zetsubounoshima_boiii,
                        znsMainQuest,
                        znsSideQuests,
                        znsBuildables
                )
        );

        ArrayList<ExpandableItem> gkMainQuest = new ArrayList<>();
        gkMainQuest.add(new ExpandableItem("Love and War / Dragon Control Main Quest", new ArrayList<>()));
        gkMainQuest.add(new ExpandableItem("Nikolai 1.0 Boss Fight", new ArrayList<>()));

        ArrayList<ExpandableItem> gkSideQuests = new ArrayList<>();
        gkSideQuests.add(new ExpandableItem("Song - Ace of Spades", new ArrayList<>()));
        gkSideQuests.add(new ExpandableItem("Dragon Egg Challenge", new ArrayList<>()));
        gkSideQuests.add(new ExpandableItem("Trials Board", new ArrayList<>()));
        gkSideQuests.add(new ExpandableItem("Bomb Step Patterns", new ArrayList<>()));
        gkSideQuests.add(new ExpandableItem("Sophia Drone Side EE", new ArrayList<>()));

        ArrayList<ExpandableItem> gkBuildables = new ArrayList<>();
        gkBuildables.add(new ExpandableItem("Dragon Network / Ride System", new ArrayList<>()));
        gkBuildables.add(new ExpandableItem("Gauntlet of Siegfried", new ArrayList<>()));
        gkBuildables.add(new ExpandableItem("Shield (Dragon Shield)", new ArrayList<>()));
        gkBuildables.add(new ExpandableItem("Wrath of the Valkyrie / SOPHIA Systems", new ArrayList<>()));
        gkBuildables.add(new ExpandableItem("Pack A Punch on Dragon Command", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.GOROD_KROVI,
                new Map_OBJECT(
                        Enums.COD_MAP.GOROD_KROVI.toString(),
                        R.drawable.gorodkrovi_boiii,
                        gkMainQuest,
                        gkSideQuests,
                        gkBuildables
                )
        );

        ArrayList<ExpandableItem> revMainQuest = new ArrayList<>();
        revMainQuest.add(new ExpandableItem("A Better Tomorrow Main Quest", new ArrayList<>()));
        revMainQuest.add(new ExpandableItem("Apothicon Interior and Shadowman Boss Fight", new ArrayList<>()));

        ArrayList<ExpandableItem> revSideQuests = new ArrayList<>();
        revSideQuests.add(new ExpandableItem("Song - The Gift", new ArrayList<>()));
        revSideQuests.add(new ExpandableItem("Corruption Engine Rituals", new ArrayList<>()));
        revSideQuests.add(new ExpandableItem("Free Perk Side EE", new ArrayList<>()));
        revSideQuests.add(new ExpandableItem("Helmet / Mask Collection", new ArrayList<>()));
        revSideQuests.add(new ExpandableItem("Lil Arnie Upgrade Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> revBuildables = new ArrayList<>();
        revBuildables.add(new ExpandableItem("Apothicon Servant Upgrade", new ArrayList<>()));
        revBuildables.add(new ExpandableItem("Keeper Protector", new ArrayList<>()));
        revBuildables.add(new ExpandableItem("Corruption Turrets", new ArrayList<>()));
        revBuildables.add(new ExpandableItem("Multiple Classic Map Zones (Nacht, Kino, etc.)", new ArrayList<>()));
        revBuildables.add(new ExpandableItem("Pack A Punch inside the Apothicon", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.REVELATIONS,
                new Map_OBJECT(
                        Enums.COD_MAP.REVELATIONS.toString(),
                        R.drawable.revelations_boiii,
                        revMainQuest,
                        revSideQuests,
                        revBuildables
                )
        );

        ArrayList<ExpandableItem> nachtZcMainQuest = new ArrayList<>();
        nachtZcMainQuest.add(new ExpandableItem("No Main Quest (Survival Map)", new ArrayList<>()));

        ArrayList<ExpandableItem> nachtZcSideQuests = new ArrayList<>();
        nachtZcSideQuests.add(new ExpandableItem("Song - Undone", new ArrayList<>()));
        nachtZcSideQuests.add(new ExpandableItem("Musical EE (3 Radios)", new ArrayList<>()));
        nachtZcSideQuests.add(new ExpandableItem("Rebuild Boards for Power-Ups", new ArrayList<>()));

        ArrayList<ExpandableItem> nachtZcBuildables = new ArrayList<>();
        nachtZcBuildables.add(new ExpandableItem("GobbleGums Added (ZC)", new ArrayList<>()));
        nachtZcBuildables.add(new ExpandableItem("Wonderfizz Machine", new ArrayList<>()));
        nachtZcBuildables.add(new ExpandableItem("Classic Mystery Box", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.NACHT_DER_UNTOTEN_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.NACHT_DER_UNTOTEN_ZC.toString(),
                        R.drawable.nacht_boiii,
                        nachtZcMainQuest,
                        nachtZcSideQuests,
                        nachtZcBuildables
                )
        );

        ArrayList<ExpandableItem> verrucktZcMainQuest = new ArrayList<>();
        verrucktZcMainQuest.add(new ExpandableItem("No Main Quest (Survival Map)", new ArrayList<>()));

        ArrayList<ExpandableItem> verrucktZcSideQuests = new ArrayList<>();
        verrucktZcSideQuests.add(new ExpandableItem("Song - Lullaby for a Deadman", new ArrayList<>()));
        verrucktZcSideQuests.add(new ExpandableItem("Easter Egg Radios", new ArrayList<>()));
        verrucktZcSideQuests.add(new ExpandableItem("Power Switch Door Link", new ArrayList<>()));

        ArrayList<ExpandableItem> verrucktZcBuildables = new ArrayList<>();
        verrucktZcBuildables.add(new ExpandableItem("Wonderfizz Machine", new ArrayList<>()));
        verrucktZcBuildables.add(new ExpandableItem("Traps", new ArrayList<>()));
        verrucktZcBuildables.add(new ExpandableItem("HVK Wallbuy Added (ZC)", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.VERRUCKT_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.VERRUCKT_ZC.toString(),
                        R.drawable.verruckt_boiii,
                        verrucktZcMainQuest,
                        verrucktZcSideQuests,
                        verrucktZcBuildables
                )
        );

        ArrayList<ExpandableItem> shiNoNumaZcMainQuest = new ArrayList<>();
        shiNoNumaZcMainQuest.add(new ExpandableItem("No Main Quest (Survival Flow)", new ArrayList<>()));

        ArrayList<ExpandableItem> shiNoNumaZcSideQuests = new ArrayList<>();
        shiNoNumaZcSideQuests.add(new ExpandableItem("Song - The One", new ArrayList<>()));
        shiNoNumaZcSideQuests.add(new ExpandableItem("115 Rock EE", new ArrayList<>()));
        shiNoNumaZcSideQuests.add(new ExpandableItem("Flogger Trap EE", new ArrayList<>()));

        ArrayList<ExpandableItem> shiNoNumaZcBuildables = new ArrayList<>();
        shiNoNumaZcBuildables.add(new ExpandableItem("Wonderfizz Machine", new ArrayList<>()));
        shiNoNumaZcBuildables.add(new ExpandableItem("Random Perk Huts", new ArrayList<>()));
        shiNoNumaZcBuildables.add(new ExpandableItem("Flogger Trap", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.SHI_NO_NUMA_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.SHI_NO_NUMA_ZC.toString(),
                        R.drawable.shinonuma_boiii,
                        shiNoNumaZcMainQuest,
                        shiNoNumaZcSideQuests,
                        shiNoNumaZcBuildables
                )
        );

        ArrayList<ExpandableItem> kinoZcMainQuest = new ArrayList<>();
        kinoZcMainQuest.add(new ExpandableItem("No Main Quest (Story Ties in ZC)", new ArrayList<>()));

        ArrayList<ExpandableItem> kinoZcSideQuests = new ArrayList<>();
        kinoZcSideQuests.add(new ExpandableItem("Song - 115", new ArrayList<>()));
        kinoZcSideQuests.add(new ExpandableItem("Reel Projector EE", new ArrayList<>()));
        kinoZcSideQuests.add(new ExpandableItem("Shootable Power-Up EE", new ArrayList<>()));

        ArrayList<ExpandableItem> kinoZcBuildables = new ArrayList<>();
        kinoZcBuildables.add(new ExpandableItem("Buildable Shield (ZC)", new ArrayList<>()));
        kinoZcBuildables.add(new ExpandableItem("Teleporter Pads", new ArrayList<>()));
        kinoZcBuildables.add(new ExpandableItem("Trap Circuit", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.KINO_DER_TOTEN_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.KINO_DER_TOTEN_ZC.toString(),
                        R.drawable.kinodertoten_boiii,
                        kinoZcMainQuest,
                        kinoZcSideQuests,
                        kinoZcBuildables
                )
        );

        ArrayList<ExpandableItem> ascensionZcMainQuest = new ArrayList<>();
        ascensionZcMainQuest.add(new ExpandableItem("Main Quest (Launch Rocket & Gersh EE)", new ArrayList<>()));

        ArrayList<ExpandableItem> ascensionZcSideQuests = new ArrayList<>();
        ascensionZcSideQuests.add(new ExpandableItem("Song - Pareidolia", new ArrayList<>()));
        ascensionZcSideQuests.add(new ExpandableItem("Gersh Devices", new ArrayList<>()));
        ascensionZcSideQuests.add(new ExpandableItem("Monkey Round EE", new ArrayList<>()));

        ArrayList<ExpandableItem> ascensionZcBuildables = new ArrayList<>();
        ascensionZcBuildables.add(new ExpandableItem("Matryoshka Dolls", new ArrayList<>()));
        ascensionZcBuildables.add(new ExpandableItem("Lunar Lander System", new ArrayList<>()));
        ascensionZcBuildables.add(new ExpandableItem("Launch Pad Power", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.ASCENSION_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.ASCENSION_ZC.toString(),
                        R.drawable.ascension_boiii,
                        ascensionZcMainQuest,
                        ascensionZcSideQuests,
                        ascensionZcBuildables
                )
        );

        ArrayList<ExpandableItem> shangriLaZcMainQuest = new ArrayList<>();
        shangriLaZcMainQuest.add(new ExpandableItem("Time Travel Will Tell Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> shangriLaZcSideQuests = new ArrayList<>();
        shangriLaZcSideQuests.add(new ExpandableItem("Song - Pareidolia", new ArrayList<>()));
        shangriLaZcSideQuests.add(new ExpandableItem("Focusing Stone EE", new ArrayList<>()));
        shangriLaZcSideQuests.add(new ExpandableItem("Napalm & Shriekers", new ArrayList<>()));

        ArrayList<ExpandableItem> shangriLaZcBuildables = new ArrayList<>();
        shangriLaZcBuildables.add(new ExpandableItem("31-79 JGb215 (Baby Gun)", new ArrayList<>()));
        shangriLaZcBuildables.add(new ExpandableItem("Water Slide", new ArrayList<>()));
        shangriLaZcBuildables.add(new ExpandableItem("Minecart System", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.SHANGRI_LA_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.SHANGRI_LA_ZC.toString(),
                        R.drawable.shangrila_boiii,
                        shangriLaZcMainQuest,
                        shangriLaZcSideQuests,
                        shangriLaZcBuildables
                )
        );

        ArrayList<ExpandableItem> moonZcMainQuest = new ArrayList<>();
        moonZcMainQuest.add(new ExpandableItem("Richtofen's Grand Scheme Main Quest", new ArrayList<>()));

        ArrayList<ExpandableItem> moonZcSideQuests = new ArrayList<>();
        moonZcSideQuests.add(new ExpandableItem("Song - Coming Home", new ArrayList<>()));
        moonZcSideQuests.add(new ExpandableItem("Hacker EE", new ArrayList<>()));
        moonZcSideQuests.add(new ExpandableItem("Maxis Side Steps", new ArrayList<>()));

        ArrayList<ExpandableItem> moonZcBuildables = new ArrayList<>();
        moonZcBuildables.add(new ExpandableItem("Wave Gun / Zap Guns", new ArrayList<>()));
        moonZcBuildables.add(new ExpandableItem("QED & Gersh Devices", new ArrayList<>()));
        moonZcBuildables.add(new ExpandableItem("Low Gravity Mechanics", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.MOON_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.MOON_ZC.toString(),
                        R.drawable.moon_boiii,
                        moonZcMainQuest,
                        moonZcSideQuests,
                        moonZcBuildables
                )
        );

        ArrayList<ExpandableItem> originsZcMainQuest = new ArrayList<>();
        originsZcMainQuest.add(new ExpandableItem("Little Lost Girl Main Quest", new ArrayList<>()));
        originsZcMainQuest.add(new ExpandableItem("Free Samantha and Complete the Final Ritual", new ArrayList<>()));

        ArrayList<ExpandableItem> originsZcSideQuests = new ArrayList<>();
        originsZcSideQuests.add(new ExpandableItem("Song - Archangel", new ArrayList<>()));
        originsZcSideQuests.add(new ExpandableItem("Elemental Staff Upgrade Quests", new ArrayList<>()));
        originsZcSideQuests.add(new ExpandableItem("Challenge Chest Rewards", new ArrayList<>()));
        originsZcSideQuests.add(new ExpandableItem("Giant Robots Head EE", new ArrayList<>()));
        originsZcSideQuests.add(new ExpandableItem("Maxis Drone Parts & Side EE", new ArrayList<>()));

        ArrayList<ExpandableItem> originsZcBuildables = new ArrayList<>();
        originsZcBuildables.add(new ExpandableItem("Elemental Staffs (Fire, Ice, Lightning, Wind)", new ArrayList<>()));
        originsZcBuildables.add(new ExpandableItem("Maxis Drone", new ArrayList<>()));
        originsZcBuildables.add(new ExpandableItem("One Inch Punch / Iron Fists", new ArrayList<>()));
        originsZcBuildables.add(new ExpandableItem("Shield Buildable", new ArrayList<>()));
        originsZcBuildables.add(new ExpandableItem("Tank Path Access to Parts", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.ORIGINS_ZC,
                new Map_OBJECT(
                        Enums.COD_MAP.ORIGINS_ZC.toString(),
                        R.drawable.origins_boii,
                        originsZcMainQuest,
                        originsZcSideQuests,
                        originsZcBuildables
                )
        );

        ArrayList<ExpandableItem> doa2MainQuest = new ArrayList<>();
        doa2MainQuest.add(new ExpandableItem("Cosmic Silverback Main Quest", new ArrayList<>()));
        doa2MainQuest.add(new ExpandableItem("Escape the Island and Complete All Arenas", new ArrayList<>()));

        ArrayList<ExpandableItem> doa2SideQuests = new ArrayList<>();
        doa2SideQuests.add(new ExpandableItem("Hidden Room EE", new ArrayList<>()));
        doa2SideQuests.add(new ExpandableItem("Fate & Fortune System", new ArrayList<>()));
        doa2SideQuests.add(new ExpandableItem("Boss Wave Challenges", new ArrayList<>()));
        doa2SideQuests.add(new ExpandableItem("8-Bit Retro Arcade Room", new ArrayList<>()));
        doa2SideQuests.add(new ExpandableItem("First Person Mode Power-Up", new ArrayList<>()));

        ArrayList<ExpandableItem> doa2Buildables = new ArrayList<>();
        doa2Buildables.add(new ExpandableItem("Upgradable Weapons", new ArrayList<>()));
        doa2Buildables.add(new ExpandableItem("Vehicle Power-Ups (Tank, Mech, Dragon)", new ArrayList<>()));
        doa2Buildables.add(new ExpandableItem("Gem & Treasure System", new ArrayList<>()));
        doa2Buildables.add(new ExpandableItem("Arena Progression Path", new ArrayList<>()));
        doa2Buildables.add(new ExpandableItem("Friendship Bear Mechanic", new ArrayList<>()));

        mapObjects.put(
                Enums.COD_MAP.DEAD_OPS_ARCADE_2,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OPS_ARCADE_2.toString(),
                        R.drawable.deadopsarcade_boiii,
                        doa2MainQuest,
                        doa2SideQuests,
                        doa2Buildables
                )
        );

        return mapObjects;
    }
}
