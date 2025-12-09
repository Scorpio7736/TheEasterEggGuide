package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WorldAtWar_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- World at War --------------------------

        // -------------------- Nacht der Untoten --------------------
        ArrayList<ExpandableItem> nachtMainQuest = new ArrayList<>();
        // No true main quest in WaW Nacht, so keep this as a placeholder
        nachtMainQuest.add(new ExpandableItem());

        ArrayList<ExpandableItem> nachtSideQuests = new ArrayList<>();
        nachtSideQuests.add(new ExpandableItem(
                "Music Radio",
                new ArrayList<>(Arrays.asList(
                        "Go upstairs to the second floor of the starting building.",
                        "Locate the small radio sitting on a table.",
                        "Interact with the radio to activate it and play the hidden music."
                ))
        ));
        nachtSideQuests.add(new ExpandableItem(
                "Secret Barrier Glitch",
                new ArrayList<>(Arrays.asList(
                        "Find the barrier/window used for the glitch (usually on the ground floor).",
                        "Have a zombie start tearing down the boards on that barrier.",
                        "Position yourself precisely where the glitch is performed (edge or corner of the barrier).",
                        "Move and jump/crouch at the right timing as the boards are removed to get into the glitch spot."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.NACHT_DER_UNTOTEN,
                new Map_OBJECT(
                        Enums.COD_MAP.NACHT_DER_UNTOTEN.toString(),
                        R.drawable.nacht_waw,
                        nachtMainQuest,
                        nachtSideQuests,
                        new ArrayList<>(),
                        "https://www.youtube.com/watch?v=puEpEIjatXY"
                )
        );

        // -------------------- Verrückt --------------------
        ArrayList<ExpandableItem> verrucktMainQuest = new ArrayList<>();
        // No formal main quest – left empty on purpose
        verrucktMainQuest.add(new ExpandableItem());

        ArrayList<ExpandableItem> verrucktSideQuests = new ArrayList<>();
        verrucktSideQuests.add(new ExpandableItem(
                "Music EE - Lullaby for a Dead Man",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power to activate the map’s electrical systems.",
                        "Go to the bathroom area on the Juggernog side of the map.",
                        "Flush the first toilet by interacting with it.",
                        "Flush the second toilet in the same bathroom.",
                        "Flush the third toilet to complete the sequence.",
                        "After the final flush, wait a moment and listen for the hidden song to start playing."
                ))
        ));
        verrucktSideQuests.add(new ExpandableItem(
                "Screaming / Ambient Audio EE",
                new ArrayList<>(Arrays.asList(
                        "Explore the asylum after turning on the power.",
                        "Stand near certain windows, doors, and the power room to hear extra ambient screams and whispers.",
                        "These are passive easter eggs – walk and listen around the asylum to experience all the unique audio."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.VERRUCKT,
                new Map_OBJECT(
                        Enums.COD_MAP.VERRUCKT.toString(),
                        R.drawable.verruckt_waw,
                        verrucktMainQuest,
                        verrucktSideQuests,
                        new ArrayList<>(),
                        "https://www.youtube.com/watch?v=cvArR7CFXLs"
                )
        );

        // -------------------- Shi No Numa --------------------
        ArrayList<ExpandableItem> shiNoNumaMainQuest = new ArrayList<>();
        // No full main quest – use placeholder
        shiNoNumaMainQuest.add(new ExpandableItem());

        ArrayList<ExpandableItem> shiNoNumaSideQuests = new ArrayList<>();
        shiNoNumaSideQuests.add(new ExpandableItem(
                "Music EE - The One",
                new ArrayList<>(Arrays.asList(
                        "Open the doors from the starting hut and make your way to the outer huts.",
                        "Go to the Fishing Hut and interact with the phone until you hear it ring and make a sound.",
                        "Go to the Doctor’s Quarters hut and interact with the phone there until it responds.",
                        "Go to the Storage Hut and interact with its phone as well.",
                        "After the final phone interaction, wait for the hidden song \"The One\" to begin playing."
                ))
        ));
        shiNoNumaSideQuests.add(new ExpandableItem(
                "Hidden Radio Messages",
                new ArrayList<>(Arrays.asList(
                        "Search each hut (Storage, Doctor’s Quarters, Comm Room, Fishing Hut) for radios.",
                        "Interact with any radios you find to hear hidden story dialogue.",
                        "Move around the swamp and huts to find all radios and listen to the full set of quotes."
                ))
        ));
        shiNoNumaSideQuests.add(new ExpandableItem(
                "Hanging Corpses EE",
                new ArrayList<>(Arrays.asList(
                        "Look up in various hut rooms and swamp areas.",
                        "Spot the hanging bodies and listen to the extra sound effects and ambiance they trigger.",
                        "These are passive visual easter eggs that add to the map’s atmosphere."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.SHI_NO_NUMA,
                new Map_OBJECT(
                        Enums.COD_MAP.SHI_NO_NUMA.toString(),
                        R.drawable.shinonuma_waw,
                        shiNoNumaMainQuest,
                        shiNoNumaSideQuests,
                        new ArrayList<>(),
                        "https://www.youtube.com/watch?v=Udac9hVyb48"
                )
        );

        // -------------------- Der Riese --------------------
        ArrayList<ExpandableItem> derRieseMainQuest = new ArrayList<>();
        derRieseMainQuest.add(new ExpandableItem(
                "Fly Trap Main Quest (Hide and Seek)",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power and link all three teleporters to the mainframe.",
                        "Earn enough points to Pack-a-Punch a weapon.",
                        "Pack-a-Punch a gun at the machine in the courtyard with the mainframe.",
                        "With your Pack-a-Punched weapon, go to the area overlooking the furnace opposite the Pack-a-Punch machine.",
                        "Shoot the small control panel/switch attached to the wall above the furnace to start the Fly Trap.",
                        "Listen for Samantha’s first quote, indicating the hide-and-seek game has begun.",
                        "Find and shoot the hidden objects Samantha hints at around the map (teddy bears, monkey bomb, etc.).",
                        "After shooting all hidden objects, listen for Samantha’s final line and collect the reward drop that appears."
                ))
        ));

        ArrayList<ExpandableItem> derRieseSideQuests = new ArrayList<>();
        derRieseSideQuests.add(new ExpandableItem(
                "Music EE - Beauty of Annihilation",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power to access more areas and activate machines.",
                        "Find the first green radio in the starting area or nearby room and interact with it.",
                        "Locate the second radio near one of the teleporters (commonly on a shelf or in a side room) and interact with it.",
                        "Find a third radio elsewhere in the facility (such as near the power or catwalk area).",
                        "After activating all required radios, \"Beauty of Annihilation\" will start playing."
                ))
        ));
        derRieseSideQuests.add(new ExpandableItem(
                "Story Radios and Hidden Dialogue",
                new ArrayList<>(Arrays.asList(
                        "Walk around the factory and search for radios on tables, shelves, and in side rooms.",
                        "Interact with each radio to hear various story logs and scientist recordings.",
                        "Keep track of which radios you’ve activated to hear the full narrative sequence."
                ))
        ));
        derRieseSideQuests.add(new ExpandableItem(
                "Teleport Grenade/Monkey Bomb Fun EE",
                new ArrayList<>(Arrays.asList(
                        "With teleporters linked, stand on a teleporter with grenades or a monkey bomb ready.",
                        "Throw a grenade or monkey bomb just before activating the teleporter.",
                        "Activate the teleporter while the explosive is mid-air.",
                        "Watch and listen for any fun teleport-related effects – grenades may appear in new locations or cause unexpected zombie reactions."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.DER_RIESE,
                new Map_OBJECT(
                        Enums.COD_MAP.DER_RIESE.toString(),
                        R.drawable.derreise_waw,
                        derRieseMainQuest,
                        derRieseSideQuests,
                        new ArrayList<>(),
                        "https://www.youtube.com/watch?v=SAIZ6dNNI3U"
                )
        );

        return mapObjects;
    }
}
