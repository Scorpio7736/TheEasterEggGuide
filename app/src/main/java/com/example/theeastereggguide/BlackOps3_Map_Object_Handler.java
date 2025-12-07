package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BlackOps3_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops III --------------------------

        // -------------------------- SHADOWS OF EVIL --------------------------
        ArrayList<ExpandableItem> soeMainQuest = new ArrayList<>();
        soeMainQuest.add(new ExpandableItem(
                "Main Quest - Sacrifice Rituals and Gateworms",
                new ArrayList<>(Arrays.asList(
                        "Begin the game and locate each character’s summoning item (e.g., pen, lawyer’s badge, championship belt, detective’s badge) in Beast Mode.",
                        "Open the ritual rooms in each district (Canal, Footlight, Waterfront) using Beast Mode to power up doors and grapple points.",
                        "Place each summoning item on its corresponding ritual altar and start the sacrifice ritual while fending off Keepers.",
                        "Complete all four rituals (three districts plus the Ruby Rabbit/theatre area) to obtain the Gateworms needed for the final ritual.",
                        "Collect the Gateworms and the Summoning Key to prepare for opening the giant Rift door in the underground area."
                ))
        ));
        soeMainQuest.add(new ExpandableItem(
                "Summoning the Apothicon and Shadowman Boss Fight",
                new ArrayList<>(Arrays.asList(
                        "Travel to the Rift area and open the wall with Beast Mode to access the large stone archway.",
                        "Place the Gateworms and Summoning Key at the designated points in the Rift to form platforms and open dimensional portals.",
                        "Enter the Apothicon realm and activate the four corruption generators/altars to power the arena.",
                        "Lure the Shadowman into view and shoot him while he floats above the altar, forcing him into the Summoning Key.",
                        "Defend the flags and complete the flag escort steps, then finish the sequence to trap the Shadowman and trigger the ending cutscene."
                ))
        ));

        ArrayList<ExpandableItem> soeSideQuests = new ArrayList<>();
        soeSideQuests.add(new ExpandableItem(
                "Song - Snakeskin Boots",
                new ArrayList<>(Arrays.asList(
                        "Locate the hidden musical trigger objects (such as radios or microphones) scattered around Morg City.",
                        "Interact with the first trigger to hear a confirmation audio cue.",
                        "Find and interact with the remaining triggers in different districts or hidden rooms.",
                        "After activating all of them, the song 'Snakeskin Boots' will begin to play over the match.",
                        "Enjoy the music while continuing to complete rituals, upgrade weapons, or go for high rounds."
                ))
        ));
        soeSideQuests.add(new ExpandableItem(
                "Sword Upgrade Quest",
                new ArrayList<>(Arrays.asList(
                        "Find all egg statues beneath the Pack-a-Punch area and place the Apothicon Egg on each Cthulhu statue to charge it with souls.",
                        "Kill zombies near each statue until the egg absorbs enough souls, then return to the egg altar to receive your base sword.",
                        "Locate your character’s personal symbol in the district and interact with the corresponding Keeper symbol to accept a side quest.",
                        "Complete the Keeper challenges in different locations by defending the ghostly Keeper while it drains souls from zombies.",
                        "Return to the underground to claim the upgraded sword, granting you stronger attacks and charged abilities."
                ))
        ));
        soeSideQuests.add(new ExpandableItem(
                "Civil Protector Fuses",
                new ArrayList<>(Arrays.asList(
                        "Search each district’s train or tram route for fuse boxes that can be picked up from the tram’s interior.",
                        "Collect all three fuses, one from each district’s tram, by riding the tram and looking along the rails.",
                        "Take the fuses to the underground subway area and insert them into the control panel near the Civil Protector station.",
                        "Once powered, activate the Civil Protector from call boxes located in each district by spending points.",
                        "Use the Civil Protector as an AI ally to revive players, kill zombies, and help defend objective areas."
                ))
        ));
        soeSideQuests.add(new ExpandableItem(
                "Flag Step Defense",
                new ArrayList<>(Arrays.asList(
                        "After sufficient progress in the main quest, obtain the flag from the Rift area to begin the defense step.",
                        "Carry the flag to marked ritual circles around the map while Margwas, parasites, and other enemies attack.",
                        "Place the flag in each marked circle and defend it from waves of enemies until souls fully charge it.",
                        "Move the charged flag to the designated altar or ritual table to progress the Shadowman sequence.",
                        "Repeat the flag defense process at multiple locations until all required circles are complete."
                ))
        ));
        soeSideQuests.add(new ExpandableItem(
                "Margwa Heart / Eggs Side Tasks",
                new ArrayList<>(Arrays.asList(
                        "Defeat Margwas during rituals or later rounds to obtain Margwa Hearts as rare drops.",
                        "Use the Margwa Heart as a component in crafting or upgrading certain Apothicon-related weapons or items.",
                        "Collect eggs in the underground area and place them at Cthulhu statues to charge them with zombie souls.",
                        "Leverage these eggs and Margwa items to progress sword upgrades and other hidden mechanics.",
                        "Combine these side tasks with the main quest to fully unlock Shadows of Evil’s Apothicon powers."
                ))
        ));

        ArrayList<ExpandableItem> soeBuildables = new ArrayList<>();
        soeBuildables.add(new ExpandableItem(
                "Ritual Altars",
                new ArrayList<>(Arrays.asList(
                        "Identify each character’s ritual altar location in Morg City (e.g., Ruby Rabbit, Boxing Gym, Footlight stage).",
                        "Use Beast Mode to open locked doors and power up symbols leading to each altar room.",
                        "Bring the associated ritual item to the altar and place it on the central table.",
                        "Start the ritual and survive waves of Keepers until the ritual completes.",
                        "Collect the resulting Gateworm or Summoning Key advancement from each finished ritual."
                ))
        ));
        soeBuildables.add(new ExpandableItem(
                "Apothicon Servant",
                new ArrayList<>(Arrays.asList(
                        "Obtain the Margwa Heart, Xenomatter, and Tentacle from Margwas and parasites as rare drops.",
                        "Once all parts are collected, find a crafting table such as in the Footlight, Canal, or Waterfront districts.",
                        "Assemble the parts at the build table to create the Apothicon Servant.",
                        "Use the Servant’s charged shot to create a powerful black hole that sucks in and kills nearby zombies.",
                        "Manage its limited ammo carefully during high-round or main quest steps."
                ))
        ));
        soeBuildables.add(new ExpandableItem(
                "Civil Protector",
                new ArrayList<>(Arrays.asList(
                        "Insert all three fuses into the underground panel to power up the Civil Protector system.",
                        "Look for Civil Protector call boxes in each district marked with a blue light.",
                        "Spend points at a call box to summon the Civil Protector to that location.",
                        "Use the Civil Protector’s strong weaponry and revive capability to help through difficult rounds.",
                        "Re-summon him as needed once his timer runs out, as long as you have enough points."
                ))
        ));
        soeBuildables.add(new ExpandableItem(
                "Beast Mode Mechanic",
                new ArrayList<>(Arrays.asList(
                        "Activate Beast Mode by interacting with the purple flaming fountains around Morg City.",
                        "In Beast form, quickly shock power boxes, grapple to high ledges, and smash weak walls.",
                        "Use Beast Mode to open shortcuts, power perk machines, and reveal hidden paths for rituals.",
                        "Plan your route before entering Beast Mode to maximize the number of actions completed per activation.",
                        "Return to human form when the timer ends, then repeat on future rounds as new tasks appear."
                ))
        ));
        soeBuildables.add(new ExpandableItem(
                "Pack A Punch Rift",
                new ArrayList<>(Arrays.asList(
                        "Open the rift door in each district by using Beast Mode to break the wall with symbol markings.",
                        "Enter the Rift to access the underground subway hub connecting all districts.",
                        "Complete the necessary rituals and place the Gateworms to open the Pack-a-Punch altar.",
                        "Interact with the now-stabilized Pack-a-Punch machine to upgrade your weapons.",
                        "Use the Rift as a fast travel hub while defending the Pack-a-Punch area from enemies."
                ))
        ));

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

        // -------------------------- THE GIANT --------------------------
        ArrayList<ExpandableItem> giantMainQuest = new ArrayList<>();
        giantMainQuest.add(new ExpandableItem(
                "Hidden Beacon Main Quest (Annihilator / Teleporter Panel Step)",
                new ArrayList<>(Arrays.asList(
                        "Link and use all three teleporters at least once to unlock the central teleporter console panel.",
                        "Interact with the newly revealed panel in the middle to reveal hidden buttons or indicators.",
                        "Use the teleporters again under specific conditions (such as timers or light patterns) to trigger further events.",
                        "Activate the Fly Trap Easter egg and follow the beacon clues to unlock the Annihilator pistol.",
                        "Collect the Annihilator from its secret location and use it as a powerful special weapon."
                ))
        ));

        ArrayList<ExpandableItem> giantSideQuests = new ArrayList<>();
        giantSideQuests.add(new ExpandableItem(
                "Song - Beauty of Annihilation (Remix)",
                new ArrayList<>(Arrays.asList(
                        "Locate the hidden musical triggers such as teddy bears scattered around The Giant.",
                        "Interact with the first teddy bear to begin the song activation process.",
                        "Find the second and third bears in different parts of the facility, such as catwalk or laboratories.",
                        "Once all three bears are activated, the remix of 'Beauty of Annihilation' will start playing.",
                        "Continue your survival or Easter egg attempts with the iconic track in the background."
                ))
        ));
        giantSideQuests.add(new ExpandableItem(
                "Fly Trap Easter Egg",
                new ArrayList<>(Arrays.asList(
                        "Obtain a Pack-a-Punched weapon (such as the Anointed Avenger) from the Pack-a-Punch machine.",
                        "Go to the rear of the map near the teleporter B area and aim at the small panel behind the fence.",
                        "Shoot the panel with your upgraded weapon to activate the Fly Trap Easter egg.",
                        "Listen to the eerie dialogue and search for floating objects around the map to shoot.",
                        "Complete all object shots to progress the hidden beacon and unlock additional rewards."
                ))
        ));
        giantSideQuests.add(new ExpandableItem(
                "Monkey Bomb Plinko",
                new ArrayList<>(Arrays.asList(
                        "Acquire Monkey Bombs from the Mystery Box.",
                        "Find the Pack-a-Punch area and look toward the catwalk/laboratory zone where the Plinko-style board is located.",
                        "Throw Monkey Bombs into specific openings or tubs near the board.",
                        "Watch as the Monkey Bomb triggers a small mini-event or hidden animation.",
                        "Use this purely as a fun Easter egg and bragging rights amongst friends."
                ))
        ));
        giantSideQuests.add(new ExpandableItem(
                "Secret Perk Easter Egg",
                new ArrayList<>(Arrays.asList(
                        "Link all three teleporters and pay close attention to the beacon indicators around the map.",
                        "Complete the Fly Trap and other side interactions to potentially trigger bonus effects.",
                        "At certain thresholds, you may reveal a hidden perk machine location or bonus perk reward.",
                        "Check areas not normally used for perks, such as behind certain doors or off-path corners.",
                        "Use the extra perk slot to strengthen your preferred high-round loadout."
                ))
        ));

        ArrayList<ExpandableItem> giantBuildables = new ArrayList<>();
        giantBuildables.add(new ExpandableItem(
                "Teleporters",
                new ArrayList<>(Arrays.asList(
                        "Locate all three teleporters positioned around the outer edges of The Giant facility.",
                        "Link each teleporter to the mainframe by pressing the activation button at the pad and then quickly using the mainframe switch.",
                        "After linking, use teleporters as fast travel between outlying zones and the central area.",
                        "Teleporters also contribute to unlocking hidden panels and Easter egg-related features when fully activated.",
                        "Use them strategically to escape tight situations or reposition during dog rounds and high rounds."
                ))
        ));
        giantBuildables.add(new ExpandableItem(
                "Pack A Punch",
                new ArrayList<>(Arrays.asList(
                        "Link all three teleporters to the mainframe to unlock the Pack-a-Punch machine in the central courtyard.",
                        "Save up 5000 points and interact with the machine to upgrade your weapon.",
                        "Use upgraded weapons to handle higher-health zombies and defend the catwalk more effectively.",
                        "Revisit Pack-a-Punch between rounds when it is safe to upgrade additional weapons.",
                        "Combine upgraded guns with key perks like Juggernog and Double Tap for optimal survival."
                ))
        ));
        giantBuildables.add(new ExpandableItem(
                "HV Flamethrower Trap Variant",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power to enable electric and fire-based traps around the facility.",
                        "Locate the trap switches near choke points like the catwalk entrance or corridor intersections.",
                        "Spend points to activate the trap, releasing powerful fire or electricity along the hallway.",
                        "Lure zombies through the active trap area to kill large groups without spending ammo.",
                        "Be careful not to trap teammates or yourself in the kill zone while the trap is active."
                ))
        ));
        giantBuildables.add(new ExpandableItem(
                "Dog Rounds",
                new ArrayList<>(Arrays.asList(
                        "Every few rounds, prepare for Hellhound dog rounds signaled by eerie fog and howling.",
                        "Move to an area with open sightlines where dogs can be easily seen and targeted.",
                        "Use shotguns or automatic weapons to quickly eliminate incoming dogs.",
                        "After defeating the final dog, collect the Max Ammo power-up dropped as a reward.",
                        "Use the downtime between dog rounds to reload, reposition, and prepare for the next zombie wave."
                ))
        ));

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

        // -------------------------- DER EISENDRACHE --------------------------
        ArrayList<ExpandableItem> deMainQuest = new ArrayList<>();
        deMainQuest.add(new ExpandableItem(
                "My Brother's Keeper Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power at the castle and unlock access to the pyramid room and rocket test site.",
                        "Build and upgrade the four elemental bows by feeding dragon heads and completing each bow’s questline.",
                        "Activate and complete the Keeper ritual in the pyramid room using the upgraded bows to charge the Keeper.",
                        "Collect souls in designated areas around the map to power up the Keeper’s stone and the summoning circle.",
                        "Progress through the story steps until you unlock the boss fight arena against the Keeper in the moon’s chamber."
                ))
        ));
        deMainQuest.add(new ExpandableItem(
                "Keeper Boss Fight and Moon Destruction",
                new ArrayList<>(Arrays.asList(
                        "Enter the final arena via the teleporter once all previous quest steps are completed.",
                        "Use upgraded bows, the Ragnarok DG-4, and high-damage weapons to damage the Keeper during vulnerability phases.",
                        "Avoid or counter the Keeper’s powerful attacks, including skull projectiles and shockwaves.",
                        "Place the Ragnarok DG-4 at designated spots to trap or stun the Keeper as part of the final damage cycles.",
                        "Defeat the Keeper to trigger the cinematic sequence that shows the destruction of the Moon and concludes the map’s story."
                ))
        ));

        ArrayList<ExpandableItem> deSideQuests = new ArrayList<>();
        deSideQuests.add(new ExpandableItem(
                "Song - Dead Again",
                new ArrayList<>(Arrays.asList(
                        "Search the castle for hidden radios or teddy bears that act as musical triggers.",
                        "Interact with each of the three triggers scattered around Der Eisendrache.",
                        "After activating all three, the song 'Dead Again' will begin to play.",
                        "Use the music to set the mood while you work on bow upgrades or the main quest.",
                        "Enjoy the track as a reward for thoroughly exploring the castle."
                ))
        ));
        deSideQuests.add(new ExpandableItem(
                "Wrath of the Ancients Upgrade Quests (4 Bows)",
                new ArrayList<>(Arrays.asList(
                        "Feed all three stone dragons by killing zombies beneath them until they turn to stone and crumble.",
                        "Collect the Wrath of the Ancients bow from the hidden alcove once all dragons are completed.",
                        "Choose an elemental bow upgrade quest (Fire, Lightning, Void, or Wolf) by interacting with its corresponding symbol or painting.",
                        "Complete each bow’s specific tasks, such as shooting bonfires, collecting skulls, or following wolf spirits.",
                        "Return to the upgrade forge, fill it with zombie souls, and claim the fully upgraded elemental bow."
                ))
        ));
        deSideQuests.add(new ExpandableItem(
                "Ragnarok DG-4 Parts Quest",
                new ArrayList<>(Arrays.asList(
                        "Shoot the rocket test area object during a test to make a DG-4 part accessible and then retrieve it.",
                        "Use the Death Ray trap and search the area above it for another DG-4 part that drops onto the map.",
                        "Collect a final part from one of the Panzer Soldat enemies when they are defeated.",
                        "Bring all three parts to the crafting table near the pyramid room to assemble the Ragnarok DG-4.",
                        "Use the Ragnarok DG-4 for high-damage slams and to immobilize enemies during boss fights and high rounds."
                ))
        ));
        deSideQuests.add(new ExpandableItem(
                "Plunger / Clock Side EE",
                new ArrayList<>(Arrays.asList(
                        "Interact with certain clocks and mechanisms in the castle to initiate a hidden time-travel sequence.",
                        "Teleport to specific eras via the teleporter and observe changes in the environment.",
                        "Find and acquire the Plunger melee weapon as a novelty and Easter egg reward.",
                        "Use the Plunger as a fun alternate melee weapon against zombies and Panzers.",
                        "Experiment with clock interactions to uncover additional lore or time-based secrets."
                ))
        ));
        deSideQuests.add(new ExpandableItem(
                "Lava/Storm Rocket Pad Events",
                new ArrayList<>(Arrays.asList(
                        "Travel to the rocket test area using the tram or teleporter.",
                        "Stay alert for the start of a rocket test signaled by lights and alarms.",
                        "During the test, find cover or move to safe zones to avoid being killed by the rocket blast.",
                        "Use the rocket test period to trigger certain Easter egg steps or collect DG-4 parts.",
                        "Return to the castle when safe, using the test area primarily for specific quests and high-risk training."
                ))
        ));

        ArrayList<ExpandableItem> deBuildables = new ArrayList<>();
        deBuildables.add(new ExpandableItem(
                "Wrath of the Ancients Bow",
                new ArrayList<>(Arrays.asList(
                        "Feed all three dragons by killing zombies in their proximity until each statue is fully satisfied.",
                        "After all dragons are complete, a secret wall in the castle will open up.",
                        "Retrieve the Wrath of the Ancients bow from its resting place behind the wall.",
                        "Use the bow’s charged shots for powerful crowd control and as a base for elemental upgrades.",
                        "Carry the bow as a vital tool for both solo and co-op runs in Der Eisendrache."
                ))
        ));
        deBuildables.add(new ExpandableItem(
                "Ragnarok DG-4",
                new ArrayList<>(Arrays.asList(
                        "Collect all three parts from the rocket test site, Death Ray trap, and Panzer Soldats.",
                        "Build the Ragnarok DG-4 at the crafting table near the pyramid room.",
                        "Equip the DG-4 as a special weapon with limited charge but devastating effects.",
                        "Use its slam attack to stun and kill large groups of zombies in tight areas.",
                        "Deploy it strategically in boss fights and high-round defenses for maximum impact."
                ))
        ));
        deBuildables.add(new ExpandableItem(
                "Wunderfizz",
                new ArrayList<>(Arrays.asList(
                        "Locate the Wunderfizz machine, which may move between rounds to different points in the castle.",
                        "Spend points at the machine to receive a random perk not necessarily available from standard machines.",
                        "Use Wunderfizz to gain access to perks like Electric Cherry or others not stationed in fixed locations.",
                        "Check the sky or machine indicators to track where Wunderfizz is currently active.",
                        "Incorporate Wunderfizz into your perk strategy when going for maximum survivability builds."
                ))
        ));
        deBuildables.add(new ExpandableItem(
                "Anti-Gravity Room",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power and activate specific floor panels in the pyramid room to initiate anti-gravity.",
                        "Wait for the gravity to switch off, allowing you to wall-run along the room’s edges.",
                        "Use anti-gravity to reach hidden symbols, wall-run challenges, or bow upgrade clues.",
                        "Train zombies carefully in the low-gravity environment to avoid losing control of the horde.",
                        "Time your movements to maximize the benefits of anti-gravity for quests and high-round strategies."
                ))
        ));
        deBuildables.add(new ExpandableItem(
                "Rocket Test Area",
                new ArrayList<>(Arrays.asList(
                        "Access the rocket test area via the teleporter once power is active.",
                        "Use the area to start rocket tests that are essential for certain Easter egg and DG-4 parts.",
                        "Stay aware of the countdown alarms that indicate when to seek cover from the rocket’s blast.",
                        "Leverage the rocket area as a high-risk but rewarding training zone between tests.",
                        "Return to the main castle via the teleporter or tram once your objectives are complete."
                ))
        ));

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

        // -------------------------- ZETSUBOU NO SHIMA --------------------------
        ArrayList<ExpandableItem> znsMainQuest = new ArrayList<>();
        znsMainQuest.add(new ExpandableItem(
                "Seeds of Doubt / Division 9 Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the temporary and then permanent power by filling generators with irradiated water and activating the main switch.",
                        "Build the KT-4 and Skull of Nan Sapwe by completing their respective part and trial sequences.",
                        "Complete the Division 9 lab objectives, including aligning pipes, valves, and power conduits for the facility.",
                        "Collect rainbow water, exotic plants, and perform experiments that reveal the truth of Division 9’s operations.",
                        "Unlock the final bunker area and prepare for the concluding boss fight tied to Takeo’s story."
                ))
        ));
        znsMainQuest.add(new ExpandableItem(
                "Takeo's Ending and Spider Boss Fight",
                new ArrayList<>(Arrays.asList(
                        "Use the Skull of Nan Sapwe to access hidden walls and secret areas within the facility.",
                        "Trigger the giant spider boss fight by entering its lair and surviving its poison and minions.",
                        "Defeat the spider to gain rewards such as a free Widow’s Wine perk or special items.",
                        "Progress through the final ritual chamber where Takeo confronts his corrupted self.",
                        "Witness the emotional ending scene as Primis Takeo resolves his fate and the main quest concludes."
                ))
        ));

        ArrayList<ExpandableItem> znsSideQuests = new ArrayList<>();
        znsSideQuests.add(new ExpandableItem(
                "Song - Dead Flowers",
                new ArrayList<>(Arrays.asList(
                        "Search the swamp, bunker, and lab areas of Zetsubou No Shima for hidden music triggers.",
                        "Activate the first trigger to start the hidden song Easter egg sequence.",
                        "Locate the remaining triggers around the map and interact with them in the same game.",
                        "Once all triggers are activated, the song 'Dead Flowers' will start playing.",
                        "Use the track as atmospheric backing while you grow plants, complete trials, and explore the facility."
                ))
        ));
        znsSideQuests.add(new ExpandableItem(
                "KT-4 / Masamune Upgrade Quest",
                new ArrayList<>(Arrays.asList(
                        "Collect KT-4 parts, including green test tubes, plant samples, and vial components from labs and spider encounters.",
                        "Build the KT-4 at the crafting table located in the bunker laboratory.",
                        "To upgrade to the Masamune, gather special items like colored liquids, plant mutations, and additional rare samples.",
                        "Perform experiments and use the labs to infuse the KT-4 with enhanced chemical reagents.",
                        "Upgrade to the Masamune for stronger shots, better crowd control, and required steps in advanced Easter egg paths."
                ))
        ));
        znsSideQuests.add(new ExpandableItem(
                "Skull of Nan Sapwe Trial",
                new ArrayList<>(Arrays.asList(
                        "Find the altar with four skulls and corresponding symbols in the spawn area.",
                        "Pick up a skull and place it on a matching symbol pedestal in different parts of the map.",
                        "Defend the skull from waves of zombies and corrupted enemies until its ritual completes.",
                        "Repeat for all four skulls, then return to the altar to claim the Skull of Nan Sapwe.",
                        "Use the Skull’s beam attack and mesmerize ability for both combat and secret wall reveals."
                ))
        ));
        znsSideQuests.add(new ExpandableItem(
                "Spider Bait Side EE",
                new ArrayList<>(Arrays.asList(
                        "During the spider boss fight or spider rounds, complete hidden steps tied to specific spider interactions.",
                        "Use certain weapons or items to damage spiders in unusual ways or in designated areas.",
                        "Collect key drops from special spiders as part of a multi-step sequence.",
                        "Perform the final ritual or activation to unlock Spider Bait, allowing you to control a spider temporarily.",
                        "Use Spider Bait for fun movement, exploration, and to confuse your friends in co-op."
                ))
        ));
        znsSideQuests.add(new ExpandableItem(
                "Plant Mutations and Challenges",
                new ArrayList<>(Arrays.asList(
                        "Use buckets to gather colored water from different sources (blue, green, purple) around the map.",
                        "Plant seeds in designated soil pots and water them with specific combinations and timing.",
                        "Experiment with different watering patterns to grow plants that provide power-ups, weapons, or defensive traps.",
                        "Complete challenge board tasks that often involve using plants, water, and environmental hazards.",
                        "Master plant mutations to gain free perks, new weapons, and strategic defensive options."
                ))
        ));

        ArrayList<ExpandableItem> znsBuildables = new ArrayList<>();
        znsBuildables.add(new ExpandableItem(
                "KT-4 / Masamune",
                new ArrayList<>(Arrays.asList(
                        "Collect all KT-4 parts from labs, spider encounters, and underwater sections.",
                        "Build the KT-4 at the lab crafting station.",
                        "Use the KT-4 to dissolve plant barriers, weaken zombies, and complete puzzle steps.",
                        "Gather the additional components needed to upgrade the KT-4 into the Masamune.",
                        "Use the Masamune’s enhanced shots for better control over hordes and boss encounters."
                ))
        ));
        znsBuildables.add(new ExpandableItem(
                "Skull of Nan Sapwe",
                new ArrayList<>(Arrays.asList(
                        "Complete all four skull trials at the ritual pedestals scattered around the map.",
                        "Return the completed skulls to the main altar to unlock a secret chamber.",
                        "Enter the chamber and survive the trials to claim the Skull of Nan Sapwe.",
                        "Use the Skull’s beam to disintegrate zombies and reveal hidden text or walls.",
                        "Incorporate the Skull into main Easter egg and high-round strategies for maximum effectiveness."
                ))
        ));
        znsBuildables.add(new ExpandableItem(
                "Shield Buildable",
                new ArrayList<>(Arrays.asList(
                        "Locate the three shield parts scattered around the map, often on walls or near vines.",
                        "Carry the parts to a shield workbench and assemble them.",
                        "Equip the shield on your back for protection from rear attacks.",
                        "Use the shield’s melee bash and charged attacks to knock down or kill zombies.",
                        "Rebuild the shield when it breaks to maintain your defensive advantage."
                ))
        ));
        znsBuildables.add(new ExpandableItem(
                "Gas Mask",
                new ArrayList<>(Arrays.asList(
                        "Collect gas mask parts such as filters, canisters, and the face mask from different sections.",
                        "Assemble the gas mask at a build table located in the bunker or nearby structures.",
                        "Equip the gas mask to reduce damage from spores, poison gas, and certain environmental hazards.",
                        "Monitor the mask’s durability and rebuild it when it wears out or is destroyed.",
                        "Use the mask to safely navigate spore-heavy areas and survive longer in toxic environments."
                ))
        ));
        znsBuildables.add(new ExpandableItem(
                "Bucket / Water Irrigation System",
                new ArrayList<>(Arrays.asList(
                        "Pick up a bucket from various spawn spots around the swamp or initial areas.",
                        "Fill the bucket with colored water from waterfalls or special water pools.",
                        "Use the bucket to power temporary generators or water plant seeds.",
                        "Combine water types and watering cycles to create unique plant outcomes.",
                        "Treat the bucket and water system as the core mechanic for plants, power, and many Easter eggs on ZNS."
                ))
        ));

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

        // -------------------------- GOROD KROVI --------------------------
        ArrayList<ExpandableItem> gkMainQuest = new ArrayList<>();
        gkMainQuest.add(new ExpandableItem(
                "Love and War / Dragon Control Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power and access Dragon Command, Tank Factory, and Supply Depot areas.",
                        "Use the Dragon Network to ride the dragon from each command post to the central Pack-a-Punch bunker.",
                        "Complete trials that involve using the Gauntlet of Siegfried, shield bashes, and specialist weapons.",
                        "Repair SOPHIA by collecting her core components through side tasks and bomb/valkyrie steps.",
                        "Finish all multi-step objectives to unlock the final boss arena against Nikolai 1.0."
                ))
        ));
        gkMainQuest.add(new ExpandableItem(
                "Nikolai 1.0 Boss Fight",
                new ArrayList<>(Arrays.asList(
                        "Enter the boss arena via SOPHIA’s teleportation sequence once all main quest steps are completed.",
                        "Face Nikolai 1.0 in his massive mech while he attacks with rockets, flamethrowers, and drones.",
                        "Destroy weak points on the mech, such as its power core or weapon systems, during vulnerability phases.",
                        "Avoid incoming fire by using cover, specialist weapons, and anti-air weapons provided in the arena.",
                        "Defeat Nikolai 1.0 to complete the Gorod Krovi storyline and view the concluding cutscene."
                ))
        ));

        ArrayList<ExpandableItem> gkSideQuests = new ArrayList<>();
        gkSideQuests.add(new ExpandableItem(
                "Song - Ace of Spades",
                new ArrayList<>(Arrays.asList(
                        "Locate hidden musical triggers such as radios or suitcases around Stalingrad.",
                        "Activate each trigger to build up the hidden song Easter egg conditions.",
                        "Once all required triggers are activated, the song 'Ace of Spades' begins to play.",
                        "Enjoy the high-energy soundtrack while fighting dragons and mechanized zombies.",
                        "Use the opportunity to complete trials or Easter egg steps with music backing."
                ))
        ));
        gkSideQuests.add(new ExpandableItem(
                "Dragon Egg Challenge",
                new ArrayList<>(Arrays.asList(
                        "Find the dragon egg located in the Pack-a-Punch bunker and pick it up.",
                        "Place the egg in specific nests around the map and expose it to dragon fire to warm it.",
                        "Complete kill challenges such as melee kills, napalm kills, and airborne kills while holding the egg.",
                        "Return the egg to the incubation area in the bunker to finalize its hatching.",
                        "Claim rewards such as the Gauntlet of Siegfried from finishing the egg challenges."
                ))
        ));
        gkSideQuests.add(new ExpandableItem(
                "Trials Board",
                new ArrayList<>(Arrays.asList(
                        "Check the trial board located near the spawn or key areas to see your assigned challenges.",
                        "Complete tasks such as using specific traps, killing certain enemy types, or performing environmental kills.",
                        "Earn rewards like free perk bottles, max ammo, and special items upon completing trials.",
                        "Use trial progress as a way to structure your mid-round objectives and skill practice.",
                        "Combine trial rewards with main quest steps for efficient progression."
                ))
        ));
        gkSideQuests.add(new ExpandableItem(
                "Bomb Step Patterns",
                new ArrayList<>(Arrays.asList(
                        "During certain Easter egg steps, monitor bomb locations announced via the command system.",
                        "Identify bomb panels in specific districts such as Tank Factory, Supply Depot, or Infirmary.",
                        "Defuse or interact with bombs in the correct sequence before the timer runs out.",
                        "Use communication and note-taking in co-op to avoid mistakes during the bomb step.",
                        "Successfully completing the bomb patterns advances SOPHIA’s repair and the main quest."
                ))
        ));
        gkSideQuests.add(new ExpandableItem(
                "Sophia Drone Side EE",
                new ArrayList<>(Arrays.asList(
                        "Collect SOPHIA’s individual components by completing special objectives and code entries.",
                        "Return each part to the central system near Dragon Command or the bunker.",
                        "Once fully reassembled, SOPHIA can assist by providing support or opening otherwise locked areas.",
                        "Use SOPHIA’s guidance and teleports to streamline endgame progression.",
                        "Treat SOPHIA as both a lore piece and practical ally in Gorod Krovi."
                ))
        ));

        ArrayList<ExpandableItem> gkBuildables = new ArrayList<>();
        gkBuildables.add(new ExpandableItem(
                "Dragon Network / Ride System",
                new ArrayList<>(Arrays.asList(
                        "Activate the Dragon Network consoles in Dragon Command, Supply Depot, and Tank Factory.",
                        "Call a dragon to your location by using the console once it is powered.",
                        "Ride the dragon from your current zone to the Pack-a-Punch bunker across the city.",
                        "Use the dragon system both for fast travel and as a cinematic path to the core of Stalingrad.",
                        "Incorporate dragon rides into your strategy for Pack-a-Punch access and certain Easter egg steps."
                ))
        ));
        gkBuildables.add(new ExpandableItem(
                "Gauntlet of Siegfried",
                new ArrayList<>(Arrays.asList(
                        "Complete the dragon egg challenges to unlock access to the Gauntlet.",
                        "Claim the Gauntlet of Siegfried from the incubation area in the bunker.",
                        "Use the Gauntlet’s melee punch and controllable mini-dragon for devastating attacks.",
                        "Deploy the mini-dragon to breathe fire on enemies and defend specific zones.",
                        "Reserve the Gauntlet for intense rounds, boss encounters, or when pinned by large groups."
                ))
        ));
        gkBuildables.add(new ExpandableItem(
                "Shield (Dragon Shield)",
                new ArrayList<>(Arrays.asList(
                        "Find the three Dragon Shield parts in different sections of the map (wall-mounted shoulders, body, and emblem).",
                        "Build the shield at a crafting table near a strategic area.",
                        "Wear the shield on your back for rear protection from zombie hits.",
                        "Use its flamethrower blast to incinerate enemies directly in front of you.",
                        "Rebuild the shield when its durability is depleted to maintain your defense."
                ))
        ));
        gkBuildables.add(new ExpandableItem(
                "Wrath of the Valkyrie / SOPHIA Systems",
                new ArrayList<>(Arrays.asList(
                        "Engage Valkyrie drone enemies that spawn from specific rounds onward.",
                        "During Easter egg steps, follow special Valkyrie drones that may guide you through targets or code areas.",
                        "Use their path as a clue for code inputs or bomb step assistance.",
                        "Support SOPHIA’s systems by successfully handling Valkyrie-related objectives.",
                        "Treat these systems as part of the layered tech warfare in Gorod Krovi."
                ))
        ));
        gkBuildables.add(new ExpandableItem(
                "Pack A Punch on Dragon Command",
                new ArrayList<>(Arrays.asList(
                        "Use the dragon ride system to reach the central bunker and find the Pack-a-Punch machine.",
                        "Turn on all necessary controls to fully enable Pack-a-Punch.",
                        "Spend 5000 points to upgrade your weapons in the bunker.",
                        "Defend the bunker from incoming enemies while accessing Pack-a-Punch.",
                        "Use upgraded weapons to fight dragons, Panzers, and mechanized enemies throughout the city."
                ))
        ));

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

        // -------------------------- REVELATIONS --------------------------
        ArrayList<ExpandableItem> revMainQuest = new ArrayList<>();
        revMainQuest.add(new ExpandableItem(
                "A Better Tomorrow Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Activate all four Corruption Engines located in the various classic map zones to stabilize the environment.",
                        "Align the Apothicon and Keeper energies by completing multiple ritual steps across the map.",
                        "Collect and place key items such as bones, runes, and crystals in specific ritual locations.",
                        "Repair and fully activate the summoning altar in the center area to prepare for the final conflict.",
                        "Trigger the A Better Tomorrow sequence to confront the Shadowman inside the Apothicon."
                ))
        ));
        revMainQuest.add(new ExpandableItem(
                "Apothicon Interior and Shadowman Boss Fight",
                new ArrayList<>(Arrays.asList(
                        "Enter the massive Apothicon creature by using launch pads and portals around the map.",
                        "Destroy corruption nodes and stomach structures inside the Apothicon to weaken its influence.",
                        "Return outside and initiate the final boss fight by activating the summoning circle.",
                        "Trap the Shadowman by shooting him when he is vulnerable and forcing him into the Summoning Key.",
                        "Complete all ritual damage phases to defeat the Shadowman and finish the Revelations storyline."
                ))
        ));

        ArrayList<ExpandableItem> revSideQuests = new ArrayList<>();
        revSideQuests.add(new ExpandableItem(
                "Song - The Gift",
                new ArrayList<>(Arrays.asList(
                        "Find musical triggers such as teddy bears or radios scattered across the mixed map environments.",
                        "Interact with each trigger to move the Easter egg song sequence forward.",
                        "After activating all required triggers, the song 'The Gift' begins to play.",
                        "Use the track as emotional and thematic backing while completing the final Aether map.",
                        "Enjoy the music’s relation to the Primis crew and their concluding journey."
                ))
        ));
        revSideQuests.add(new ExpandableItem(
                "Corruption Engine Rituals",
                new ArrayList<>(Arrays.asList(
                        "Locate each Corruption Engine near major teleport gate areas (Nacht, Der Eisendrache zone, etc.).",
                        "Spend points to activate the engine and defend it from waves of corrupted zombies and Keepers.",
                        "Survive until the engine completes its cycle, cleansing the area and powering up the portal.",
                        "Repeat this for all engines to stabilize the map and open the way to the Apothicon interior.",
                        "Use the now-active portals for fast travel and further Easter egg progression."
                ))
        ));
        revSideQuests.add(new ExpandableItem(
                "Free Perk Side EE",
                new ArrayList<>(Arrays.asList(
                        "Complete certain hidden actions like shooting specific rocks, crystals, or masks within the map.",
                        "Perform a series of tasks that may involve using launch pads, corruption turrets, or wall-runs.",
                        "Trigger the appearance of a hidden perk bottle reward near one of the areas.",
                        "Collect the perk bottle to gain an additional perk slot beyond your current limit.",
                        "Use the free perk to supplement your core loadout for high-round or Easter egg attempts."
                ))
        ));
        revSideQuests.add(new ExpandableItem(
                "Helmet / Mask Collection",
                new ArrayList<>(Arrays.asList(
                        "Perform specific actions such as taking damage from certain enemies, killing bosses, or surviving special rounds.",
                        "Check the Kino-style theater or similar hub area for masks that appear on mannequins once unlocked.",
                        "Interact with a mask to equip it, gaining unique passive buffs like extra health or reduced damage from certain enemies.",
                        "Experiment with different masks to find the combination that best suits your playstyle.",
                        "Use helmets and masks to gain an edge during the Shadowman fight and late-game hordes."
                ))
        ));
        revSideQuests.add(new ExpandableItem(
                "Lil Arnie Upgrade Quest",
                new ArrayList<>(Arrays.asList(
                        "Obtain Lil Arnie from the Mystery Box as a tactical equipment item.",
                        "Use Lil Arnie to get kills in various themed locations, such as Kino, Verruckt, or other classic zones.",
                        "Watch for special symbols or voice lines indicating progress toward the upgrade.",
                        "Complete all required sacrificial kill steps to trigger a reward sequence.",
                        "Receive upgraded Lil Arnie with enhanced killing power and visual effects."
                ))
        ));

        ArrayList<ExpandableItem> revBuildables = new ArrayList<>();
        revBuildables.add(new ExpandableItem(
                "Apothicon Servant Upgrade",
                new ArrayList<>(Arrays.asList(
                        "Acquire the base Apothicon Servant from the Mystery Box.",
                        "Shoot specific stones or floating objects in different map regions to trigger hidden souls or drops.",
                        "Interact with the Pack-a-Punch area in the Apothicon stomach after meeting upgrade requirements.",
                        "Pack-a-Punch the Apothicon Servant once the upgrade becomes available.",
                        "Use the upgraded Servant for stronger black holes and extended high-round viability."
                ))
        ));
        revBuildables.add(new ExpandableItem(
                "Keeper Protector",
                new ArrayList<>(Arrays.asList(
                        "Collect Keeper Protector parts such as the stone slab, skull, and ancient relic from different map areas.",
                        "Assemble the Keeper Protector altar at a designated build site.",
                        "Spend points at Keeper summoning stones to call a Keeper Protector ally.",
                        "Use the Keeper Protector to distract, kill zombies, and help defend key positions.",
                        "Incorporate Keeper summons into your rotation during high-round or boss phases."
                ))
        ));
        revBuildables.add(new ExpandableItem(
                "Corruption Turrets",
                new ArrayList<>(Arrays.asList(
                        "After powering up Corruption Engines, locate turrets near the altars.",
                        "Spend points to temporarily control or activate each corruption turret.",
                        "Use the turrets’ powerful beams to eliminate large waves of enemies or to damage special targets.",
                        "Rotate turret usage when moving around the map to clear tight areas from a safe distance.",
                        "Combine turrets with your own firepower to hold off mixed enemy types in later rounds."
                ))
        ));
        revBuildables.add(new ExpandableItem(
                "Multiple Classic Map Zones (Nacht, Kino, etc.)",
                new ArrayList<>(Arrays.asList(
                        "Explore the Revelations map to find familiar sections from Nacht, Kino, Shangri-La, and other classic maps.",
                        "Use jump pads, teleports, and portals to move quickly between these zones.",
                        "Leverage each zone’s original layout for training, camping, or Easter egg-specific steps.",
                        "Search each classic area for hidden triggers, masks, and lore radios.",
                        "Enjoy the nostalgic mixture of environments as a final tribute to the Aether saga."
                ))
        ));
        revBuildables.add(new ExpandableItem(
                "Pack A Punch inside the Apothicon",
                new ArrayList<>(Arrays.asList(
                        "Enter the Apothicon’s mouth via the central vortex or launch pads.",
                        "Navigate to the stomach area containing the Pack-a-Punch machine.",
                        "Defeat parasites and Margwas inside the Apothicon to keep the area safe.",
                        "Use the Pack-a-Punch machine to upgrade weapons while inside this living environment.",
                        "Exit the Apothicon via portals once your upgrades are complete."
                ))
        ));

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

        // -------------------------- NACHT DER UNTOTEN ZC --------------------------
        ArrayList<ExpandableItem> nachtZcMainQuest = new ArrayList<>();
        nachtZcMainQuest.add(new ExpandableItem()); // No true main quest, survival-only

        ArrayList<ExpandableItem> nachtZcSideQuests = new ArrayList<>();
        nachtZcSideQuests.add(new ExpandableItem(
                "Song - Undone",
                new ArrayList<>(Arrays.asList(
                        "Locate radios or other audio devices hidden in Nacht der Untoten ZC.",
                        "Interact with them in the correct sequence to trigger the hidden track.",
                        "Once all triggers are activated, 'Undone' will begin to play.",
                        "Use the music to enhance the classic, claustrophobic survival experience.",
                        "Continue to hold out in the tight hallways and rooms while the song plays."
                ))
        ));
        nachtZcSideQuests.add(new ExpandableItem(
                "Musical EE (3 Radios)",
                new ArrayList<>(Arrays.asList(
                        "Search for three distinct radios positioned in different corners or shelves in the map.",
                        "Interact with each radio to play a short sound clip or static burst.",
                        "When all three are activated in a single game, the full Easter egg track unlocks.",
                        "Revisit the radios in future games if you want to hear the track again.",
                        "Treat this as a simple but nostalgic callback to early Zombies audio secrets."
                ))
        ));
        nachtZcSideQuests.add(new ExpandableItem(
                "Rebuild Boards for Power-Ups",
                new ArrayList<>(Arrays.asList(
                        "Rebuild barriers at windows repeatedly to slow incoming zombies and gain small point bonuses.",
                        "Occasionally, rebuilding enough boards may result in a random power-up dropping nearby.",
                        "Use this mechanic as a low-risk way to fish for power-ups between rounds.",
                        "Balance time spent rebuilding with the need to prepare for the next wave.",
                        "Keep windows maintained to reduce flanking zombies in Nacht’s tight spaces."
                ))
        ));

        ArrayList<ExpandableItem> nachtZcBuildables = new ArrayList<>();
        nachtZcBuildables.add(new ExpandableItem(
                "GobbleGums Added (ZC)",
                new ArrayList<>(Arrays.asList(
                        "Use the GobbleGum machine near spawn to equip powerful one-time or persistent abilities.",
                        "Spend points at the machine at the start of rounds to maximize early-round efficiency.",
                        "Select classic or Mega GobbleGums that complement Nacht’s cramped layout, such as wall power or in-plain-sight.",
                        "Time your GobbleGum usage to escape dangerous situations or extend high rounds.",
                        "Treat GobbleGums as the main modern enhancement to the otherwise barebones survival map."
                ))
        ));
        nachtZcBuildables.add(new ExpandableItem(
                "Wonderfizz Machine",
                new ArrayList<>(Arrays.asList(
                        "Locate the Wonderfizz machine when it spawns in Nacht der Untoten ZC.",
                        "Spend points to receive a random perk from a larger pool than the standard perk lineup.",
                        "Use Wonderfizz to gain perks like Widow’s Wine or Electric Cherry for added survivability.",
                        "Check its location each game, as it may vary depending on setup.",
                        "Incorporate Wonderfizz into your perk acquisition strategy to overcome Nacht’s difficulty."
                ))
        ));
        nachtZcBuildables.add(new ExpandableItem(
                "Classic Mystery Box",
                new ArrayList<>(Arrays.asList(
                        "Visit the Mystery Box location within Nacht’s central room.",
                        "Spend points to roll for random weapons, including classic rifles and wonder weapons.",
                        "Use the Box to replace starter weapons with stronger options as rounds increase.",
                        "Manage your points carefully to balance Box hits with ammo and perks.",
                        "Rely heavily on the Box to survive in a map with few wall-buy options."
                ))
        ));

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

        // -------------------------- VERRUCKT ZC --------------------------
        ArrayList<ExpandableItem> verrucktZcMainQuest = new ArrayList<>();
        verrucktZcMainQuest.add(new ExpandableItem()); // Survival-only, no true main quest

        ArrayList<ExpandableItem> verrucktZcSideQuests = new ArrayList<>();
        verrucktZcSideQuests.add(new ExpandableItem(
                "Song - Lullaby for a Deadman",
                new ArrayList<>(Arrays.asList(
                        "Search Verruckt ZC for hidden music triggers such as sinks, radios, or objects in asylum rooms.",
                        "Interact with each trigger in the correct sequence during a single match.",
                        "Once all triggers are activated, the song 'Lullaby for a Deadman' will begin playing.",
                        "Let the eerie track set the tone as you survive in the twisted asylum corridors.",
                        "Use the atmosphere to immerse yourself deeper in the horror vibe of Verruckt."
                ))
        ));
        verrucktZcSideQuests.add(new ExpandableItem(
                "Easter Egg Radios",
                new ArrayList<>(Arrays.asList(
                        "Locate radios hidden in different sections of the asylum such as the dentist room and showers.",
                        "Interact with each radio to listen to lore snippets or creepy voice logs.",
                        "Piece together the story of Verruckt’s dark experiments and patient suffering.",
                        "Revisit radios in multiple games to fully absorb the background lore.",
                        "Use this information to connect Verruckt to the broader Aether storyline."
                ))
        ));
        verrucktZcSideQuests.add(new ExpandableItem(
                "Power Switch Door Link",
                new ArrayList<>(Arrays.asList(
                        "Spawn split across two sides of the asylum in co-op, separated by locked doors.",
                        "Work your way to the power switch located in one wing of the map.",
                        "Activate the power to open the central doors linking both sides together.",
                        "In co-op, reunite with teammates and stabilize your defensive positions.",
                        "Use the door link mechanic as a core part of Verruckt’s early-game challenge."
                ))
        ));

        ArrayList<ExpandableItem> verrucktZcBuildables = new ArrayList<>();
        verrucktZcBuildables.add(new ExpandableItem(
                "Wonderfizz Machine",
                new ArrayList<>(Arrays.asList(
                        "Locate the Wonderfizz machine in one of Verruckt’s accessible rooms.",
                        "Spend points to receive a random perk from its expanded perk pool.",
                        "Use Wonderfizz when standard perk machines are scattered or risky to reach.",
                        "Combine Wonderfizz perks with strategic camp spots such as the Jug hallway.",
                        "Adapt your perk build each game depending on your Wonderfizz rolls."
                ))
        ));
        verrucktZcBuildables.add(new ExpandableItem(
                "Traps",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power to enable electric traps in key hallway chokepoints.",
                        "Activate traps by spending points at the nearby switches when zombies approach.",
                        "Lure zombies into the trap’s electric arcs to wipe out large groups without ammo use.",
                        "Coordinate trap usage with teammates to avoid accidental downs.",
                        "Use traps as a core tactic for high-round survival in Verruckt’s tight layout."
                ))
        ));
        verrucktZcBuildables.add(new ExpandableItem(
                "HVK Wallbuy Added (ZC)",
                new ArrayList<>(Arrays.asList(
                        "Look for the HVK-30 wall-buy location in the remastered version of Verruckt.",
                        "Purchase the HVK for a reliable automatic rifle with solid damage and ammo capacity.",
                        "Use the nearby wall-buy to keep your ammo topped off during longer rounds.",
                        "Combine HVK usage with Juggernog and Speed Cola for a classic holdout build.",
                        "Pack-a-Punch the HVK if available in your mode to extend its effectiveness into later rounds."
                ))
        ));

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

        // -------------------------- SHI NO NUMA ZC --------------------------
        ArrayList<ExpandableItem> shiNoNumaZcMainQuest = new ArrayList<>();
        shiNoNumaZcMainQuest.add(new ExpandableItem()); // Survival-flow, no formal quest

        ArrayList<ExpandableItem> shiNoNumaZcSideQuests = new ArrayList<>();
        shiNoNumaZcSideQuests.add(new ExpandableItem(
                "Song - The One",
                new ArrayList<>(Arrays.asList(
                        "Locate the hidden Easter egg song triggers scattered around Shi No Numa.",
                        "Interact with each trigger (often phones or objects) to progress the audio Easter egg.",
                        "After all triggers are activated, the song 'The One' begins to play.",
                        "Experience the eerie track while fighting zombies in swampy, foggy surroundings.",
                        "Replay the Easter egg across games to enjoy the song whenever you want."
                ))
        ));
        shiNoNumaZcSideQuests.add(new ExpandableItem(
                "115 Rock EE",
                new ArrayList<>(Arrays.asList(
                        "Search the huts and central area for glowing Element 115 rocks.",
                        "Interact with or shoot the 115 rocks to activate small audio or visual effects.",
                        "Use these interactions as part of the overall lore referencing Group 935.",
                        "Combine rock interactions with other small Easter eggs for a complete experience.",
                        "Treat the rocks as both aesthetic detail and a nod to the series’ origins."
                ))
        ));
        shiNoNumaZcSideQuests.add(new ExpandableItem(
                "Flogger Trap EE",
                new ArrayList<>(Arrays.asList(
                        "Locate the Flogger trap near the bridge area in Shi No Numa.",
                        "Activate the trap and lure zombies across the bridge or walkway while it’s on.",
                        "Observe the brutal swinging logs and impaled zombies as a morbid Easter egg moment.",
                        "Combine Flogger usage with personal challenge runs, such as only using traps for kills.",
                        "Use the Flogger as both function (defense) and flair (Easter egg spectacle)."
                ))
        ));

        ArrayList<ExpandableItem> shiNoNumaZcBuildables = new ArrayList<>();
        shiNoNumaZcBuildables.add(new ExpandableItem(
                "Wonderfizz Machine",
                new ArrayList<>(Arrays.asList(
                        "Find the Wonderfizz machine added in the ZC version of Shi No Numa.",
                        "Use Wonderfizz to receive randomized perks from the modern perk pool.",
                        "Take advantage of perks not originally present in Shi No Numa to strengthen your build.",
                        "Return periodically when you have spare points to expand your perk lineup.",
                        "Adapt your gameplay to whatever perks Wonderfizz provides in each session."
                ))
        ));
        shiNoNumaZcBuildables.add(new ExpandableItem(
                "Random Perk Huts",
                new ArrayList<>(Arrays.asList(
                        "Open each hut around the swamp to reveal a perk machine whose type is randomized each game.",
                        "Check which perk appears in each hut to plan your purchase route.",
                        "Use the randomness to keep runs varied and to alter your strategies every playthrough.",
                        "Prioritize huts that contain Juggernog or Speed Cola early on.",
                        "Incorporate hut exploration into mid-round loops while avoiding swamp slowdown and traps."
                ))
        ));
        shiNoNumaZcBuildables.add(new ExpandableItem(
                "Flogger Trap",
                new ArrayList<>(Arrays.asList(
                        "Activate the Flogger trap by spending points at its control switch near the bridge.",
                        "Use it to clear large groups of zombies crossing the trap area.",
                        "Avoid stepping into the trap zone yourself to prevent instant downing.",
                        "Time Flogger activations between rounds or during emergencies when overrun.",
                        "Combine the Flogger with swamp routes to create powerful death corridors."
                ))
        ));

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

        // -------------------------- KINO DER TOTEN ZC --------------------------
        ArrayList<ExpandableItem> kinoZcMainQuest = new ArrayList<>();
        kinoZcMainQuest.add(new ExpandableItem()); // No formal main quest; story via environment

        ArrayList<ExpandableItem> kinoZcSideQuests = new ArrayList<>();
        kinoZcSideQuests.add(new ExpandableItem(
                "Song - 115",
                new ArrayList<>(Arrays.asList(
                        "Search the map for three green Element 115 rocks hidden on tables or shelves.",
                        "Interact with each rock to hear a subtle audio cue confirming activation.",
                        "Once all three rocks are activated, the song '115' begins to play.",
                        "Enjoy the iconic track while training zombies on the stage or in the lobby.",
                        "Re-enable the song in future games by repeating the rock interactions."
                ))
        ));
        kinoZcSideQuests.add(new ExpandableItem(
                "Reel Projector EE",
                new ArrayList<>(Arrays.asList(
                        "Link the teleporter and use it repeatedly to travel to the Pack-a-Punch room.",
                        "Occasionally teleport into side rooms containing film reels on desks or equipment.",
                        "Pick up any film reels you find and bring them to the projector in the Pack-a-Punch area.",
                        "Load the reels into the projector to display secret films on the theater screen.",
                        "Watch these short films for lore insights into Group 935 and the Zombies storyline."
                ))
        ));
        kinoZcSideQuests.add(new ExpandableItem(
                "Shootable Power-Up EE",
                new ArrayList<>(Arrays.asList(
                        "During certain teleports or side-room visits, spot hidden power-ups or objects.",
                        "Shoot these secret items to trigger bonus drops or visual Easter egg effects.",
                        "Use precise aim and timing, as some targets may only be visible briefly.",
                        "Combine this with your normal teleporter usage to keep rounds efficient.",
                        "Treat shootable EEs as a fun extra challenge during long Kino sessions."
                ))
        ));

        ArrayList<ExpandableItem> kinoZcBuildables = new ArrayList<>();
        kinoZcBuildables.add(new ExpandableItem(
                "Buildable Shield (ZC)",
                new ArrayList<>(Arrays.asList(
                        "In the ZC version, locate shield parts around the theater such as near the projector, backstage, or hallways.",
                        "Bring parts to a crafting table and assemble the shield.",
                        "Equip the shield to protect your back while running loops through the stage and lobby.",
                        "Use shield bashes to create space when trapped by zombies.",
                        "Rebuild the shield whenever it breaks to maintain continuous protection."
                ))
        ));
        kinoZcBuildables.add(new ExpandableItem(
                "Teleporter Pads",
                new ArrayList<>(Arrays.asList(
                        "Open the doors leading to the stage and link the main teleporter with the spawn pad.",
                        "Use the teleporter to access the Pack-a-Punch room behind the theater screen.",
                        "Time your teleport usage between rounds or when pressured by large zombie groups.",
                        "Monitor the teleport cooldown before planning a quick escape route.",
                        "Utilize teleporter trips to grab Pack-a-Punch drinks or watch hidden films."
                ))
        ));
        kinoZcBuildables.add(new ExpandableItem(
                "Trap Circuit",
                new ArrayList<>(Arrays.asList(
                        "Activate wall traps such as the electrical barriers in hallways and near the lobby.",
                        "Lure zombies through traps to thin out waves without using ammunition.",
                        "Maintain awareness of trap cooldowns and map loops to avoid trapping yourself.",
                        "Use traps in combination with teleporters for an effective high-round strategy.",
                        "Budget points to ensure you can afford traps during critical late-game moments."
                ))
        ));

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

        // -------------------------- ASCENSION ZC --------------------------
        ArrayList<ExpandableItem> ascensionZcMainQuest = new ArrayList<>();
        ascensionZcMainQuest.add(new ExpandableItem(
                "Main Quest (Launch Rocket & Gersh EE)",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power and activate all three lunar landers around the cosmodrome.",
                        "Return to the central launch console and trigger the rocket launch sequence.",
                        "Use Gersh Devices, Ray Gun, and other weapons on specific generators and orbs around the map.",
                        "Complete the multi-step process to free Gersh from his trap as part of the main Easter egg.",
                        "Listen for Gersh’s final dialogue as confirmation and continue to use the unlocked features in-game."
                ))
        ));

        ArrayList<ExpandableItem> ascensionZcSideQuests = new ArrayList<>();
        ascensionZcSideQuests.add(new ExpandableItem(
                "Song - Pareidolia",
                new ArrayList<>(Arrays.asList(
                        "Search the cosmodrome for three hidden musical trigger objects such as radios or 115 fragments.",
                        "Interact with each object to initiate the Easter egg song sequence.",
                        "Once all three triggers have been activated, 'Pareidolia' begins to play.",
                        "Use the song as atmospheric backing while defending perks from Space Monkeys.",
                        "Replay this process in future games if you want the track again."
                ))
        ));
        ascensionZcSideQuests.add(new ExpandableItem(
                "Gersh Devices",
                new ArrayList<>(Arrays.asList(
                        "Obtain Gersh Devices from the Mystery Box as a rare special item.",
                        "Throw a Gersh Device to create a black hole vortex that sucks in nearby zombies.",
                        "Use them for emergency escapes or to clear objectives during the Easter egg steps.",
                        "Combine Gersh Device use with powerful weapons for extremely efficient crowd control.",
                        "Manage their limited count carefully, saving them for clutch moments."
                ))
        ));
        ascensionZcSideQuests.add(new ExpandableItem(
                "Monkey Round EE",
                new ArrayList<>(Arrays.asList(
                        "Buy perks around the map and watch for announcement of Space Monkey rounds.",
                        "Defend each perk machine from monkeys attempting to steal or downgrade perks.",
                        "Protect all machines without any perk being damaged to earn a free perk bottle reward.",
                        "Repeat this feat on subsequent monkey rounds to accumulate more free perks.",
                        "Use this mechanic to achieve perk loadouts that would otherwise be too expensive."
                ))
        ));

        ArrayList<ExpandableItem> ascensionZcBuildables = new ArrayList<>();
        ascensionZcBuildables.add(new ExpandableItem(
                "Matryoshka Dolls",
                new ArrayList<>(Arrays.asList(
                        "Acquire Matryoshka Dolls from the Mystery Box.",
                        "Throw a doll to release multiple smaller explosives that spread out and detonate.",
                        "Use them for clearing tight clusters of zombies in narrow hallways.",
                        "Combine doll throws with slow or stunned enemies for maximum effect.",
                        "Save them for special situations such as defending generators or clutch escapes."
                ))
        ));
        ascensionZcBuildables.add(new ExpandableItem(
                "Lunar Lander System",
                new ArrayList<>(Arrays.asList(
                        "Turn on the power and locate each of the three lunar lander platforms around the map.",
                        "Call a lander to your location by activating its console and paying the point cost.",
                        "Ride the lander to its destination to unlock its pad and progress toward rocket launch.",
                        "Use landers for quick repositioning when overwhelmed in one area.",
                        "Remember to ride all landers at least once to unlock the Pack-a-Punch rocket pad access."
                ))
        ));
        ascensionZcBuildables.add(new ExpandableItem(
                "Launch Pad Power",
                new ArrayList<>(Arrays.asList(
                        "After using all lunar landers, go to the central rocket area.",
                        "Activate the main console to power the launch pad and begin the rocket launch.",
                        "Watch the rocket take off; in some versions, you can destroy it for an additional effect.",
                        "Once the rocket launches, the area beneath becomes accessible for Pack-a-Punch.",
                        "Use the new zone strategically for high-round holds and weapon upgrades."
                ))
        ));

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

        // -------------------------- SHANGRI-LA ZC --------------------------
        ArrayList<ExpandableItem> shangriLaZcMainQuest = new ArrayList<>();
        shangriLaZcMainQuest.add(new ExpandableItem(
                "Time Travel Will Tell Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Activate the power and use the eclipse switches to shift between time states.",
                        "Solve multiple puzzle phases such as matching symbols, water routing, and lever sequences.",
                        "Coordinate with teammates to stand on specific plates, hit switches, or navigate the mining tunnels in sync.",
                        "Perform the steps that indirectly help Brock and Gary by manipulating the temple’s mechanisms.",
                        "Complete all phases to reveal the Focusing Stone and finalize the Time Travel Will Tell quest."
                ))
        ));

        ArrayList<ExpandableItem> shangriLaZcSideQuests = new ArrayList<>();
        shangriLaZcSideQuests.add(new ExpandableItem(
                "Song - Pareidolia",
                new ArrayList<>(Arrays.asList(
                        "Locate the three 115 rocks or music triggers around the Shangri-La temple and side paths.",
                        "Interact with each rock to advance the Easter egg song sequence.",
                        "When all three have been activated, 'Pareidolia' begins to play.",
                        "Use the song as a backdrop while dealing with Napalm Zombies, Shriekers, and tight corridors.",
                        "Repeat this process in later games to re-enable the track."
                ))
        ));
        shangriLaZcSideQuests.add(new ExpandableItem(
                "Focusing Stone EE",
                new ArrayList<>(Arrays.asList(
                        "Progress through the main quest steps that involve time travel, Brock and Gary, and temple puzzles.",
                        "Complete all necessary eclipse and non-eclipse phases to fully unlock the Focusing Stone.",
                        "Claim the Focusing Stone as a reward that may grant permanent perk effects in certain versions.",
                        "Coordinate with teammates to decide who picks up the Stone for long-term benefits.",
                        "Treat this as a high-skill reward tied to one of Zombies’ more complex Easter eggs."
                ))
        ));
        shangriLaZcSideQuests.add(new ExpandableItem(
                "Napalm & Shriekers",
                new ArrayList<>(Arrays.asList(
                        "Watch for special enemy types: Napalm Zombies that emit explosive fire and Shriekers that disorient you.",
                        "Use long-range weapons to dispatch Napalm Zombies before they get too close and explode.",
                        "Avoid looking directly at Shriekers for long and prioritize them in crowds.",
                        "In some Easter egg steps, use Napalm or Shrieker kills in specific spots as part of puzzles.",
                        "Learn their spawn locations and behaviors to reduce the surprise factor in later rounds."
                ))
        ));

        ArrayList<ExpandableItem> shangriLaZcBuildables = new ArrayList<>();
        shangriLaZcBuildables.add(new ExpandableItem(
                "31-79 JGb215 (Baby Gun)",
                new ArrayList<>(Arrays.asList(
                        "Obtain the 31-79 JGb215 Wonder Weapon from the Mystery Box.",
                        "Shoot zombies with it to shrink them temporarily.",
                        "While shrunk, run into the mini-zombies to kick and instantly kill them.",
                        "Use the Baby Gun for crowd control in tight temple hallways and tunnels.",
                        "Manage ammo carefully and rely on conventional weapons between Baby Gun uses."
                ))
        ));
        shangriLaZcBuildables.add(new ExpandableItem(
                "Water Slide",
                new ArrayList<>(Arrays.asList(
                        "Find the water slide entrance near the upper temple areas.",
                        "Use the slide to quickly travel to lower sections of the map.",
                        "In some Easter egg phases, use the slide in combination with switches or timed actions.",
                        "Be aware of where zombies may gather at the slide exit to avoid ambush.",
                        "Incorporate the slide into fast rotations between key areas during high rounds."
                ))
        ));
        shangriLaZcBuildables.add(new ExpandableItem(
                "Minecart System",
                new ArrayList<>(Arrays.asList(
                        "Locate the minecart tracks and boarding areas within Shangri-La.",
                        "Ride the minecart to rapidly move between different temple segments.",
                        "Use minecarts for certain Time Travel Will Tell steps that require quick repositioning.",
                        "Watch for zombies at the cart’s exit point and be ready to clear them on arrival.",
                        "Incorporate minecarts into your loop routes when training or solving puzzles."
                ))
        ));

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

        // -------------------------- MOON ZC --------------------------
        ArrayList<ExpandableItem> moonZcMainQuest = new ArrayList<>();
        moonZcMainQuest.add(new ExpandableItem(
                "Richtofen's Grand Scheme Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Start the game in Area 51 and gain points before teleporting to the Moon.",
                        "Turn on the power and access the laboratories, biodome, and pyramid room.",
                        "Complete steps involving the MPD, tube filling, and switching control between Maxis and Richtofen.",
                        "Use the QEDs and Gersh Devices to manipulate devices and energy sources around the map.",
                        "Finish the final steps to fire missiles at Earth, altering the Aether storyline dramatically."
                ))
        ));

        ArrayList<ExpandableItem> moonZcSideQuests = new ArrayList<>();
        moonZcSideQuests.add(new ExpandableItem(
                "Song - Coming Home",
                new ArrayList<>(Arrays.asList(
                        "Search the Moon base for the three hidden musical triggers.",
                        "Interact with each one in a single game to unlock the Easter egg track.",
                        "After all triggers are activated, 'Coming Home' begins to play.",
                        "Listen to the song while surviving in low gravity and dealing with Astronaut zombies.",
                        "Re-use the Easter egg whenever you want by repeating the activation steps."
                ))
        ));
        moonZcSideQuests.add(new ExpandableItem(
                "Hacker EE",
                new ArrayList<>(Arrays.asList(
                        "Find the Hacker device in the labs on a desk or equipment surface.",
                        "Use the Hacker to bypass point costs, reroll power-ups, or defuse Excavator breaches.",
                        "Hack power-ups to change them into different types if desired.",
                        "Combine hacking with Easter egg steps to lower difficulty on certain tasks.",
                        "Return the Hacker when done or pick it up again to continue using its special functions."
                ))
        ));
        moonZcSideQuests.add(new ExpandableItem(
                "Maxis Side Steps",
                new ArrayList<>(Arrays.asList(
                        "Follow Maxis’s directives rather than Richtofen’s during key decision points in the quest.",
                        "Use QEDs, panels, and consoles in the correct order to activate Maxis’s plan.",
                        "Complete unique sequences that differ from Richtofen’s Grand Scheme.",
                        "Listen for Maxis’s final lines confirming his control and the conclusion of his side.",
                        "Understand that choosing Maxis or Richtofen changes the canonical direction of the story."
                ))
        ));

        ArrayList<ExpandableItem> moonZcBuildables = new ArrayList<>();
        moonZcBuildables.add(new ExpandableItem(
                "Wave Gun / Zap Guns",
                new ArrayList<>(Arrays.asList(
                        "Acquire the Wave Gun/Zap Guns from the Mystery Box.",
                        "Use the dual-wield Zap Guns to fry individual zombies with high-voltage beams.",
                        "Combine them into the Wave Gun to inflate and explode groups of zombies simultaneously.",
                        "Employ the Wave Gun for crowd control in low-gravity hallways and tight lab spaces.",
                        "Conserve ammo and switch modes based on how dense the zombie hordes are."
                ))
        ));
        moonZcBuildables.add(new ExpandableItem(
                "QED & Gersh Devices",
                new ArrayList<>(Arrays.asList(
                        "Obtain QEDs and Gersh Devices from the Mystery Box as rare tactical items.",
                        "Throw QEDs to cause random, chaotic effects ranging from beneficial to dangerous.",
                        "Use Gersh Devices to create black holes that teleport zombies away and clear space.",
                        "Incorporate both devices into Easter egg sequences that involve manipulating energy and teleportation.",
                        "Manage their limited supply carefully to avoid wasting them on non-critical situations."
                ))
        ));
        moonZcBuildables.add(new ExpandableItem(
                "Low Gravity Mechanics",
                new ArrayList<>(Arrays.asList(
                        "Move carefully around low-gravity sections, as jumps carry you farther and can be harder to control.",
                        "Use low gravity to your advantage by making long jumps over zombie lines.",
                        "Avoid overshooting platforms or corridors that can leave you exposed.",
                        "Learn how the Astronaut zombie and Excavator events interact with low-gravity movement.",
                        "Use your understanding of Moon physics to develop unique training and kiting strategies."
                ))
        ));

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

        // -------------------------- ORIGINS ZC --------------------------
        ArrayList<ExpandableItem> originsZcMainQuest = new ArrayList<>();
        originsZcMainQuest.add(new ExpandableItem(
                "Little Lost Girl Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Turn on all generators to power perk machines, the excavation site, and other systems.",
                        "Build all four elemental staffs by collecting their parts and crystals.",
                        "Upgrade the staffs by completing their Crazy Place trials and map-based puzzles.",
                        "Place the upgraded staffs in the correct locations (robots or pedestals) as Samantha instructs.",
                        "Complete final soul-collection and defense steps in the Crazy Place to free Samantha."
                ))
        ));
        originsZcMainQuest.add(new ExpandableItem(
                "Free Samantha and Complete the Final Ritual",
                new ArrayList<>(Arrays.asList(
                        "Perform the concluding series of tasks in the Crazy Place while defending the center area.",
                        "Use upgraded staffs, One Inch Punch/Iron Fists, and Maxis Drone to manage the final waves.",
                        "Close rifts, stabilize the realm, and complete Samantha’s last requirements.",
                        "Witness the ending scenario that shows Samantha’s release and the transition to Primis.",
                        "Treat this as the narrative bridge between Origins and the broader Primis storyline."
                ))
        ));

        ArrayList<ExpandableItem> originsZcSideQuests = new ArrayList<>();
        originsZcSideQuests.add(new ExpandableItem(
                "Song - Archangel",
                new ArrayList<>(Arrays.asList(
                        "Locate and interact with the hidden music triggers around the trenches and excavation site.",
                        "Trigger all necessary objects in one game to unlock 'Archangel'.",
                        "Let the song play while you work on generators, staff builds, and tank runs.",
                        "Use the track’s high energy to push through challenging Panzer rounds.",
                        "Replay the song by repeating the trigger process in future games."
                ))
        ));
        originsZcSideQuests.add(new ExpandableItem(
                "Elemental Staff Upgrade Quests",
                new ArrayList<>(Arrays.asList(
                        "Complete each staff’s puzzle in the Crazy Place (shooting symbols, changing patterns, etc.).",
                        "Perform map-based actions like shooting floating stones, gravestones, or weather targets.",
                        "Return to the Crazy Place and charge each staff with zombie souls at its pedestal.",
                        "Claim the upgraded staff once its pedestal is fully saturated.",
                        "Use upgraded staffs for powerful attacks and crucial Easter egg steps."
                ))
        ));
        originsZcSideQuests.add(new ExpandableItem(
                "Challenge Chest Rewards",
                new ArrayList<>(Arrays.asList(
                        "Refer to the challenge tablets near spawn to track tasks such as headshots or generator activations.",
                        "Complete each listed challenge to unlock special reward chests at key locations.",
                        "Open chests to receive rewards like free double tap, golden shovel, or extra weapons.",
                        "Use challenge rewards to boost your mid-game power curve.",
                        "Stack multiple completed challenges for a strong late-game loadout."
                ))
        ));
        originsZcSideQuests.add(new ExpandableItem(
                "Giant Robots Head EE",
                new ArrayList<>(Arrays.asList(
                        "Enter the giant robots by shooting the glowing foot panels and standing in the footprint.",
                        "Inside, look for hidden switches or panels related to Easter egg clues.",
                        "Interact with these hidden elements to contribute to staff or drone-related secrets.",
                        "Repeat across different robots to ensure all relevant switches are activated.",
                        "Use this knowledge to deepen your understanding of Origins’ mechanical giants."
                ))
        ));
        originsZcSideQuests.add(new ExpandableItem(
                "Maxis Drone Parts & Side EE",
                new ArrayList<>(Arrays.asList(
                        "Find Maxis Drone parts such as the frame, brain jar, and rotors scattered near excavation and trenches.",
                        "Build the drone at a crafting table to gain a flying robotic ally.",
                        "Use the drone to pick up certain items, defend you, or assist in step completions.",
                        "Incorporate the drone into specific Easter egg tasks that require its retrieval ability.",
                        "Treat the drone as both a practical tool and a narrative piece tied to Maxis."
                ))
        ));

        ArrayList<ExpandableItem> originsZcBuildables = new ArrayList<>();
        originsZcBuildables.add(new ExpandableItem(
                "Elemental Staffs (Fire, Ice, Lightning, Wind)",
                new ArrayList<>(Arrays.asList(
                        "Collect staff parts from dig sites, the tank path, and robot interiors depending on the element.",
                        "Retrieve the elemental crystals from the Crazy Place via each corresponding portal.",
                        "Build each staff at the Excavation Site’s central chamber using the upgrade rings.",
                        "Equip each staff according to your playstyle or Easter egg step requirements.",
                        "Upgrade them to their ultimate forms to fully unlock their power."
                ))
        ));
        originsZcBuildables.add(new ExpandableItem(
                "Maxis Drone",
                new ArrayList<>(Arrays.asList(
                        "Assemble the Maxis Drone using collected parts and build it at a workbench.",
                        "Deploy the drone to automatically attack zombies and collect drops.",
                        "Use the drone for certain Easter egg steps that require it to fly through paths or retrieve items.",
                        "Retrieve the drone when its battery depletes to recharge it for future use.",
                        "Integrate the drone into high-round strategies for extra firepower and assistance."
                ))
        ));
        originsZcBuildables.add(new ExpandableItem(
                "One Inch Punch / Iron Fists",
                new ArrayList<>(Arrays.asList(
                        "Feed soul boxes around the map by killing zombies near stone chests.",
                        "After completing all boxes, collect the One Inch Punch from the reward area near spawn.",
                        "Use the punch to send zombies flying with powerful melee strikes.",
                        "Fulfill additional secret conditions to upgrade to Iron Fists for even stronger melee.",
                        "Use Iron Fists as a strong backup when ammo is low or during certain defense steps."
                ))
        ));
        originsZcBuildables.add(new ExpandableItem(
                "Shield Buildable",
                new ArrayList<>(Arrays.asList(
                        "Find shield parts mounted on wooden barricades or walls around trenches and bunker.",
                        "Build the shield at a crafting table near a commonly traversed area.",
                        "Carry the shield on your back to block attacks from behind.",
                        "Use the shield’s bash attack to clear paths when cornered by zombies.",
                        "Rebuild the shield when durability runs out to keep your defenses intact."
                ))
        ));
        originsZcBuildables.add(new ExpandableItem(
                "Tank Path Access to Parts",
                new ArrayList<>(Arrays.asList(
                        "Activate and ride the tank starting from the church area across the battlefield.",
                        "Jump off at specific points along the route to reach hidden platforms or staff parts.",
                        "Time your jumps carefully to avoid falling into mud or crowded zombie zones.",
                        "Use repeated tank trips to collect all necessary items for staff building.",
                        "Integrate tank runs into your early and mid-game progression plans."
                ))
        ));

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

        // -------------------------- DEAD OPS ARCADE 2 --------------------------
        ArrayList<ExpandableItem> doa2MainQuest = new ArrayList<>();
        doa2MainQuest.add(new ExpandableItem(
                "Cosmic Silverback Main Quest",
                new ArrayList<>(Arrays.asList(
                        "Progress through the top-down arenas of Dead Ops Arcade 2, clearing wave after wave of enemies.",
                        "Survive special stages and boss rounds to advance deeper into the mode.",
                        "Face the Cosmic Silverback in designated boss encounters that test your movement and DPS.",
                        "Study attack patterns and use power weapons, vehicles, and Fate abilities to defeat him.",
                        "Work through the full sequence of arenas to fully resolve the Silverback storyline."
                ))
        ));
        doa2MainQuest.add(new ExpandableItem(
                "Escape the Island and Complete All Arenas",
                new ArrayList<>(Arrays.asList(
                        "Advance through the branching arena paths while choosing your route at forks.",
                        "Enter secret areas, bonus rooms, and hidden paths when portals appear.",
                        "Maintain enough lives and continues to survive toward the final Island escape.",
                        "Complete the ultimate arena and escape sequence to 'beat' Dead Ops Arcade 2.",
                        "Revisit the mode to seek alternate paths, higher scores, and additional secrets."
                ))
        ));

        ArrayList<ExpandableItem> doa2SideQuests = new ArrayList<>();
        doa2SideQuests.add(new ExpandableItem(
                "Hidden Room EE",
                new ArrayList<>(Arrays.asList(
                        "Look for secret paths or hidden portals that appear after certain waves.",
                        "Enter these portals to access special hidden rooms containing treasure or lore.",
                        "Collect as many gems and power-ups as possible before being returned to the main path.",
                        "Use hidden rooms to boost your score and gain advantages for later waves.",
                        "Explore different branches across multiple runs to find all hidden areas."
                ))
        ));
        doa2SideQuests.add(new ExpandableItem(
                "Fate & Fortune System",
                new ArrayList<>(Arrays.asList(
                        "Reach the Fate Rooms that appear after progressing far enough in a run.",
                        "Choose from various Fates such as increased firepower, defense, or utility upgrades.",
                        "Consider how each Fate meshes with your preferred playstyle and team strategy.",
                        "Combine Fate bonuses with weapon pickups to reach extremely high damage potential.",
                        "Experiment with different Fates over multiple runs to see which is most effective."
                ))
        ));
        doa2SideQuests.add(new ExpandableItem(
                "Boss Wave Challenges",
                new ArrayList<>(Arrays.asList(
                        "Prepare for special boss waves signaled by unique intros or enemy spawns.",
                        "Use high-damage weapons, vehicles, and power-ups collected from earlier rounds.",
                        "Focus fire on bosses while avoiding environmental hazards and minions.",
                        "Survive these waves to unlock further stages, hidden rooms, or extra lives.",
                        "Use boss wave knowledge to plan your power-up usage and positioning beforehand."
                ))
        ));
        doa2SideQuests.add(new ExpandableItem(
                "8-Bit Retro Arcade Room",
                new ArrayList<>(Arrays.asList(
                        "Discover the retro arcade room via a hidden portal or condition met during your run.",
                        "Enter the 8-bit-style arena and adapt to its unique visuals and mechanics.",
                        "Complete its special challenges to receive score bonuses or extra power-ups.",
                        "Treat this mode as both a nostalgia hit and a score multiplier opportunity.",
                        "Return to the retro room in future runs if you can re-trigger it."
                ))
        ));
        doa2SideQuests.add(new ExpandableItem(
                "First Person Mode Power-Up",
                new ArrayList<>(Arrays.asList(
                        "Watch for the First Person power-up icon dropping from certain enemies or waves.",
                        "Collect it to temporarily switch the camera to a first-person shooter perspective.",
                        "Use the new viewpoint to precisely line up shots but be cautious of reduced situational awareness.",
                        "When the effect ends, adjust back to the top-down perspective smoothly.",
                        "Use this power-up as a fun twist and potential advantage if used skillfully."
                ))
        ));

        ArrayList<ExpandableItem> doa2Buildables = new ArrayList<>();
        doa2Buildables.add(new ExpandableItem(
                "Upgradable Weapons",
                new ArrayList<>(Arrays.asList(
                        "Pick up weapon crate drops to acquire stronger guns with different fire patterns.",
                        "Increase your firepower by grabbing upgraded variants from special chests or events.",
                        "Switch weapons as needed based on enemy type and arena layout.",
                        "Avoid wasting powerful weapon timers on low-threat waves.",
                        "Chain upgraded weapons across waves to maintain an edge in later rounds."
                ))
        ));
        doa2Buildables.add(new ExpandableItem(
                "Vehicle Power-Ups (Tank, Mech, Dragon)",
                new ArrayList<>(Arrays.asList(
                        "Collect vehicle power-ups that spawn as drops in certain arenas.",
                        "Enter vehicles such as tanks, mechs, or dragons to gain massive offensive and defensive boosts.",
                        "Run over zombies and fire heavy weapons to clear entire screens of enemies.",
                        "Watch your vehicle’s health or timer, as they only last for a limited duration.",
                        "Save vehicles for difficult waves, boss fights, or when heavily outnumbered."
                ))
        ));
        doa2Buildables.add(new ExpandableItem(
                "Gem & Treasure System",
                new ArrayList<>(Arrays.asList(
                        "Collect gems and treasure chests scattered throughout arenas and bonus rooms.",
                        "Focus on high-value gems when safe to maximize your score.",
                        "Use score milestones for bragging rights or leaderboard positions against friends.",
                        "Balance risk and reward when grabbing gems near dense enemy clusters.",
                        "Treat treasure collection as a secondary objective to survival."
                ))
        ));
        doa2Buildables.add(new ExpandableItem(
                "Arena Progression Path",
                new ArrayList<>(Arrays.asList(
                        "After clearing certain waves, choose between multiple path options at forks.",
                        "Select paths that offer bonuses, secret rooms, or preferred arena layouts.",
                        "Memorize routes that give the best mix of reward and manageable difficulty.",
                        "Experiment with different paths to discover all arenas and events.",
                        "Use knowledge of path layouts to plan power-up usage and team roles."
                ))
        ));
        doa2Buildables.add(new ExpandableItem(
                "Friendship Bear Mechanic",
                new ArrayList<>(Arrays.asList(
                        "Locate friendship bears or similar icons hidden in certain arenas.",
                        "Interact with or collect them to trigger small supportive bonuses or Easter egg effects.",
                        "Work together in co-op to gather multiple bears for cumulative benefits.",
                        "Use the friendship mechanic as a cooperative goal beyond simple survival.",
                        "Enjoy the light-hearted nod amidst the otherwise intense arcade action."
                ))
        ));

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
