package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlackOps2_Map_Object_Handler
{
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops II --------------------------

        // -------------------------- TRANZIT --------------------------
        ArrayList<ExpandableItem> tranzitMainQuest = new ArrayList<>();
        tranzitMainQuest.add(new ExpandableItem(
                "Tower of Babble Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power in the Power Station by building the switch on the workbench and activating it.",
                        "Decide which side of the Easter egg you are doing: Maxis (turn power off and keep it off) or Richtofen (keep power on).",
                        "Build at least one Turbine in the Bus Depot and carry it with you for powering off-grid objects around the map.",
                        "Navigate to the cornfield between Farm and Power Station and locate the large pylon tower off the main road.",
                        "For the Maxis side, place Turbines under specific power towers/lamps around the map while the power is OFF.",
                        "For the Richtofen side, keep the power ON, use EMP grenades on specific lamps or devices, and follow Richtofen’s instructions.",
                        "Lure the Avogadro (Electric Man) to the pylon area during a storm round and damage him near the tower when instructed.",
                        "Coordinate with all players in co-op to ensure Turbines, EMPs, and Avogadro steps occur in the correct order.",
                        "Once all conditions are fulfilled, listen for the final quotes from Maxis or Richtofen and look for achievement/trophy completion.",
                        "Continue playing with the knowledge that you have helped advance one of the two Aether story paths in Black Ops II."
                ))
        ));

        ArrayList<ExpandableItem> tranzitSideQuests = new ArrayList<>();
        tranzitSideQuests.add(new ExpandableItem(
                "Bus Parts",
                new ArrayList<>(Arrays.asList(
                        "At the Bus Depot, search the interior and immediate area for bus upgrade parts such as the front plow, ladder, and roof hatch.",
                        "Bring each part to the bus and attach it at the appropriate location when the prompt appears.",
                        "Attach the front plow to the front bumper of the bus to push zombies away and better protect the windows.",
                        "Attach the ladder to the side of the bus to allow players to quickly climb onto the roof from outside.",
                        "Use the roof hatch either on top of the bus to access the roof from inside or save it to place on certain rooftops (like the Diner) to gain rooftop access.",
                        "Experiment with different bus upgrade combinations to match the playstyle of your team."
                ))
        ));
        tranzitSideQuests.add(new ExpandableItem(
                "Song - Carrion",
                new ArrayList<>(Arrays.asList(
                        "Search Green Run (TranZit) for three teddy bears or music triggers hidden in various locations such as Bus Depot, Farm, or Town.",
                        "Approach the first teddy bear and interact with it to hear an activation sound cue.",
                        "Travel to other key locations and find the remaining bears, often placed on shelves, in corners, or near debris.",
                        "Interact with the second and third teddy bears to fully activate the hidden music Easter egg.",
                        "Once all three have been interacted with, the song 'Carrion' will begin playing over the match.",
                        "Continue your run while the song plays; it does not provide gameplay bonuses beyond the soundtrack."
                ))
        ));
        tranzitSideQuests.add(new ExpandableItem(
                "Nacht der Untoten Hidden Area",
                new ArrayList<>(Arrays.asList(
                        "Ride or follow the bus route between Farm and Power Station and disembark near the cornfield.",
                        "Enter the dense corn rows off the main road and carefully navigate through the fogged area.",
                        "Look for the ruins of a small, partially buried building that resembles Nacht der Untoten from World at War.",
                        "Enter the structure to find a compact area with tight hallways and limited weapon options.",
                        "Use this hidden area as a nostalgic nod to the original Zombies map, as well as a risky but fun holdout spot.",
                        "Explore the interior for wall weapons and listen for ambient audio referencing classic Nacht der Untoten."
                ))
        ));
        tranzitSideQuests.add(new ExpandableItem(
                "Denizen Teleporters",
                new ArrayList<>(Arrays.asList(
                        "Wander into the fog between main TranZit locations to spawn Denizens, small creatures that jump onto your head.",
                        "Lure a Denizen to a working lamp post or streetlight and allow it to latch on to your face while beneath the light.",
                        "Stand still under the lamp post until the Denizen leaps off and burrows into the ground nearby.",
                        "After it digs, a glowing green fissure will appear at that location, forming a quick-travel teleporter point.",
                        "Crouch or walk into the fissure to be teleported to another active Denizen teleporter elsewhere on the map.",
                        "Set up multiple Denizen teleporters around Green Run to create a fast, alternate transportation network beyond the bus."
                ))
        ));
        tranzitSideQuests.add(new ExpandableItem(
                "TV Tower Morse/Event",
                new ArrayList<>(Arrays.asList(
                        "Locate the large radio/TV tower-style pylon structure in the cornfield between Farm and Power Station.",
                        "Stand near the base of the tower and listen closely for Morse code bleeps, static, or other strange transmissions.",
                        "Use Turbines, EMP grenades, and other devices at or near the tower when following specific Easter egg guides.",
                        "Note that certain story-related events and character quotes (Maxis or Richtofen) are triggered from this location.",
                        "Treat the tower area as the central hub for the Tower of Babble main quest and related secret communications."
                ))
        ));

        ArrayList<ExpandableItem> tranzitBuildables = new ArrayList<>();
        tranzitBuildables.add(new ExpandableItem(
                "Turbine",
                new ArrayList<>(Arrays.asList(
                        "In the Bus Depot, find the workbench and three Turbine parts: the base stand, the fan blade, and the mannequin head.",
                        "Pick up each part and place it on the workbench one at a time until the Turbine is fully assembled.",
                        "Once built, take the Turbine and place it near powered doors, offline perk machines, or devices that require temporary power.",
                        "Use the Turbine to open secret doors or activate items such as the pylon in the cornfield for Easter egg steps.",
                        "Keep in mind that the Turbine will eventually break and need to be rebuilt when it takes enough damage."
                ))
        ));
        tranzitBuildables.add(new ExpandableItem(
                "Zombie Shield",
                new ArrayList<>(Arrays.asList(
                        "Travel to the Diner/Garage area and locate the shield workbench inside the garage.",
                        "Search the surrounding area for the shield parts, typically including a car door, dolly frame, and support component.",
                        "Bring each part back to the workbench and assemble them to create the Zombie Shield.",
                        "Equip the shield to protect your back from zombie attacks while moving around the map.",
                        "Use the shield’s melee bash to knock back or kill zombies, but watch its durability as it will eventually break."
                ))
        ));
        tranzitBuildables.add(new ExpandableItem(
                "Jet Gun - Thrustodyne Aeronautics Model 23",
                new ArrayList<>(Arrays.asList(
                        "Collect the Jet Gun parts from multiple TranZit locations: the tunnel between Bus Depot and Diner, the cornfield, the Power Station, and Town.",
                        "Look for components including the handle, gauge, central motor body, and wires scattered around these areas.",
                        "Once you have all parts, travel to the secret underground workbench below Town accessible via the bank area.",
                        "Assemble all Jet Gun parts at the workbench to build the Thrustodyne Aeronautics Model 23.",
                        "Use the Jet Gun’s suction beam to pull in and shred zombies, but avoid holding the trigger too long or it will overheat and shatter.",
                        "If the Jet Gun breaks, you must recollect the parts and rebuild it at the same workbench."
                ))
        ));
        tranzitBuildables.add(new ExpandableItem(
                "Electric Trap",
                new ArrayList<>(Arrays.asList(
                        "Find Electric Trap parts (such as electrical bases and panels) at locations like the Power Station or other industrial areas.",
                        "Bring the parts to a designated workbench and assemble the Electric Trap device.",
                        "Place the Electric Trap in a narrow walkway or choke point where zombies frequently pass.",
                        "Activate the trap to create a dangerous electric field that instantly damages or kills zombies walking through it.",
                        "Use the Electric Trap strategically during high rounds to control large groups of zombies without spending ammo."
                ))
        ));
        tranzitBuildables.add(new ExpandableItem(
                "Turret Trap",
                new ArrayList<>(Arrays.asList(
                        "Gather Turret parts from TranZit locations, looking for components such as a turret head, base, and control unit.",
                        "Assemble the pieces at the appropriate workbench to create a deployable Turret Trap.",
                        "Place the turret in an area with a good line of sight and heavy zombie traffic.",
                        "Activate the turret so it automatically fires at zombies for a limited amount of time or until it runs out of power.",
                        "Combine turret placement with player positioning to create crossfire setups and defend tight areas more easily."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.TRANZIT,
                new Map_OBJECT(
                        Enums.COD_MAP.TRANZIT.toString(),
                        R.drawable.tranzit_boii,
                        tranzitMainQuest,
                        tranzitSideQuests,
                        tranzitBuildables,
                        "https://www.youtube.com/watch?v=YH_9GzaUW40&rco=1"
                )
        );

        // -------------------------- TOWN --------------------------
        ArrayList<ExpandableItem> townMain = new ArrayList<>();
        townMain.add(new ExpandableItem()); // No dedicated main quest

        ArrayList<ExpandableItem> townSideQuests = new ArrayList<>();
        townSideQuests.add(new ExpandableItem(
                "Song - Carrion (shared with TranZit)",
                new ArrayList<>(Arrays.asList(
                        "Recognize that Town is part of the larger Green Run area where the song 'Carrion' originates.",
                        "In the full TranZit mode, activate 'Carrion' by finding and interacting with the three teddy bears scattered around the map.",
                        "Once activated, the song will continue to play even as you battle in the narrower Town survival layout.",
                        "Use the music as a thematic soundtrack while you focus on training zombies around the central Pack-a-Punch area.",
                        "Understand that in Town survival, the song does not provide direct bonuses beyond atmosphere and immersion."
                ))
        ));
        townSideQuests.add(new ExpandableItem(
                "Lava Challenges",
                new ArrayList<>(Arrays.asList(
                        "Observe the lava fissures and burning ground spread across the Town streets and central square.",
                        "Create personal challenges such as avoiding all lava damage for as many rounds as possible.",
                        "Practice careful movement and timing of jumps when crossing lava cracks during intense zombie chases.",
                        "Use the lava to damage zombies by letting them walk through it while you maintain safe distance.",
                        "Combine awareness of lava hazards with perk use and Pack-a-Punch positioning to survive high rounds."
                ))
        ));

        ArrayList<ExpandableItem> townBuildables = new ArrayList<>();
        townBuildables.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "Open the doors leading to the central bank/ruined building that houses the Pack-a-Punch machine.",
                        "Save up 5000 points by killing zombies and repairing barriers.",
                        "Approach the Pack-a-Punch machine and interact to insert your weapon.",
                        "Wait for the upgrade process to complete and retrieve your enhanced weapon.",
                        "Use the upgraded weapon to handle the increasing health and numbers of zombies as rounds progress."
                ))
        ));
        townBuildables.add(new ExpandableItem(
                "Lava Hazards",
                new ArrayList<>(Arrays.asList(
                        "Note where cracks in the ground expose lava that damages you on contact.",
                        "Plan zombie training routes that minimize standing in or crossing lava whenever possible.",
                        "Use short sprints and jumps to cross lava quickly, reducing the total damage taken.",
                        "Leverage the fact that zombies also take damage from lava as they chase you through the streets.",
                        "Balance aggressive movement with lava awareness to avoid unnecessary downs in tight spaces."
                ))
        ));
        townBuildables.add(new ExpandableItem(
                "Wall Weapons",
                new ArrayList<>(Arrays.asList(
                        "Search the Town buildings and alleys for wall-buy weapons like SMGs, shotguns, and rifles.",
                        "Use cheaper wall weapons in early rounds to build points and maintain consistent ammo supply.",
                        "Upgrade strong wall weapons at the Pack-a-Punch machine to keep them effective in higher rounds.",
                        "Position yourself near your preferred wall weapon when training so you can quickly refill ammo mid-round.",
                        "Experiment with different weapon combinations to find the best loadout for your Town survival strategy."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.TOWN,
                new Map_OBJECT(
                        Enums.COD_MAP.TOWN.toString(),
                        R.drawable.town_boii,
                        townMain,
                        townSideQuests,
                        townBuildables,
                        "https://www.youtube.com/watch?v=YH_9GzaUW40&rco=1"
                )
        );

        // -------------------------- FARM --------------------------
        ArrayList<ExpandableItem> farmMain = new ArrayList<>();
        farmMain.add(new ExpandableItem()); // No dedicated main quest

        ArrayList<ExpandableItem> farmSideQuests = new ArrayList<>();
        farmSideQuests.add(new ExpandableItem(
                "Song - Carrion (shared)",
                new ArrayList<>(Arrays.asList(
                        "Understand that Farm is part of the Green Run region, sharing the overall TranZit musical identity.",
                        "Activate 'Carrion' in the main TranZit mode via the usual teddy bear triggers.",
                        "Recognize the song as a thematic backdrop when playing Farm in survival variations.",
                        "Use the song to enhance the eerie, rural feel of the burning farmhouse and cornfield setting.",
                        "Focus on surviving high rounds while the shared Green Run track reinforces the atmosphere."
                ))
        ));
        farmSideQuests.add(new ExpandableItem(
                "Cornfield Secrets",
                new ArrayList<>(Arrays.asList(
                        "In full TranZit mode, travel from Farm into the nearby cornfield area off the main bus route.",
                        "Explore the cornfield to locate hidden secrets such as the ruined Nacht der Untoten structure and the pylon tower.",
                        "Use your knowledge of the cornfield layout to better understand how Farm connects to the larger Green Run world.",
                        "In survival Farm-only games, imagine the surrounding cornfield as the broader mystery beyond the playable boundary.",
                        "Build custom challenges for yourself, such as 'Farm only' runs that reference the larger cornfield lore from TranZit."
                ))
        ));

        ArrayList<ExpandableItem> farmBuildables = new ArrayList<>();
        farmBuildables.add(new ExpandableItem(
                "Wall Weapons",
                new ArrayList<>(Arrays.asList(
                        "Check the interior of the farmhouse and the barn for wall-buy weapons suitable for early defense.",
                        "Purchase a reliable weapon such as a shotgun or assault rifle to handle close-quarters engagements.",
                        "Use wall weapons as your primary firepower in survival Farm modes where box access may be limited.",
                        "Upgrade your favorite wall gun at Pack-a-Punch (in modes where it is accessible) to keep it viable longer.",
                        "Incorporate weapon location into your defensive strategy, deciding whether to camp inside or train outside."
                ))
        ));
        farmBuildables.add(new ExpandableItem(
                "Lava Hazards",
                new ArrayList<>(Arrays.asList(
                        "Be aware of any lava fissures in the yard and paths around the farmhouse.",
                        "Practice running loops that avoid standing in lava for long periods while still grouping zombies effectively.",
                        "Use lava as environmental damage on zombies, thinning groups before you finish them off.",
                        "Stay extra cautious near doorways and choke points where lava can trap you if you misstep.",
                        "Treat lava awareness as a core skill for mastering Farm’s tight, hazard-filled layout."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.FARM,
                new Map_OBJECT(
                        Enums.COD_MAP.FARM.toString(),
                        R.drawable.farm_boii,
                        farmMain,
                        farmSideQuests,
                        farmBuildables,
                        "https://www.youtube.com/watch?v=YH_9GzaUW40&rco=1"
                )
        );

        // -------------------------- BUS DEPOT --------------------------
        ArrayList<ExpandableItem> busDepotMain = new ArrayList<>();
        busDepotMain.add(new ExpandableItem()); // No dedicated main quest

        ArrayList<ExpandableItem> busDepotSideQuests = new ArrayList<>();
        busDepotSideQuests.add(new ExpandableItem(
                "Song - Carrion (shared)",
                new ArrayList<>(Arrays.asList(
                        "Recognize Bus Depot as the starting hub of Green Run where the TranZit experience begins.",
                        "In the full TranZit mode, the Easter egg song 'Carrion' can be activated through the teddy bear triggers.",
                        "Treat Bus Depot survival mode as a stripped-down challenge set within the same musical universe.",
                        "Play high-round attempts while imagining the broader TranZit story just beyond the closed doors.",
                        "Use the shared song association as a thematic link between Bus Depot and the rest of Green Run."
                ))
        ));
        busDepotSideQuests.add(new ExpandableItem(
                "No Perks Challenge",
                new ArrayList<>(Arrays.asList(
                        "Understand that in Bus Depot survival, there are no perk machines available by default.",
                        "Use this limitation as the basis for a classic 'no perks allowed' difficulty challenge.",
                        "Rely purely on movement, weapon choice, and map knowledge to survive escalating rounds.",
                        "Use early wall weapons and, if available, the Mystery Box to secure stronger guns.",
                        "Challenge friends or yourself to beat personal bests for highest rounds without the safety of perks."
                ))
        ));

        ArrayList<ExpandableItem> busDepotBuildables = new ArrayList<>();
        busDepotBuildables.add(new ExpandableItem(
                "Wall Weapons",
                new ArrayList<>(Arrays.asList(
                        "Look around the small Bus Depot interior to locate the limited selection of wall-buy weapons.",
                        "Grab a cheap early weapon to quickly build points and control the round 1–5 rush.",
                        "Since perks are absent, prioritize accurate weapons that let you avoid taking hits altogether.",
                        "Use wall weapons as your main sustain option, as ammo can be replenished directly from the wall.",
                        "Adapt your weapon choice based on whether you plan to camp, kite, or constantly reposition."
                ))
        ));
        busDepotBuildables.add(new ExpandableItem(
                "Lava Hazards",
                new ArrayList<>(Arrays.asList(
                        "Take note of any lava or burning ground outside the Bus Depot starting area.",
                        "Use outdoor areas sparingly to avoid unnecessary lava damage in a perkless environment.",
                        "In emergencies, move outside to briefly regroup, but avoid staying in lava zones for more than a second or two.",
                        "Allow zombies to cross lava when chasing you, softening them up before you finish them with gunfire.",
                        "Balance risk and reward when incorporating outside routes into your Bus Depot survival strategy."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.BUS_DEPOT,
                new Map_OBJECT(
                        Enums.COD_MAP.BUS_DEPOT.toString(),
                        R.drawable.busdepot_boii,
                        busDepotMain,
                        busDepotSideQuests,
                        busDepotBuildables,
                        "https://www.youtube.com/watch?v=YH_9GzaUW40&rco=1"
                )
        );

        // -------------------------- NUKETOWN ZOMBIES --------------------------
        ArrayList<ExpandableItem> nuketownMain = new ArrayList<>();
        nuketownMain.add(new ExpandableItem()); // No main quest

        ArrayList<ExpandableItem> nuketownSideQuests = new ArrayList<>();
        nuketownSideQuests.add(new ExpandableItem(
                "Song - She's Not There",
                new ArrayList<>(Arrays.asList(
                        "Search Nuketown Zombies for the hidden musical trigger objects scattered around the map.",
                        "Interact with the first trigger (often a teddy bear or similar object) to hear a short audio cue.",
                        "Locate additional triggers in the opposite house, backyard areas, or by environmental props.",
                        "Interact with all three music triggers to fully activate the hidden Easter egg song 'She's Not There'.",
                        "Continue surviving while the song plays, adding extra tension and style to the chaotic Nuketown setting."
                ))
        ));
        nuketownSideQuests.add(new ExpandableItem(
                "Randomized Perk Drops",
                new ArrayList<>(Arrays.asList(
                        "Watch the sky periodically as rounds progress for falling perk machine comets landing in the map.",
                        "Investigate the impact locations to see which perk machine has landed (such as Juggernog or Speed Cola).",
                        "Plan your strategy around which perks appear first, as the order is randomized each game.",
                        "Adjust your training routes and camping strategies based on available perks in each backyard.",
                        "Use the unpredictable perk arrival to keep each Nuketown Zombies playthrough feeling unique."
                ))
        ));
        nuketownSideQuests.add(new ExpandableItem(
                "Round-Based Nuke Events",
                new ArrayList<>(Arrays.asList(
                        "Pay attention to explosions and environmental effects in the Nuketown background as rounds increase.",
                        "At certain rounds, nukes or heavy explosions may become more frequent, emphasizing the map’s apocalyptic setting.",
                        "Listen for air raid sirens or blast sounds that add to the chaos and tension.",
                        "Use these sound and visual cues to heighten your awareness and immersion even though they do not alter core gameplay.",
                        "View the escalating background destruction as symbolic of the worsening zombie outbreak and collapsing world."
                ))
        ));
        nuketownSideQuests.add(new ExpandableItem(
                "Population Counter",
                new ArrayList<>(Arrays.asList(
                        "Look at the 'Population' sign in the center of the Nuketown map to see a number representing active zombies.",
                        "As zombies are killed throughout the round, watch the population number tick downward toward zero.",
                        "Use the counter as a rough tracker for how many zombies remain before the next round begins.",
                        "Check the sign regularly to decide when it is safe to hit the box, grab perks, or reposition.",
                        "Appreciate the Population sign as both a functional display and a clever thematic detail."
                ))
        ));

        ArrayList<ExpandableItem> nuketownBuildables = new ArrayList<>();
        nuketownBuildables.add(new ExpandableItem(
                "Randomized Perk Machines",
                new ArrayList<>(Arrays.asList(
                        "As meteor-like pods fall, they crash into the map and form perk machine locations in the yards or near houses.",
                        "Explore both backyards after each drop to find where the new perk machine has spawned.",
                        "Adapt your routes so you can safely access key perks like Juggernog once they finally appear.",
                        "Consider prioritizing perks based on how aggressive your training routes are and where you frequently pass.",
                        "Use the layout of perk machines to shape whether you camp in a backyard or run a loop through the center street."
                ))
        ));
        nuketownBuildables.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "Watch for the Pack-a-Punch machine to drop into the central area of the map as rounds progress.",
                        "When the machine is present, quickly move to it during a lull or after thinning out a zombie wave.",
                        "Spend 5000 points to upgrade your weapon before the Pack-a-Punch machine possibly relocates.",
                        "In some variants, the Pack-a-Punch may move or be temporarily unavailable, so use it opportunistically.",
                        "Rely on upgraded weapons to keep up with the rapidly scaling health of Nuketown’s zombie waves."
                ))
        ));
        nuketownBuildables.add(new ExpandableItem(
                "Nuke Collapse Event",
                new ArrayList<>(Arrays.asList(
                        "As the game progresses toward high rounds, note the increasingly destructive nuclear atmosphere.",
                        "Observe background elements and skybox details that suggest a full-scale nuclear bombardment scenario.",
                        "Treat the final-state destruction as a narrative endpoint where Nuketown has fully succumbed to the blast.",
                        "Use this collapse theme as extra pressure to survive as long as possible before the inevitable end.",
                        "Enjoy the combination of frantic gameplay and apocalyptic visuals that defines Nuketown Zombies."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.NUKETOWN_ZOMBIES,
                new Map_OBJECT(
                        Enums.COD_MAP.NUKETOWN_ZOMBIES.toString(),
                        R.drawable.nuketown_boii,
                        nuketownMain,
                        nuketownSideQuests,
                        nuketownBuildables,
                        "https://www.youtube.com/watch?v=zzaVSj0omXo&rco=1"
                )
        );

        // -------------------------- DIE RISE --------------------------
        ArrayList<ExpandableItem> dieRiseMainQuest = new ArrayList<>();
        dieRiseMainQuest.add(new ExpandableItem(
                "High Maintenance Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power by navigating through the collapsing skyscrapers and activating the power switch in the upper areas.",
                        "Build the Sliquifier and other key equipment to help manage zombies and move around the map safely.",
                        "Step on and light up the dragon symbols or tiles in the correct order based on your chosen Easter egg side (Maxis or Richtofen).",
                        "Cooperate with teammates to stand on specific symbols simultaneously or in sequences when instructed.",
                        "Interact with Mahjong tiles and other visual clues to determine the proper order for certain steps.",
                        "Use the Trample Steam to launch players onto specific rooftops or symbols when required for the quest.",
                        "Perform additional tasks such as killing zombies in designated areas, activating elevators, or aligning objects according to the storyline.",
                        "Complete the final step sequence for either Maxis or Richtofen, then listen for their concluding dialogue.",
                        "Confirm completion by checking for the associated achievement or trophy and any visual changes tied to the quest."
                ))
        ));

        ArrayList<ExpandableItem> dieRiseSideQuests = new ArrayList<>();
        dieRiseSideQuests.add(new ExpandableItem(
                "Song - We All Fall Down",
                new ArrayList<>(Arrays.asList(
                        "Search the Die Rise towers for hidden teddy bears or music-trigger objects placed in out-of-the-way spots.",
                        "Interact with the first bear to hear an activation sound that indicates progress toward the song Easter egg.",
                        "Locate the second and third bears in other sections of the skyscraper, such as near elevators or broken floors.",
                        "Interact with all three music triggers within the same game to fully activate the hidden song.",
                        "Once all triggers are activated, the song 'We All Fall Down' will play while you fight in the unstable tower environment."
                ))
        ));
        dieRiseSideQuests.add(new ExpandableItem(
                "Jumping Jacks Free Perk",
                new ArrayList<>(Arrays.asList(
                        "Recognize Jumping Jacks (crawler-type enemies) when they appear during special rounds on Die Rise.",
                        "During a Jumping Jack round, aim for high accuracy and avoid missing shots as much as possible.",
                        "If you and your team kill all Jumping Jacks in that round without missing a shot (or following your version’s criteria), a free perk bottle drops.",
                        "Collect the free perk bottle to gain an additional perk slot without spending points.",
                        "Use these free perk rounds to expand your perk setup beyond normal limits and strengthen your survival chances."
                ))
        ));
        dieRiseSideQuests.add(new ExpandableItem(
                "Elevator Key",
                new ArrayList<>(Arrays.asList(
                        "Locate the Elevator Key (if present in your version) as a special item used to control elevator movements.",
                        "Pick up the key and use it at designated elevator control panels in the skyscraper.",
                        "Call specific elevators to your floor or send them away to reposition their locations for strategic travel.",
                        "Coordinate key usage with teammates so no one is left stranded on an unsafe floor during high rounds.",
                        "Use elevator control to maintain access to perks, Pack-a-Punch, and key pathways throughout the match."
                ))
        ));
        dieRiseSideQuests.add(new ExpandableItem(
                "TV/Radio Messages",
                new ArrayList<>(Arrays.asList(
                        "Search various rooms and ledges in Die Rise for TV sets and radios that can be interacted with.",
                        "Activate radios or TVs to play short lore-rich messages about the Victis crew and the ongoing Aether storyline.",
                        "Revisit known radio locations in later rounds to see if additional messages become available.",
                        "Piece together the narrative details provided by these audio logs to understand how Die Rise connects to TranZit and Buried.",
                        "Use these messages as background story content while setting up for high round attempts or Easter egg runs."
                ))
        ));

        ArrayList<ExpandableItem> dieRiseBuildables = new ArrayList<>();
        dieRiseBuildables.add(new ExpandableItem(
                "Sliquifier",
                new ArrayList<>(Arrays.asList(
                        "Collect Sliquifier parts from the laboratory and nearby areas, including a barrel, stock, scope, and other key components.",
                        "Carry the parts to the designated workbench in the lab or crafting room on Die Rise.",
                        "Assemble the parts to create the Sliquifier wonder weapon, which shoots slippery, chain-reaction slime.",
                        "Use the Sliquifier to create slick puddles that cause zombies to slip, fall, and chain-explode in groups.",
                        "Manage ammo carefully and avoid overuse in cramped areas where the slime may also hinder your own movement."
                ))
        ));
        dieRiseBuildables.add(new ExpandableItem(
                "Trample Steam",
                new ArrayList<>(Arrays.asList(
                        "Locate the Trample Steam parts scattered around Die Rise, such as the flag, turbine, plate, and base pieces.",
                        "Bring each part to the workbench and assemble them into the Trample Steam device.",
                        "Place the Trample Steam on flat surfaces near gaps or broken floor sections to launch players across.",
                        "Use it to travel quickly between separated buildings or to reach high ledges and symbols for Easter egg steps.",
                        "Watch for zombies stepping on it as well, as they can be flung off the map or into deadly falls."
                ))
        ));
        dieRiseBuildables.add(new ExpandableItem(
                "Navcard Table",
                new ArrayList<>(Arrays.asList(
                        "Find the Navcard Table parts, including the board, posts, and electronic components, in hidden corners or lower levels.",
                        "Bring all parts to the correct location in Die Rise where the Navcard Table is meant to be assembled.",
                        "Construct the Navcard Table to enable the use of Navcards that tie multiple maps' Easter eggs together.",
                        "Insert the appropriate Navcard (often originating from a different map) into the completed table.",
                        "Treat the Navcard system as part of the larger, cross-map Aether story spanning TranZit, Die Rise, and Buried."
                ))
        ));
        dieRiseBuildables.add(new ExpandableItem(
                "Random Elevator System",
                new ArrayList<>(Arrays.asList(
                        "Observe that many perks and Pack-a-Punch locations are attached to moving elevators within the skyscraper.",
                        "Learn the elevator patterns so you can predict when a perk machine will be accessible on your current floor.",
                        "Ride elevators carefully, making sure not to get crushed by doors or moving shafts.",
                        "Use elevator shafts as fast travel points by dropping down safe distances onto lower elevator roofs.",
                        "Incorporate elevator timing into your training and camping strategies to ensure constant perk access."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.DIE_RISE,
                new Map_OBJECT(
                        Enums.COD_MAP.DIE_RISE.toString(),
                        R.drawable.dierise_boii,
                        dieRiseMainQuest,
                        dieRiseSideQuests,
                        dieRiseBuildables,
                        "https://www.youtube.com/watch?v=lrLQiF68mIk"
                )
        );

        // -------------------------- MOB OF THE DEAD --------------------------
        ArrayList<ExpandableItem> motdMainQuest = new ArrayList<>();
        motdMainQuest.add(new ExpandableItem(
                "Pop Goes the Weasel Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Begin the game in Alcatraz as one of the imprisoned mobsters and make use of the Afterlife mechanic to open early doors.",
                        "Collect plane parts scattered around the prison, including the engine, rigging, and other components needed to build an escape plane.",
                        "Use Afterlife mode to power generators, unlock secret doors, and activate key systems that gate progress through the map.",
                        "Build the plane on the rooftop and travel to the Golden Gate Bridge, where you can Pack-a-Punch weapons and face repeated execution rounds.",
                        "Return to Alcatraz from the bridge through the electric chairs to continue the cycle.",
                        "Follow the story clues, including audio logs and map events, that hint at the true nature of the cycle and Weasel’s role.",
                        "Complete the final step by either continuing the cycle (siding with the crew) or breaking the cycle (siding with Weasel) in the rooftop showdown.",
                        "Depending on your choice, either maintain the endless loop or 'Pop Goes the Weasel' to break it, triggering the map’s story conclusion."
                ))
        ));

        ArrayList<ExpandableItem> motdSideQuests = new ArrayList<>();
        motdSideQuests.add(new ExpandableItem(
                "Song - Rusty Cage",
                new ArrayList<>(Arrays.asList(
                        "Search Alcatraz for three hidden musical trigger objects such as radios or headsets.",
                        "Interact with each trigger to hear a brief audio cue confirming activation.",
                        "Find the remaining triggers in various wings of the prison, including cell blocks and utility areas.",
                        "Once all triggers are activated, the song 'Rusty Cage' will begin playing over the match.",
                        "Enjoy the soundtrack as it complements the gritty, prison-break tone of Mob of the Dead."
                ))
        ));
        motdSideQuests.add(new ExpandableItem(
                "Afterlife Puzzles",
                new ArrayList<>(Arrays.asList(
                        "Use Afterlife mode by shocking yourself in designated electric chairs or boxes to leave your body temporarily.",
                        "While in Afterlife, float through blue spectral portals to access otherwise inaccessible areas and ceilings.",
                        "Shock generators, power boxes, and electrical panels to open doors, power perk machines, and enable features.",
                        "Solve multi-step puzzles such as inputting number codes via afterlife panels or aligning symbols through electricity.",
                        "Return to your body before your Afterlife timer runs out, or be forced to respawn at the start of the next round."
                ))
        ));
        motdSideQuests.add(new ExpandableItem(
                "Skull Locations",
                new ArrayList<>(Arrays.asList(
                        "Look for hidden skulls placed on objects around the island, some visible only through Afterlife mode.",
                        "Use a sniper rifle scope to spot skulls at long distances, such as those on telephone poles, docks, or roof lines.",
                        "Shoot each skull to collect or activate it as part of the Hell’s Retriever/Hell’s Redeemer or Golden Spork quests.",
                        "Keep track of which skull locations you have already hit during the match to avoid missing one.",
                        "Use guides or memory to ensure you complete all skull-related steps required for certain side quests."
                ))
        ));
        motdSideQuests.add(new ExpandableItem(
                "Plane Part Fetch Quest",
                new ArrayList<>(Arrays.asList(
                        "Explore Alcatraz to locate the five plane parts: each one placed in a different secured area of the prison.",
                        "Use Afterlife mode to power doors, elevators, and mechanisms that block access to each part.",
                        "Collect parts from areas like the Warden’s Office, infirmary, laundry, and underground utilities.",
                        "Carry plane parts to the rooftop one at a time and place them on the rigged frame of the escape plane.",
                        "After assembling all parts, board the plane with your team to fly to the Golden Gate Bridge."
                ))
        ));
        motdSideQuests.add(new ExpandableItem(
                "Golden Spork Challenge",
                new ArrayList<>(Arrays.asList(
                        "Feed the Hellhounds by killing zombies near their flaming dog heads painted on prison walls.",
                        "Complete all required Hellhound feeds to unlock access to special areas or items tied to the challenge.",
                        "Locate and interact with bathtubs, sinks, or specific blood-stained areas to advance the Spork quest.",
                        "Perform any necessary melee or environmental steps to transform a basic melee weapon into the Golden Spork.",
                        "Once obtained, use the Golden Spork as a powerful one-hit melee weapon for many rounds."
                ))
        ));

        ArrayList<ExpandableItem> motdBuildables = new ArrayList<>();
        motdBuildables.add(new ExpandableItem(
                "Acid Gat Kit",
                new ArrayList<>(Arrays.asList(
                        "Obtain the Blundergat from the Mystery Box or a guaranteed location, depending on your progression.",
                        "Locate the Acid Gat Kit parts placed around the prison, including the acid vial, case, and mechanical components.",
                        "Build the Acid Gat Kit at a workbench in one of the crafting rooms.",
                        "Place your Blundergat into the Acid Gat Kit to convert it into the Acid Gat.",
                        "Use the Acid Gat’s sticky, corrosive projectiles to damage and control large groups of zombies."
                ))
        ));
        motdBuildables.add(new ExpandableItem(
                "Plane to Golden Gate Bridge",
                new ArrayList<>(Arrays.asList(
                        "Collect all plane parts and build the aircraft on the prison rooftop.",
                        "Once built, approach the plane and hold the interact button to board it with your team.",
                        "Watch the cutscene as the plane flies off and crashes into the Golden Gate Bridge area.",
                        "In the bridge arena, use the Pack-a-Punch machine and fight waves of electrified zombies.",
                        "Return to the island by using the electric chairs, resetting the cycle and allowing you to repeat the trip."
                ))
        ));
        motdBuildables.add(new ExpandableItem(
                "Hell’s Retriever/Hell’s Redeemer",
                new ArrayList<>(Arrays.asList(
                        "Feed all Hellhound heads around the map by killing zombies in their vicinity until each dog is satisfied.",
                        "Once all dogs have been fed, a hidden wall or area will open revealing the Hell’s Retriever tomahawk.",
                        "Pick up Hell’s Retriever to gain a powerful returning throwing weapon for grabbing drops and hitting distant targets.",
                        "To upgrade to Hell’s Redeemer, complete additional requirements such as getting kills on the Golden Gate Bridge and retrieving the upgraded tomahawk from lava.",
                        "Use Hell’s Redeemer as a stronger, more effective version of the original tomahawk with enhanced killing power."
                ))
        ));
        motdBuildables.add(new ExpandableItem(
                "Shield Buildable",
                new ArrayList<>(Arrays.asList(
                        "Search the prison for shield parts including a protective front plate, frame, and additional hardware.",
                        "Assemble all parts at a designated workbench to construct the Riot Shield.",
                        "Equip the shield to protect your back from zombie attacks as you traverse tight cell blocks and corridors.",
                        "Use the shield’s melee smash to knock down groups of zombies and create breathing room.",
                        "Monitor the shield’s durability and rebuild it when it eventually breaks from excessive damage."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.MOB_OF_THE_DEAD,
                new Map_OBJECT(
                        Enums.COD_MAP.MOB_OF_THE_DEAD.toString(),
                        R.drawable.motd_boii,
                        motdMainQuest,
                        motdSideQuests,
                        motdBuildables,
                        "https://www.youtube.com/watch?v=I71tnZDIR4M&rco=1"
                )
        );

        // -------------------------- BURIED --------------------------
        ArrayList<ExpandableItem> buriedMainQuest = new ArrayList<>();
        buriedMainQuest.add(new ExpandableItem(
                "Mined Games Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Drop down into the buried Western town and turn on the power by accessing the underground switch.",
                        "Build key equipment such as the Trample Steam, Turbine, and other support devices needed for Easter egg steps.",
                        "Interact with the central guillotine or gallows structure, depending on whether you follow Maxis or Richtofen.",
                        "Complete tasks like activating lanterns, using the Time Bomb, and charging specific objects with zombie souls.",
                        "Guide Leroy, manipulate enemies, and solve angled-light or energy-transfer puzzles as instructed by Maxis or Richtofen.",
                        "Perform the final sequence of actions at the focal device in the center of town to complete either the Maxis or Richtofen side.",
                        "Listen to the concluding dialogue and verify the 'Mined Games' achievement or trophy unlock to confirm completion."
                ))
        ));

        ArrayList<ExpandableItem> buriedSideQuests = new ArrayList<>();
        buriedSideQuests.add(new ExpandableItem(
                "Song - Always Running",
                new ArrayList<>(Arrays.asList(
                        "Search Buried for hidden musical triggers such as teddy bears or other interactable objects.",
                        "Activate the first trigger to hear a short musical cue that confirms the Easter egg is in progress.",
                        "Find and interact with the remaining triggers in different parts of the map such as the saloon or courthouse.",
                        "After activating all triggers, the song 'Always Running' will begin playing.",
                        "Use the track as an energetic backdrop while you navigate the looping, underground Western town."
                ))
        ));
        buriedSideQuests.add(new ExpandableItem(
                "Leroy Tasks",
                new ArrayList<>(Arrays.asList(
                        "Locate Leroy (Arthur) locked in a cell near the starting area and free him by using a key found nearby.",
                        "Give Leroy booze to make him charge and break through specific barricades, opening new areas and shortcuts.",
                        "Offer candy to Leroy to have him perform helpful tasks such as holding crawlers, moving the Mystery Box, or defending areas.",
                        "Use Leroy strategically to open all critical parts of town without overspending your points.",
                        "Incorporate his abilities into Easter egg steps and high-round setups for maximum efficiency."
                ))
        ));
        buriedSideQuests.add(new ExpandableItem(
                "Witch Maze",
                new ArrayList<>(Arrays.asList(
                        "Reach the haunted mansion at the edge of town and fight through ghostly witch enemies inside.",
                        "Exit the mansion into the back garden area where a shifting hedge maze appears.",
                        "Navigate the maze, which can change layout, to find the path leading to the Pack-a-Punch area.",
                        "Avoid getting trapped or cornered in dead ends while witches or zombies pursue you.",
                        "Learn the possible maze patterns over multiple games to improve your navigation speed."
                ))
        ));
        buriedSideQuests.add(new ExpandableItem(
                "Free Perk from Witches",
                new ArrayList<>(Arrays.asList(
                        "Enter the haunted mansion and prepare to face waves of witches that drain your points when they touch you.",
                        "Kill all witches that spawn during your run through the mansion without letting too many steal your points.",
                        "After defeating the final witch in a wave, watch for a free perk bottle drop near the exit of the mansion.",
                        "Collect the free perk bottle to gain an additional perk beyond your normal limit.",
                        "Repeat this process in later rounds when witches reappear to potentially earn more free perks."
                ))
        ));
        buriedSideQuests.add(new ExpandableItem(
                "Navcard Table",
                new ArrayList<>(Arrays.asList(
                        "Find the Navcard Table parts such as the posts, board, and electronic components hidden around Buried.",
                        "Carry each part to the designated build site, often in a more secluded area of the map.",
                        "Assemble the Navcard Table to complete Buried’s contribution to the cross-map Navcard network.",
                        "Insert the appropriate Navcard (likely obtained from a different map) into the completed table.",
                        "Use this system as part of the larger multi-map Easter egg linking TranZit, Die Rise, and Buried together."
                ))
        ));

        ArrayList<ExpandableItem> buriedBuildables = new ArrayList<>();
        buriedBuildables.add(new ExpandableItem(
                "Trample Steam",
                new ArrayList<>(Arrays.asList(
                        "Locate Trample Steam parts such as the flag, spring, plate, and base in various town buildings.",
                        "Bring all parts to a workbench in Buried and assemble the Trample Steam device.",
                        "Place the Trample Steam near gaps, ledges, or choke points to fling zombies or players across.",
                        "Use it to build shortcuts between rooftops and otherwise separated platforms.",
                        "Integrate Trample Steam positions into your defensive setups to add crowd control and mobility."
                ))
        ));
        buriedBuildables.add(new ExpandableItem(
                "Turbine",
                new ArrayList<>(Arrays.asList(
                        "Gather Turbine parts including the base, fan, and mannequin head from the Buried environment.",
                        "Assemble the Turbine at a workbench to recreate the portable power source first seen in TranZit.",
                        "Deploy the Turbine near doors, buildables, or machines that require temporary power.",
                        "Use it to activate certain Easter egg steps that need remote electrical activation.",
                        "Monitor its health, as it can break after prolonged use or zombie attacks."
                ))
        ));
        buriedBuildables.add(new ExpandableItem(
                "Subsurface Resonator",
                new ArrayList<>(Arrays.asList(
                        "Find parts for the Subsurface Resonator, including the speaker, base, and mechanical components.",
                        "Build it at a workbench in Buried to create a powerful crowd-control trap.",
                        "Place the Resonator in a central area and use a Turbine to power it.",
                        "When activated, it emits shockwaves that launch and destroy zombies in its radius.",
                        "Use it cleverly to create death zones that protect key areas or objective locations."
                ))
        ));
        buriedBuildables.add(new ExpandableItem(
                "Head Chopper",
                new ArrayList<>(Arrays.asList(
                        "Collect the Head Chopper parts such as the blade, stand, and mechanism scattered around town.",
                        "Assemble the parts at a workbench to construct the Head Chopper trap.",
                        "Place the Head Chopper in narrow passages or doorways where zombies are forced to walk through.",
                        "When active, it slices the heads off zombies as they pass under it, dealing heavy damage.",
                        "Combine multiple traps like the Head Chopper and Subsurface Resonator to create layered defenses."
                ))
        ));
        buriedBuildables.add(new ExpandableItem(
                "Time Bomb",
                new ArrayList<>(Arrays.asList(
                        "Acquire the Time Bomb from the Mystery Box as one of the special equipment items.",
                        "Place the Time Bomb at a location during a round to create a temporal checkpoint for your game state.",
                        "Detonate the Time Bomb at a later point to revert the game (round, points, and player positions) to that saved moment.",
                        "Use the Time Bomb to undo mistakes, retry Easter egg steps, or manipulate outcomes such as perk rolls.",
                        "Coordinate with teammates before activating it, as it affects everyone in the match."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.BURIED,
                new Map_OBJECT(
                        Enums.COD_MAP.BURIED.toString(),
                        R.drawable.buried_boii,
                        buriedMainQuest,
                        buriedSideQuests,
                        buriedBuildables,
                        "https://www.youtube.com/watch?v=BwU7FR0uaaY&rco=1"
                )
        );

        // -------------------------- ORIGINS --------------------------
        ArrayList<ExpandableItem> originsMainQuest = new ArrayList<>();
        originsMainQuest.add(new ExpandableItem(
                "Little Lost Girl Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power to all six generators scattered around the Origins battlefield to activate perks and key systems.",
                        "Build all four elemental staffs (Ice, Fire, Lightning, and Wind) by collecting their parts from dig sites, robots, and other map-specific locations.",
                        "Upgrade each staff by completing its respective trials in the Crazy Place and on the main map.",
                        "Place the upgraded staffs in their corresponding giant robot pedestals or in the Crazy Place as required by the quest steps.",
                        "Complete soul-filling steps by killing zombies near designated objects such as chests, boxes, or pedestals.",
                        "Follow Samantha’s instructions, listening carefully to her dialogue for guidance on the next objective.",
                        "Perform final tasks in the Crazy Place, including defending specific points and placing the staffs to stabilize the realm.",
                        "Finish the last defensive sequence and listen to the ending cutscene/dialogue as you complete 'Little Lost Girl' and free Samantha."
                ))
        ));

        ArrayList<ExpandableItem> originsSideQuests = new ArrayList<>();
        originsSideQuests.add(new ExpandableItem(
                "Song - Archangel",
                new ArrayList<>(Arrays.asList(
                        "Locate the three hidden music discs or trigger objects scattered throughout the Origins map.",
                        "Interact with the first trigger to hear an audio cue indicating the song activation sequence has begun.",
                        "Find and interact with the remaining triggers in other areas such as near the tank path, excavation site, or trenches.",
                        "Once all triggers are activated, the song 'Archangel' will start playing over the match.",
                        "Use the intense soundtrack to hype yourself up while managing generators, robots, and Panzer Soldats."
                ))
        ));
        originsSideQuests.add(new ExpandableItem(
                "Maxis/Staff Chamber Radios",
                new ArrayList<>(Arrays.asList(
                        "Search the Origins trenches, bunker, and excavation site for radios and recording devices.",
                        "Interact with each radio to hear logs from Dr. Maxis, Richtofen, and other key characters.",
                        "Pay close attention to references explaining the excavation of Element 115 and the appearance of the giant robots.",
                        "Revisit the Staff Chamber and Crazy Place to see how the radios tie into the larger Aether storyline.",
                        "Compile the lore from these recordings to deepen your understanding of Origins’ role as an Aether prequel."
                ))
        ));
        originsSideQuests.add(new ExpandableItem(
                "Giant Robots",
                new ArrayList<>(Arrays.asList(
                        "Watch for the three giant robots (Freya, Odin, and Thor) walking across the battlefield in set patterns.",
                        "Look up at their feet to determine which robot is currently passing over your area.",
                        "Shoot the glowing panel under a robot’s foot and stand in the marked footprint to be taken inside its head.",
                        "Inside the robot, interact with internal switches or pedestals for Easter egg and staff upgrade steps.",
                        "Avoid being crushed by robot feet when not attempting to enter, as they will down you instantly."
                ))
        ));
        originsSideQuests.add(new ExpandableItem(
                "Challenges (Generators, Box, Headshots)",
                new ArrayList<>(Arrays.asList(
                        "Check the challenge boards near spawn and around the map for tasks such as capturing generators, getting headshots, or spending points.",
                        "Complete generator challenges by powering and defending all six generators without letting zombies recapture them.",
                        "Work on headshot challenges by aiming for the zombies’ heads during early rounds to build progress efficiently.",
                        "Complete box-related or spending challenges to receive rewards such as free perks, extra weapons, or power-ups.",
                        "Visit the reward chests near spawn and the excavation site to claim your completed challenge prizes."
                ))
        ));
        originsSideQuests.add(new ExpandableItem(
                "Panzer Soldat Event",
                new ArrayList<>(Arrays.asList(
                        "Prepare for the Panzer Soldat to spawn around round 8, signaled by a loud entrance sound and drop pod.",
                        "Stay mobile to avoid his flamethrower, claw grab, and heavy frontal attacks.",
                        "Aim for the glowing faceplate or weak points to deal maximum damage and break his armor.",
                        "Use high-damage weapons, staffs, or traps to bring him down quickly before he overwhelms your position.",
                        "Collect any power-ups or drops he leaves behind, as they can be vital for your continued survival."
                ))
        ));

        ArrayList<ExpandableItem> originsBuildables = new ArrayList<>();
        originsBuildables.add(new ExpandableItem(
                "Elemental Staffs (4 + Upgrades)",
                new ArrayList<>(Arrays.asList(
                        "Collect the Gramophone and appropriate records to open the elemental tunnels leading to the Crazy Place.",
                        "Gather staff parts from dig sites, special locations, or giant robot interiors depending on the element.",
                        "Combine each element’s crystal, parts, and staff pedestal at the Excavation Site to build the base staff.",
                        "Upgrade each staff by completing element-specific puzzles in the Crazy Place and on the main map.",
                        "Use the upgraded staffs for powerful crowd control, boss killing, and completing the main Easter egg steps."
                ))
        ));
        originsBuildables.add(new ExpandableItem(
                "Maxis Drone",
                new ArrayList<>(Arrays.asList(
                        "Find the Maxis Drone parts including the frame, brain jar, and rotor components scattered across Origins.",
                        "Assemble the Drone at a workbench, creating a flying assistant that follows and supports you.",
                        "Deploy the Maxis Drone to automatically shoot at zombies and collect power-ups in hard-to-reach places.",
                        "Use the Drone in specific Easter egg steps, such as guiding it through certain paths or areas.",
                        "Retrieve the Drone when it runs out of power so it can recharge and be used again later."
                ))
        ));
        originsBuildables.add(new ExpandableItem(
                "One Inch Punch / Iron Fist",
                new ArrayList<>(Arrays.asList(
                        "Complete soul boxes around the Origins map by killing zombies near stone chests until they glow and close.",
                        "Return to the spawn area to claim the One Inch Punch from the reward chest.",
                        "Use the One Inch Punch to deliver powerful melee attacks that send zombies flying.",
                        "Upgrade to the Iron Fist by fulfilling additional conditions tied to the main Easter egg or challenges.",
                        "With Iron Fist, enjoy enhanced melee power that remains effective into much higher rounds."
                ))
        ));
        originsBuildables.add(new ExpandableItem(
                "Generators System",
                new ArrayList<>(Arrays.asList(
                        "Locate all six generators around the Origins battlefield as you progress through the trenches and excavation zones.",
                        "Spend points to activate each generator while fighting off waves of Templar zombies.",
                        "Keep generators online to power perk machines, the Pack-a-Punch, and other essential systems.",
                        "Defend generators when Templar zombies attempt to recapture and shut them down.",
                        "Keep all generators active to maximize perks, reward access, and Easter egg readiness."
                ))
        ));
        originsBuildables.add(new ExpandableItem(
                "Tank Vehicle",
                new ArrayList<>(Arrays.asList(
                        "Find the church tank and pay points at its starting station to begin moving it along its set path.",
                        "Ride on the tank’s hull to safely travel across the battlefield and over deadly mud and trenches.",
                        "Jump off at specific points to reach staff part locations or hidden platforms that are otherwise unreachable.",
                        "After the tank reaches its end station, wait for it to cool down before sending it back along the route.",
                        "Use the tank strategically for both traversal and as a mobile safe zone during high-intensity rounds."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.ORIGINS,
                new Map_OBJECT(
                        Enums.COD_MAP.ORIGINS.toString(),
                        R.drawable.origins_boii,
                        originsMainQuest,
                        originsSideQuests,
                        originsBuildables,
                        "https://www.youtube.com/watch?v=TS701bMxmSI&rco=1"
                )
        );

        return mapObjects;
    }
}
