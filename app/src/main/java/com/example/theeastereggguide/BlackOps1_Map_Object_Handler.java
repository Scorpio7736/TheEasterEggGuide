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

        // -------------------------- MOON --------------------------
        ArrayList<ExpandableItem> moonMainQuest = new ArrayList<>();
        moonMainQuest.add(new ExpandableItem(
                "Cryogenic Slumber Party",
                new ArrayList<>(Arrays.asList(
                        "Start the game in Area 51 and earn enough points to buy Juggernog or Speed Cola before the first teleport.",
                        "Use the teleporter pad in Area 51 to travel to the Moon starting room (Receiving Area).",
                        "Open doors and work your way through the tunnels and labs toward the power switch and the Moon Pyramid Device (MPD) room.",
                        "Turn on the power in the power room to activate gravity, doors and systems across the Moon base.",
                        "Go back outside to the Receiving Area and interact with the four computers to play the Simon Says-style color sequence game.",
                        "Successfully complete the Simon Says sequences without failing to progress the quest.",
                        "Acquire the Hacker device from the labs and use it to hack the panels and terminals required around the base as part of Richtofen’s plan.",
                        "Return to the MPD room and interact with the control panels to cause the tube on the front of the MPD to rise from the floor.",
                        "Kill zombies very close to the MPD tube so their souls are absorbed and the tube fills with glowing energy.",
                        "Once the tube is full, use the switch on the side of the MPD console to complete Cryogenic Slumber Party and progress Richtofen’s Grand Scheme."
                ))
        ));

        ArrayList<ExpandableItem> moonSideQuests = new ArrayList<>();
        moonSideQuests.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "Use the teleporter pad on the Moon in the Receiving Area to travel back to Area 51.",
                        "When you arrive in Area 51, identify whether Juggernog or Speed Cola is currently active.",
                        "Wait in Area 51 until the Pack-a-Punch machine cycles down from the raised platform into an accessible position.",
                        "Survive against the infinite wave of zombies and dogs while the machine is available.",
                        "Quickly place your weapon into the Pack-a-Punch machine and wait for the upgrade to complete.",
                        "Retrieve your upgraded weapon and either stay to farm more points or use the teleporter pad to return to the Moon."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.MOON,
                new Map_OBJECT(
                        Enums.COD_MAP.MOON.toString(),
                        R.drawable.moon_boi,
                        moonMainQuest,
                        moonSideQuests,
                        new ArrayList<>(),
                        "https://www.youtube.com/watch?v=2k8V7fF7v7s&rco=1"
                )
        );

        // -------------------------- SHANGRI-LA --------------------------
        ArrayList<ExpandableItem> shangriLaMainQuest = new ArrayList<>();
        shangriLaMainQuest.add(new ExpandableItem(
                "Time Travel Will Tell",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power by opening the path through the temple and activating the two power switches.",
                        "Locate the four pressure plates near the spawn area and have players stand on all of them simultaneously to trigger the eclipse.",
                        "Once in eclipse mode, follow Brock and Gary’s dialogue and search the map for glowing stone buttons, switches, or symbols that need to be activated.",
                        "Solve multiple puzzle phases, including the water slide lever puzzle, the mine cart step, and the matching stone symbol step.",
                        "Align the dials and wall symbols around the map according to the correct pattern described by the puzzle solutions.",
                        "Escort or assist Brock and Gary indirectly by completing each objective they mention through radio or dialogue prompts.",
                        "Repeat the eclipse activation when necessary to access time-shifted versions of the map to progress further puzzle phases.",
                        "Guide water, energy or light through the temple mechanisms by interacting with levers and valves in the correct sequence.",
                        "Complete the final focusing stone step, where the Focusing Stone appears above the central temple structure.",
                        "Claim the Focusing Stone to finish Time Travel Will Tell, granting permanent perks to the player holding it (in supported versions)."
                ))
        ));

        ArrayList<ExpandableItem> shangriLaSideQuests = new ArrayList<>();
        shangriLaSideQuests.add(new ExpandableItem(
                "Brock and Gary Radio Messages",
                new ArrayList<>(Arrays.asList(
                        "Search the map for radios hidden near the temple, mine cart area, and waterfall paths.",
                        "Interact with each radio you find to play Brock and Gary’s recorded messages.",
                        "Listen to their expedition logs that describe their journey through Shangri-La and the strange temporal anomalies.",
                        "Trigger additional radios after key in-game events or round progress to hear more of their story.",
                        "Piece together the narrative as it leads into or connects with the main Time Travel Will Tell quest."
                ))
        ));
        shangriLaSideQuests.add(new ExpandableItem(
                "Monkey Bomb Easter Egg",
                new ArrayList<>(Arrays.asList(
                        "Watch for special monkey enemies that steal power-ups when you kill zombies near drops.",
                        "Allow a monkey to steal a power-up and follow it as it jumps across platforms and temple structures.",
                        "Observe the monkey’s route and kill it at the right time to potentially alter or upgrade the dropped power-up.",
                        "Use this behavior to try to manipulate drops for more valuable rewards such as Max Ammo or Perk Bottles.",
                        "This Easter egg is more of a hidden mechanic than a formal quest, rewarding observant players."
                ))
        ));
        shangriLaSideQuests.add(new ExpandableItem(
                "Song - Pareidolia",
                new ArrayList<>(Arrays.asList(
                        "Locate the first Element 115 rock hidden in one of the temple or cave areas and interact with it.",
                        "Find the second 115 rock in another hut or cliffside location and activate it the same way.",
                        "Search the map for the third 115 rock, often tucked into a small crevice or on a ledge.",
                        "After interacting with all three 115 rocks, the song ‘Pareidolia’ will begin to play.",
                        "Enjoy the full track as you continue surviving; there are no direct gameplay bonuses from the song."
                ))
        ));
        shangriLaSideQuests.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "From spawn, open doors leading toward the waterfall and central temple area.",
                        "Activate the mechanisms that raise and lower the Pack-a-Punch altar by stepping on the correct pressure plates.",
                        "Use the temple pathways and moving panels to reach the Pack-a-Punch area when it is accessible.",
                        "Place your weapon into the Pack-a-Punch altar and wait for the upgrade animation to finish.",
                        "Collect your upgraded weapon before the altar descends or becomes inaccessible again."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.SHANGRI_LA,
                new Map_OBJECT(
                        Enums.COD_MAP.SHANGRI_LA.toString(),
                        R.drawable.shangrila_boi,
                        shangriLaMainQuest,
                        shangriLaSideQuests,
                        new ArrayList<>(),
                        "https://www.youtube.com/watch?v=Z34RTO2BKM4&rco=1"
                )
        );

        // -------------------------- KINO DER TOTEN --------------------------
        ArrayList<ExpandableItem> kinoMainQuest = new ArrayList<>();
        kinoMainQuest.add(new ExpandableItem(
                "Film Reel Story Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power by opening the doors around the theater and activating the power switch on the stage catwalk.",
                        "Link the main teleporter on the stage with the pad in the spawn room to make it operational.",
                        "Use the teleporter to travel to the Pack-a-Punch room behind the movie screen.",
                        "Sometimes when teleporting, you will be sent to one of several random side rooms containing hidden film reels.",
                        "In these random rooms, search shelves, desks, or tables for small film reels with the Group 935 logo.",
                        "Pick up any film reels you find; they will automatically be added to your inventory.",
                        "Return to the projector in the Pack-a-Punch room and interact to place film reels into the projector.",
                        "Watch the secret Group 935 films that play on the theater screen, adding to the overarching Zombies storyline.",
                        "Repeat teleportations and searches until you have found and played all available film reels in a single game."
                ))
        ));

        ArrayList<ExpandableItem> kinoSideQuests = new ArrayList<>();
        kinoSideQuests.add(new ExpandableItem(
                "Song - 115",
                new ArrayList<>(Arrays.asList(
                        "Locate the first green Element 115 rock on a small table or debris pile in one of the early rooms.",
                        "Interact with the rock to trigger a faint audio cue.",
                        "Find the second 115 rock in a different section of the map, such as near the dressing room or upstairs corridor.",
                        "Interact with the second rock to advance the hidden music trigger.",
                        "Locate the third and final 115 rock, often in a more tucked-away spot on a shelf or near a wall.",
                        "Interact with the third rock to fully trigger the Easter egg song.",
                        "Listen as the song ‘115’ by Elena Siegman begins playing over the match, with no gameplay changes beyond music."
                ))
        ));
        kinoSideQuests.add(new ExpandableItem(
                "Radios",
                new ArrayList<>(Arrays.asList(
                        "Search the theater and surrounding hallways for hidden radios sitting on shelves, equipment, or boxes.",
                        "Interact with each radio to play short audio clips related to Group 935 and the zombies storyline.",
                        "Some radios are partially hidden or blend in with the environment, requiring careful observation to spot.",
                        "Trigger all radios in a single game to hear the full set of story-relevant messages.",
                        "Use these clues to better understand Richtofen, Samantha, and the experiments taking place at Kino der Toten."
                ))
        ));
        kinoSideQuests.add(new ExpandableItem(
                "Teddy Bears",
                new ArrayList<>(Arrays.asList(
                        "Look for small Teddy Bears hidden around the map on chairs, ledges, or props.",
                        "Aim at and shoot each Teddy Bear when you find it to trigger laughter or audio cues.",
                        "Some Bears may be connected to the music Easter egg, while others serve purely as creepy decorations.",
                        "Search balcony rails, backstage areas, and upper walkways to find all Teddy Bears in a single match.",
                        "Enjoy the extra layer of atmosphere and hidden references provided by the Bears."
                ))
        ));
        kinoSideQuests.add(new ExpandableItem(
                "Projector",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power and link the teleporter so the path to the Pack-a-Punch room is available.",
                        "Teleport to the Pack-a-Punch room behind the main theater screen.",
                        "Approach the film projector in the center of the room overlooking the theater.",
                        "Interact with the projector to begin playing whatever film reel is currently loaded.",
                        "Watch the film as it displays on the large screen visible from the main theater area."
                ))
        ));
        kinoSideQuests.add(new ExpandableItem(
                "Clock",
                new ArrayList<>(Arrays.asList(
                        "Locate the large clock on the wall within the theater or surrounding corridors.",
                        "Observe the clock hands and listen for associated ticking or chime sounds.",
                        "Shoot the clock face or interact nearby to test for any subtle audio or visual responses.",
                        "Note any small changes that might occur when time-based events or rounds progress.",
                        "This is primarily a visual and atmospheric Easter egg that adds to the sense of mystery in Kino."
                ))
        ));
        kinoSideQuests.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "Open doors from spawn to reach the stage area with the main teleporter.",
                        "Activate the power switch on the catwalk to drop the curtain and fully power the theater.",
                        "Link the main teleporter on the stage with the teleport pad in the starting room.",
                        "Use the teleporter on the stage to travel to the Pack-a-Punch room behind the movie screen.",
                        "Insert your weapon into the Pack-a-Punch machine and wait for the upgrade to complete.",
                        "Collect your upgraded weapon and teleport back to the theater after the timer expires."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.KINO_DER_TOTEN,
                new Map_OBJECT(
                        Enums.COD_MAP.KINO_DER_TOTEN.toString(),
                        R.drawable.kinodertoten_boi,
                        kinoMainQuest,
                        kinoSideQuests,
                        new ArrayList<>(),
                        "https://www.youtube.com/watch?v=B7b6EkTNOPA&list=RDB7b6EkTNOPA&rco=1"
                )
        );

        // -------------------------- FIVE --------------------------
        ArrayList<ExpandableItem> fiveSideQuests = new ArrayList<>();
        fiveSideQuests.add(new ExpandableItem(
                "Song - Won't Back Down",
                new ArrayList<>(Arrays.asList(
                        "Search the Pentagon for three red telephones that can be interacted with.",
                        "Answer the first ringing phone in the spawn or top floor office area.",
                        "Head to the War Room and locate another red phone on a desk or in an office.",
                        "Interact with the second phone to continue the song activation process.",
                        "Find the third phone in the lower DEFCON or laboratory areas of the map.",
                        "Interact with the final phone to trigger the Easter egg song ‘Won’t Back Down’.",
                        "Enjoy the song as you continue to fight off zombies in the Pentagon."
                ))
        ));
        fiveSideQuests.add(new ExpandableItem(
                "The Pig",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power in the War Room and explore the upper offices.",
                        "Locate the hanging pig carcass inside one of the research or lab rooms.",
                        "Shoot or knife the pig to cause it to swing or make disturbing sound effects.",
                        "Use different weapons to see if the pig reacts with varied sound cues.",
                        "This creepy Easter egg is purely cosmetic and does not affect gameplay."
                ))
        ));
        fiveSideQuests.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "From spawn, work your way down into the War Room by opening doors and using elevators as needed.",
                        "Turn on the power in the War Room to activate DEFCON switches and teleporters.",
                        "Activate all DEFCON switches around the War Room until the DEFCON level reaches 5.",
                        "Once DEFCON 5 is active, a teleporter in the center War Room will lead to the Pack-a-Punch room.",
                        "Use the teleporter to travel to the secure lab Pack-a-Punch area.",
                        "Place your weapon into the Pack-a-Punch machine, wait for processing, and collect your upgraded weapon."
                ))
        ));

        ArrayList<ExpandableItem> fiveBuildables = new ArrayList<>();
        fiveBuildables.add(new ExpandableItem(
                "Electric Trap",
                new ArrayList<>(Arrays.asList(
                        "Identify the wall-mounted electric barriers located in certain hallways and choke points.",
                        "Approach the trap control panel when it is powered and available for activation.",
                        "Spend the required points to activate the electric barrier trap.",
                        "Lure zombies into the path of the electric barrier to instantly kill them.",
                        "Time your use of traps carefully so you do not trap or kill teammates unintentionally."
                ))
        ));
        fiveBuildables.add(new ExpandableItem(
                "Teleporter Network",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power so teleporters and DEFCON systems become active in the War Room.",
                        "Experiment with stepping into different teleporters when DEFCON levels change.",
                        "Learn the teleporter routes that move you between the War Room, spawn, and Pack-a-Punch area.",
                        "Use teleporters to quickly escape when overrun by zombies in tight hallways.",
                        "Combine teleport usage with DEFCON management to control access to key areas."
                ))
        ));
        fiveBuildables.add(new ExpandableItem(
                "Auto-Turret",
                new ArrayList<>(Arrays.asList(
                        "Locate ceiling or wall-mounted turrets positioned in certain defensive locations.",
                        "Look for activation panels near these turrets that allow you to spend points.",
                        "Activate the turret, causing it to automatically fire on approaching zombies for a limited time.",
                        "Use auto-turrets to help defend narrow corridors or critical chokepoints during high rounds.",
                        "Monitor turret duration and cooldowns to plan defensive strategies efficiently."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.FIVE,
                new Map_OBJECT(
                        Enums.COD_MAP.FIVE.toString(),
                        R.drawable.five_boi,
                        new ArrayList<>(),
                        fiveSideQuests,
                        fiveBuildables,
                        "https://www.youtube.com/watch?v=D2dZeXxkJr8"
                )
        );

        // -------------------------- ASCENSION --------------------------
        ArrayList<ExpandableItem> ascensionMainQuest = new ArrayList<>();
        ascensionMainQuest.add(new ExpandableItem(
                "Ascension Main Quest - Lunar Lander Rocket Launch",
                new ArrayList<>(Arrays.asList(
                        "Open the starting doors and work your way through the Soviet cosmodrome facility.",
                        "Turn on the power in the main control room to activate perk machines, traps, and landers.",
                        "Call each lunar lander to its station and ride it from the spawn area, the stamina-up side, and the other cosmodrome wing.",
                        "Ensure each of the three lander pads has been used at least once to prime the rocket launch system.",
                        "Return to the central power control area with the large rocket and command console.",
                        "Press the launch button or interact with the control panel to initiate the rocket launch sequence.",
                        "Watch the rocket lift off, sometimes being destructible if particular conditions are met in certain versions.",
                        "After the launch, inspect the newly opened area where debris has cleared to access the Pack-a-Punch room.",
                        "Use the Pack-a-Punch machine below the launch site to upgrade weapons.",
                        "Continue surviving while utilizing the improved map traversal with lunar landers and the opened rocket area."
                ))
        ));

        ArrayList<ExpandableItem> ascensionSideQuests = new ArrayList<>();
        ascensionSideQuests.add(new ExpandableItem(
                "Song - Pareidolia",
                new ArrayList<>(Arrays.asList(
                        "Explore the cosmodrome to locate three hidden musical trigger objects (such as radios or 115 fragments).",
                        "Interact with the first object to hear a short activation sound.",
                        "Find the second music trigger somewhere else in the facility, often in a side room or platform area.",
                        "Interact with the second object to continue the hidden song activation.",
                        "Locate the third and final object in another corner of the map.",
                        "After interacting with all three, the Easter egg song will begin to play for the remainder of the round.",
                        "Enjoy the track as background music while you continue to complete other objectives."
                ))
        ));
        ascensionSideQuests.add(new ExpandableItem(
                "Gersch Device EE Steps",
                new ArrayList<>(Arrays.asList(
                        "Obtain the Gersch Device from the Mystery Box after turning on the power.",
                        "Travel to the area with the MP5K wallbuy and locate the generator or electrical box outside the playable area.",
                        "Throw a Gersch Device at the generator to suck it into the black hole, triggering an audio cue.",
                        "Activate terminals and nodes around the map as instructed by lights or symbols that appear.",
                        "Use a combination of the Gersch Device, Ray Gun, Thunder Gun (Zeus Cannon), and Matryoshka Dolls on an energy orb or node.",
                        "Follow each step in order, making sure all required weapons are used to bombard the energy orb.",
                        "Complete the full sequence to free Gersh and trigger a long dialogue sequence.",
                        "As a reward, receive a temporary Death Machine and, in some versions, additional perk or story bonuses."
                ))
        ));
        ascensionSideQuests.add(new ExpandableItem(
                "Free Perk from Space Monkeys",
                new ArrayList<>(Arrays.asList(
                        "Keep track of when a Space Monkey round is about to start, usually every few rounds after perks are purchased.",
                        "During a Space Monkey round, protect all active perk machines on the map by standing near them.",
                        "Kill Space Monkeys rapidly before they have time to damage or steal perks from any machine.",
                        "Avoid letting monkeys repeatedly hit a single perk machine, as they can downgrade or remove your perk.",
                        "If you successfully protect all perk machines without any damage, you will be rewarded with a free perk bottle.",
                        "Collect the free perk power-up to gain an extra perk beyond your current loadout."
                ))
        ));
        ascensionSideQuests.add(new ExpandableItem(
                "Radio Messages",
                new ArrayList<>(Arrays.asList(
                        "Search control rooms, platforms, and off-path areas for radios placed on tables, consoles, or shelves.",
                        "Interact with each radio you find to play a segment of story dialogue related to the cosmodrome and Gersh.",
                        "Some radios become more thematically relevant after certain steps of the main quest have been completed.",
                        "Trigger multiple radios in one game to hear them in context and piece together the Ascension storyline.",
                        "Use the lore to better understand the connection between Ascension and later Zombies maps."
                ))
        ));

        ArrayList<ExpandableItem> ascensionBuildables = new ArrayList<>();
        ascensionBuildables.add(new ExpandableItem(
                "Lunar Landers",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power so the lunar lander systems become operational.",
                        "Navigate the map to locate each lunar lander station in different sections of the cosmodrome.",
                        "Call the lander to your location by interacting with the control panel at the station.",
                        "Board the lander and ride it to its destination to quickly traverse the map.",
                        "Use the landers both for fast movement and to progress the rocket launch requirement by using all three."
                ))
        ));
        ascensionBuildables.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power in the main control room to enable systems and landers.",
                        "Use and ride all three lunar landers at their respective stations around the map.",
                        "Return to the central launch area and activate the rocket launch sequence.",
                        "Once the rocket has launched, access the newly opened area below the launch pad.",
                        "Find the Pack-a-Punch machine in this area and place your weapon inside to upgrade it.",
                        "Collect your upgraded weapon and continue using the area as a strategic defense point."
                ))
        ));
        ascensionBuildables.add(new ExpandableItem(
                "Rocket Launch Sequence",
                new ArrayList<>(Arrays.asList(
                        "Ensure that power is turned on and all three lunar landers have been called and used.",
                        "Go to the main launch control room overlooking the central rocket.",
                        "Interact with the launch control or button to begin the rocket ignition sequence.",
                        "Watch the rocket lift off from the central pad, sometimes being shootable or destructible in specific versions.",
                        "Observe the explosion or debris that clears the path to a lower area under the rocket.",
                        "Use the newly opened space to reach the Pack-a-Punch machine and expand your movement options."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.ASCENSION,
                new Map_OBJECT(
                        Enums.COD_MAP.ASCENSION.toString(),
                        R.drawable.ascension_boi,
                        ascensionMainQuest,
                        ascensionSideQuests,
                        ascensionBuildables,
                        "https://www.youtube.com/watch?v=p8IT1p3xXOU"
                )
        );

        // -------------------------- CALL OF THE DEAD --------------------------
        ArrayList<ExpandableItem> cotdMainQuest = new ArrayList<>();
        cotdMainQuest.add(new ExpandableItem(
                "Stand-In Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power by following the ship and lighthouse pathways to the generator switches.",
                        "Go to the locked room where the original characters (Dempsey, Nikolai, Takeo, and Richtofen) are trapped.",
                        "Interact with the door to speak with the trapped crew and begin the Stand-In quest.",
                        "Search the room above for a missing fuse and pick it up from one of several possible spawn locations.",
                        "Return to the locked door and place the fuse in the fuse box next to it.",
                        "Knife or interact with the fuse box to reactivate the systems and progress the quest.",
                        "Complete the various tasks given by the trapped crew, such as dealing with generators, radios, and dials around the map.",
                        "Carry out the steps involving focusing beams, foghorn codes, and directed energy toward the lighthouse.",
                        "Finish the final objective directed by the crew to fully resolve the Stand-In quest.",
                        "Receive the in-game reward, such as the Wunderwaffe DG-2 drop, and complete the Stand-In achievement."
                ))
        ));

        ArrayList<ExpandableItem> cotdSideQuests = new ArrayList<>();
        cotdSideQuests.add(new ExpandableItem(
                "Song - Not Ready to Die",
                new ArrayList<>(Arrays.asList(
                        "Search the map for three Element 115 rock or music trigger objects hidden in icy or cliffside locations.",
                        "Interact with the first music trigger to begin the activation sequence.",
                        "Locate the second trigger in another area of the map, such as near the lighthouse or ship exterior.",
                        "Interact with the second trigger to continue the song activation.",
                        "Find the third and final trigger and interact with it.",
                        "After activating all three, the song ‘Not Ready to Die’ begins playing.",
                        "Continue surviving while the song runs; this Easter egg is purely musical."
                ))
        ));
        cotdSideQuests.add(new ExpandableItem(
                "Hidden Radios",
                new ArrayList<>(Arrays.asList(
                        "Explore the ship, lighthouse levels, and surrounding frozen areas for radios on crates and shelves.",
                        "Interact with each radio you find to play secret story-related audio logs.",
                        "Some radios may be easier to hear when other in-game sounds are quieter.",
                        "Trigger all radios in one match to hear the full narrative context behind the Call of the Dead events.",
                        "Use the information from the radios to tie Call of the Dead into the broader Zombies storyline."
                ))
        ));
        cotdSideQuests.add(new ExpandableItem(
                "Golden Rod Quest Steps",
                new ArrayList<>(Arrays.asList(
                        "Progress through the Stand-In quest until the steps involving the Golden Rod are active.",
                        "Complete the generator and fuse box steps to reconfigure the flow of power around the map.",
                        "Interact with specific dials and electrical boxes to direct energy toward the lighthouse.",
                        "Use tactical grenades or other explosives where required to charge or activate key devices.",
                        "Follow the instructions from the trapped crew regarding the positioning and powering of the Golden Rod.",
                        "Deliver the energized Golden Rod to the correct location or device to finalize that part of the quest.",
                        "This sequence is crucial to completing Stand-In and advancing Richtofen’s larger plan."
                ))
        ));
        cotdSideQuests.add(new ExpandableItem(
                "Fog Horn Easter Egg",
                new ArrayList<>(Arrays.asList(
                        "Locate the large foghorns scattered around the icy areas and near the shorelines.",
                        "Listen carefully for sound clues or watch guides to learn the correct order to interact with them.",
                        "Activate the foghorns in the specific sequence within a short time window.",
                        "If done correctly, a unique audio cue will play, confirming the Easter egg has been triggered.",
                        "This Easter egg is mainly atmospheric and helps uncover more of the map’s mystery and sound design."
                ))
        ));

        ArrayList<ExpandableItem> cotdBuildables = new ArrayList<>();
        cotdBuildables.add(new ExpandableItem(
                "Pack A Punch Lighthouse",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power so the lighthouse beam and ship systems become active.",
                        "Watch the lighthouse beam to determine where the Pack-a-Punch machine is currently located.",
                        "Open paths around the map so you can quickly reach the area indicated by the lighthouse beam.",
                        "Navigate to the Pack-a-Punch location when the lighthouse points to it and the machine emerges.",
                        "Place your weapon into the Pack-a-Punch machine and wait for the upgrade to complete.",
                        "Keep track of future Pack-a-Punch location changes by watching the lighthouse beam rotate."
                ))
        ));
        cotdBuildables.add(new ExpandableItem(
                "Zipline",
                new ArrayList<>(Arrays.asList(
                        "Locate the zipline connection points between the ship and adjacent platforms or land areas.",
                        "Turn on the power to ensure the zipline is operational.",
                        "Approach the zipline platform and interact to ride it across the gap.",
                        "Use the zipline to quickly escape when zombies overrun your position on the ship or shore.",
                        "Coordinate with teammates so you do not leave someone stranded during a critical moment."
                ))
        ));
        cotdBuildables.add(new ExpandableItem(
                "Flinger",
                new ArrayList<>(Arrays.asList(
                        "Locate the mechanical flinger platform on the map, usually near cliffside or elevated areas.",
                        "Step carefully onto the flinger pad and wait for the activation opportunity.",
                        "Trigger the flinger by interacting with the control or by waiting for its automatic launch cycle.",
                        "Use the flinger to launch yourself across gaps or from dangerous areas to safer zones.",
                        "Be cautious of timing so you do not launch into a horde of zombies or off the map."
                ))
        ));
        cotdBuildables.add(new ExpandableItem(
                "V-R11 Wonder Weapon",
                new ArrayList<>(Arrays.asList(
                        "Spin the Mystery Box until you obtain the V-R11 Wonder Weapon.",
                        "Use the V-R11 on zombies to transform them into humans that briefly run away.",
                        "Use the weapon on teammates in co-op (in supported versions) to make them temporarily invulnerable to zombie attacks.",
                        "Utilize the V-R11 for specific quest steps or achievements that require it.",
                        "Manage ammo carefully, as V-R11 shots are limited and vital for certain Easter egg objectives."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.CALL_OF_THE_DEAD,
                new Map_OBJECT(
                        Enums.COD_MAP.CALL_OF_THE_DEAD.toString(),
                        R.drawable.cotd_boi,
                        cotdMainQuest,
                        cotdSideQuests,
                        cotdBuildables,
                        "https://www.youtube.com/watch?v=42dIAt2-VpM"
                )
        );

        // -------------------------- DEAD OPS ARCADE --------------------------
        ArrayList<ExpandableItem> doaSideQuests = new ArrayList<>();
        doaSideQuests.add(new ExpandableItem(
                "Top-Down Arcade Shooter Mode",
                new ArrayList<>(Arrays.asList(
                        "From the main Call of Duty: Black Ops menu, access the hidden arcade terminal or extras menu.",
                        "Launch Dead Ops Arcade to start the top-down twin-stick shooter experience.",
                        "Use the left stick to move and the right stick (or fire button) to shoot in any direction.",
                        "Survive waves of zombies in each arena, collecting treasure and power-ups.",
                        "Progress through stages and bonus rooms to see more environments and enemy types."
                ))
        ));
        doaSideQuests.add(new ExpandableItem(
                "Silverback Storyline",
                new ArrayList<>(Arrays.asList(
                        "Continue playing Dead Ops Arcade to advance through rounds and waves.",
                        "Encounter the Cosmic Silverback, a powerful boss gorilla enemy tied to the mode’s mini-story.",
                        "Avoid or fight back against the Silverback’s attacks when it appears.",
                        "Survive encounters and advance to later maps that show more clues about the Silverback.",
                        "Piece together the loose narrative of Dead Ops through gameplay, enemies, and cutscenes."
                ))
        ));
        doaSideQuests.add(new ExpandableItem(
                "Bonus Rooms",
                new ArrayList<>(Arrays.asList(
                        "Look for portals or warp points that appear after clearing certain waves.",
                        "Enter these portals to be taken to treasure-filled bonus rooms.",
                        "Collect as many gems, gold, and power-ups as possible before the timer expires.",
                        "Use the extra points and items to boost your score and survivability in later waves.",
                        "Exit the bonus room automatically when time runs out or when the game forces progression."
                ))
        ));
        doaSideQuests.add(new ExpandableItem(
                "Hidden Fate Rooms",
                new ArrayList<>(Arrays.asList(
                        "Progress far enough into Dead Ops Arcade to encounter special paths or portals.",
                        "Enter secret paths that lead to Fate Rooms offering powerful persistent upgrades.",
                        "Choose one of the available fates, such as improved firepower, speed, or defensive boosts.",
                        "Use your chosen fate to drastically improve performance in subsequent waves.",
                        "Experiment with different fates across runs to find the style that fits you best."
                ))
        ));

        ArrayList<ExpandableItem> doaBuildables = new ArrayList<>();
        doaBuildables.add(new ExpandableItem(
                "First-Person Powerup",
                new ArrayList<>(Arrays.asList(
                        "Watch for special power-up icons that appear randomly on the battlefield.",
                        "Collect the first-person power-up when it drops to temporarily switch to a first-person view.",
                        "Use the new perspective to mow down zombies with heightened immersion.",
                        "Be aware that the change in camera view can alter your awareness of enemy positions.",
                        "When the duration ends, you will automatically return to the standard top-down view."
                ))
        ));
        doaBuildables.add(new ExpandableItem(
                "Vehicle Powerups",
                new ArrayList<>(Arrays.asList(
                        "Pick up vehicle-related power-ups such as tanks or cars when they appear on the map.",
                        "Enter the vehicle automatically to gain temporary protection and increased firepower.",
                        "Run over zombies and shoot from the vehicle to quickly clear entire waves.",
                        "Watch the vehicle’s health or timer, as it will eventually be destroyed or expire.",
                        "Exit the vehicle and return to normal movement once the power-up ends."
                ))
        ));
        doaBuildables.add(new ExpandableItem(
                "Gem Scoring System",
                new ArrayList<>(Arrays.asList(
                        "Destroy zombies and obstacles to spawn gems, gold bars, and other score items.",
                        "Collect these items while avoiding being cornered by zombies.",
                        "Prioritize higher-value gems when it is safe to do so to maximize your score.",
                        "Use score milestones to compete with friends or personal best records.",
                        "Balance risk and reward when choosing whether to grab gems near large zombie groups."
                ))
        ));
        doaBuildables.add(new ExpandableItem(
                "Special Weapons Drops",
                new ArrayList<>(Arrays.asList(
                        "Watch for weapon crate or special icon drops after killing large groups of zombies.",
                        "Pick up temporary special weapons such as powerful explosives, rapid-fire guns, or area-of-effect attacks.",
                        "Use these special weapons during intense waves or when surrounded.",
                        "Be mindful of the limited duration or ammo of each special weapon.",
                        "Chain power-ups and special weapons strategically to reach higher rounds in Dead Ops Arcade."
                ))
        ));

        mapObjects.put(
                Enums.COD_MAP.DEAD_OPS_ARCADE,
                new Map_OBJECT(
                        Enums.COD_MAP.DEAD_OPS_ARCADE.toString(),
                        R.drawable.deadopsarcade_boi,
                        new ArrayList<>(),
                        doaSideQuests,
                        doaBuildables,
                        "https://www.youtube.com/watch?v=5krOwJ3bAJw"
                )
        );

        return mapObjects;
    }
}
