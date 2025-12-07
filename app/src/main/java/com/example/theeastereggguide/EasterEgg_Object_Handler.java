package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasterEgg_Object_Handler {

    private static final List<EasterEgg> easterEggs = new ArrayList<>();

    static {
        initializeEasterEggs();
    }

    private static void initializeEasterEggs()
    {

        // --------------------------------------------
//                  TANK DEMPSEY
// --------------------------------------------

// ------------------------- ULTIMIS -------------------------
        easterEggs.add(new EasterEgg(
                "Meathead",
                "Corporal \"Tank\" Dempsey",
                "United States Marine Corps",
                "Call of Duty: World at War – Zombies (Shi No Numa, 2009)",
                "Corporal “Tank” Dempsey is a tough-as-nails American Marine known for his fearless attitude, explosive bravado, and love of combat. Before joining the mysterious Group 935 storyline, Dempsey was sent on a mission to infiltrate a Japanese facility to rescue an American test subject—Peter McCain. The mission went sideways, and Dempsey was captured and eventually held as a prisoner for experimentation.\n\nFollowing his escape, Dempsey crosses paths with Takeo Masaki, Nikolai Belinski, and Edward Richtofen, forming the original “Ultimis” crew. Together they battle the undead across derelict facilities, swamps, and secret laboratories as they uncover the consequences of Element 115 experimentation.\n\nDespite his over-the-top personality, Dempsey represents the classic hardened soldier archetype—loyal, aggressive, and always ready for a fight. He masks his fear and confusion with humor and bravado, often responding to impossible situations with sarcasm, taunts, and lots of bullets.",
                Arrays.asList(
                        "Loud, confident, and sarcastic",
                        "Deep loyalty to his fellow Marines",
                        "Enthusiastic about destroying zombies",
                        "Distrusting of Richtofen",
                        "Driven by honor and a strong sense of duty"
                ),
                Arrays.asList(
                        "“Semper fi, mother—!”",
                        "“You want some more? I got plenty!”",
                        "“I’ll swim in your guts, freak bags!”"
                ),
                "Dempsey serves as the muscle of the group—an anchor in the chaos. Though unaware of the deeper conspiracy surrounding Group 935 and Element 115, he becomes a key figure in the unfolding multiverse narrative that begins in World at War.",
                R.drawable.dempsey_ultimis_pfp
        ));

// ------------------------- PRIMIS -------------------------
        easterEggs.add(new EasterEgg(
                "Tank",
                "Staff Sergeant \"Tank\" Dempsey",
                "United States Marine Corps / Primis",
                "Call of Duty: Black Ops III – Zombies (The Giant / Der Eisendrache, 2015)",
                "Primis Dempsey is a seasoned, battle-hardened version of the Marine who has grown beyond the brute-force mentality of his Ultimis counterpart. More focused, disciplined, and aware of the multiverse crisis, Primis Dempsey carries the emotional weight of duty as he confronts fractured timelines, Element 115 corruption, and the consequences of Group 935’s experiments.\n\nThroughout their journey, he works alongside Richtofen, Nikolai, and Takeo as the Primis crew, fighting to prevent the destruction of reality. His mission becomes deeply personal when faced with the truth of his Ultimis self—forcing him to question identity, fate, and sacrifice.\n\nDespite his hardened exterior, Primis Dempsey shows moments of empathy and introspection, especially regarding the morality of their actions and the fate of his alternate selves. His loyalty to the Primis crew and determination to \"finish the fight\" define his evolution into a more complex and thoughtful warrior.",
                Arrays.asList(
                        "Disciplined, focused, and mission-driven",
                        "Haunted by knowledge of the multiverse",
                        "Shows deeper emotion compared to Ultimis",
                        "Strong moral compass and loyalty to Primis",
                        "Determined to end the suffering caused by Element 115"
                ),
                Arrays.asList(
                        "“One day, I’ll have to explain all this… but today’s not that day.”",
                        "“Whatever it takes, we stop this nightmare… for good.”",
                        "“I’ve seen too much to doubt what needs to be done.”"
                ),
                "Primis Dempsey plays a critical role in the multiverse narrative, serving as the grounded, moral center of the group. His actions—especially regarding his Ultimis self—represent the emotional and ethical struggles at the heart of the Primis storyline.",
                R.drawable.dempsey_primis_pfp
        ));



// --------------------------------------------
//               NIKOLAI BELINSKI
// --------------------------------------------

// ------------------------- ULTIMIS -------------------------
        easterEggs.add(new EasterEgg(
                "The Russian",
                "Nikolai Belinski",
                "Red Army – USSR",
                "Call of Duty: World at War – Zombies (Shi No Numa, 2009)",
                "Ultimis Nikolai is a drunken, chaotic former Red Army soldier known for his wild stories, questionable honor, and endless references to his many ex-wives. A tragic product of war and alcoholism, he represents comic relief within the Ultimis crew—but beneath the humor lies trauma and pain.\n\nCaptured by Group 935 after a mission gone wrong, Nikolai joins Dempsey, Takeo, and Richtofen in their fight against the undead. Though often portrayed as incompetent or unfocused, he is surprisingly resourceful in battle and fiercely loyal—despite constantly complaining about his life, his government, and everything else.\n\nHis broken psyche and alcoholism mask a deeper sorrow, shaping his unpredictable yet strangely lovable personality.",
                Arrays.asList(
                        "Alcoholic, chaotic, and unpredictable",
                        "Constantly references his ex-wives",
                        "Fiercely loyal despite his flaws",
                        "Comedic relief with dark undertones",
                        "Brutally honest and cynical"
                ),
                Arrays.asList(
                        "“One vodka, two vodka, three—better kill zombies!”",
                        "“My wives... all of them—terrible!”",
                        "“I kill for honor! Mostly for vodka, but honor too.”"
                ),
                "Ultimis Nikolai is both tragic and comedic, embodying the instability and trauma of warfare while providing levity in the darkest moments of the Zombies storyline.",
                R.drawable.nikoli_ultimis_pfp
        ));

// ------------------------- PRIMIS -------------------------
        easterEggs.add(new EasterEgg(
                "Comrade",
                "Nikolai Belinski (Primis)",
                "Red Army / Primis",
                "Call of Duty: Black Ops III – Zombies (The Giant / Gorod Krovi, 2015)",
                "Primis Nikolai is a hardened, introspective warrior deeply affected by the countless battles, losses, and multiversal horrors he has lived through. Unlike his drunken Ultimis self, this version of Nikolai is sober, focused, and philosophical—burdened with guilt yet driven by a desire for redemption.\n\nAs the Primis storyline unfolds, Nikolai becomes a central emotional pillar of the crew. His confrontation with his Ultimis self in *Gorod Krovi* serves as one of the most powerful moments in the series, forcing him to reconcile regret, identity, and the weight of destiny.\n\nStoic yet compassionate, Primis Nikolai fights not for glory, but for peace—for a world where suffering finally ends.",
                Arrays.asList(
                        "Stoic, thoughtful, and introspective",
                        "Burdened by trauma and regret",
                        "Dedicated to ending the cycle of suffering",
                        "Strong bond with the Primis crew",
                        "Brave and selfless leader"
                ),
                Arrays.asList(
                        "“For as long as we can remember, we have bled for the Motherland.”",
                        "“I will do what needs to be done. No matter the cost.”",
                        "“My past is my burden. I alone must atone.”"
                ),
                "Primis Nikolai plays a crucial philosophical role—representing self-reflection, forgiveness, and the emotional climax of the Primis storyline.",
                R.drawable.nikoli_primis_pfp
        ));



// --------------------------------------------
//                 TAKEO MASAKI
// --------------------------------------------

// ------------------------- ULTIMIS -------------------------
        easterEggs.add(new EasterEgg(
                "Mr.Honour",
                "Captain Takeo Masaki",
                "Imperial Japanese Army",
                "Call of Duty: World at War – Zombies (Shi No Numa, 2009)",
                "Ultimis Takeo Masaki is an honorable but overly dramatic Japanese soldier who speaks almost exclusively in exaggerated proverbs and cryptic wisdom. Captured by Group 935 during a covert mission, he becomes part of the Ultimis crew, fighting alongside Dempsey, Nikolai, and Richtofen.\n\nTakeo is loyal to his emperor and proud of his heritage, often using poetic monologues even in the heat of battle. Though often mocked by the others, he serves as the spiritual and disciplined core of the Ultimis team—despite clearly losing sanity as the events unfold.\n\nHis exaggerated honor and intensity bring a unique charm and comedic dynamic to the chaotic Ultimis storyline.",
                Arrays.asList(
                        "Speaks in dramatic proverbs",
                        "Obsessed with honor, discipline, and ritual",
                        "Extremely loyal to the Emperor",
                        "Sometimes cryptic or overly serious",
                        "Calm but capable of violent intensity"
                ),
                Arrays.asList(
                        "“A warrior does not give up easily!”",
                        "“My blade will find your throat!”",
                        "“Honor guides my hand!”"
                ),
                "Ultimis Takeo provides spiritual contrast to the insanity around him, embodying exaggerated honor mixed with comedic melodrama.",
                R.drawable.takeo_ultimis_pfp
        ));

// ------------------------- PRIMIS -------------------------
        easterEggs.add(new EasterEgg(
                "The Warrior",
                "Takeo Masaki (Primis)",
                "Japanese Imperial Army / Primis",
                "Call of Duty: Black Ops III – Zombies (The Giant / Zetsubou No Shima, 2015)",
                "Primis Takeo is a wiser, more emotionally grounded version of his Ultimis self. No longer just a walking proverb machine, he is introspective, honorable, and deeply reflective about the multiverse and his own destiny. His journey reaches a dramatic peak on *Zetsubou No Shima*, where he confronts his corrupted Ultimis self.\n\nThis encounter forces Takeo to face betrayal, duty, and the painful truth about the Emperor he served so faithfully. Free from delusion, Primis Takeo becomes a symbol of enlightenment and sacrifice—embodying discipline guided by compassion rather than blind loyalty.\n\nHis presence anchors the Primis crew spiritually and morally, contributing wisdom and balance as they face the end of reality.",
                Arrays.asList(
                        "Disciplined, wise, and introspective",
                        "Emotionally controlled yet compassionate",
                        "Seeks enlightenment and truth",
                        "Deeply loyal to the Primis crew",
                        "Burdened by betrayal and destiny"
                ),
                Arrays.asList(
                        "“Our journey is long and painful. Yet we endure.”",
                        "“I now see the Emperor for what he truly is.”",
                        "“Let my actions speak louder than my words.”"
                ),
                "Primis Takeo represents enlightenment and emotional discipline, serving as the spiritual center of the Primis storyline.",
                R.drawable.takeo_primis_pfp
        ));



// --------------------------------------------
//               EDWARD RICHTOFEN
// --------------------------------------------

// ------------------------- ULTIMIS RICHTOFEN (CENSORED) -------------------------
        easterEggs.add(new EasterEgg(
                "The Doctor",
                "Dr. Edward Richtofen",
                "Group 935 Scientist",
                "Call of Duty: World at War – Zombies (Shi No Numa, 2009)",
                "Ultimis Richtofen is an eccentric and unstable scientist whose unpredictable behavior frequently puts the crew on edge. Brilliant but morally questionable, he is known for his strange enthusiasm toward experimentation and his tendency to break into unsettling laughter at inappropriate times.\n\nAlthough his motivations are often unclear, Richtofen sees himself as a visionary working toward a greater purpose—one that the others cannot yet understand. His unusual perspective and questionable ethics make him both a valuable ally and a looming threat.\n\nDespite his bizarre tendencies, Richtofen plays a central role in guiding the Ultimis crew through the chaos created by Group 935’s technological ambitions.",
                Arrays.asList(
                        "Eccentric and unpredictable",
                        "Highly intelligent but morally ambiguous",
                        "Secretive and manipulative",
                        "Fascinated with experimentation",
                        "Loves dramatic flair and theatrics"
                ),
                Arrays.asList(
                        "“Ahaha! Science can be so much fun!”",
                        "“Do not worry, my friends—everything is under control!”",
                        "“Sometimes the results surprise even me!”"
                ),
                "This censored depiction of Ultimis Richtofen highlights his eccentric genius while toning down the darker aspects of his personality, making him more suitable for general-audience contexts.",
                R.drawable.richtofen_ultimis_pfp
        ));

// ------------------------- ULTIMIS RICHTOFEN (UNCENSORED) -------------------------
        easterEggs.add(new EasterEgg(
                "The Butcher",
                "Dr. Edward Richtofen",
                "Group 935 / Nazi Scientist",
                "Call of Duty: World at War – Zombies (Shi No Numa, 2009)",
                "Ultimis Richtofen is an insane, gleefully sadistic scientist responsible for some of Group 935’s most horrific experiments—including those that directly led to the zombie outbreak. Brilliant but completely deranged, he delights in pain, chaos, and the sound of his own maniacal laughter.\n\nDriven by an obsession with the Aether, control, and proving his superiority over Dr. Maxis, Richtofen manipulates the Ultimis crew like puppets—using their confusion and desperation to advance his own twisted agenda.\n\nHis unhinged personality, violent enthusiasm for experimentation, and unpredictable mood swings make him one of the most iconic villains-turned-antiheroes in the entire Aether storyline.",
                Arrays.asList(
                        "Sadistic, unhinged, and theatrical",
                        "Completely unpredictable",
                        "Obsessed with power and Aether control",
                        "Manipulative genius with violent tendencies",
                        "Loves conducting dangerous experiments"
                ),
                Arrays.asList(
                        "“Your screams… AHAHA! They bring me such joy!”",
                        "“I will do it! For SCIENCE!”",
                        "“Oops! Did I *accidentally* cause your suffering?”"
                ),
                "Ultimis Richtofen is the chaotic architect of the early Aether story—an insane visionary whose violent experiments and multiverse ambitions shape the entire Zombies narrative.",
                R.drawable.richtofen_ultimis_uc_pfp
        ));


// ------------------------- PRIMIS -------------------------
        easterEggs.add(new EasterEgg(
                "Herr Doctor",
                "Dr. Edward Richtofen (Primis)",
                "Group 935 / Aether Traveler / Primis",
                "Call of Duty: Black Ops III – Zombies (The Giant / Shadows of Evil, 2015)",
                "Primis Richtofen is a calmer, more conflicted, and morally ambiguous version of his Ultimis self. Having seen the horrors of infinite timelines, he seeks to break the cycle of suffering—even if it requires terrible sacrifices. He is still manipulative and secretive, but no longer purely evil.\n\nPrimis Richtofen works alongside the Primis crew to collect their souls and set the multiverse on the path to salvation. However, his hidden knowledge and altered personality create tension within the group—especially with Dempsey and Takeo.\n\nStruggling between redemption and obsession, Primis Richtofen remains one of the most complex figures in the entire Zombies narrative.",
                Arrays.asList(
                        "Intelligent, secretive, and morally grey",
                        "Burdened by knowledge of infinite timelines",
                        "Less insane but still unpredictable",
                        "Driven to save reality—at any cost",
                        "Conflicted between redemption and obsession"
                ),
                Arrays.asList(
                        "“The multiverse must be cleansed… you will understand soon.”",
                        "“I carry knowledge that none of you could comprehend.”",
                        "“This time… I will set things right.”"
                ),
                "Primis Richtofen is the narrative architect of BO3 Zombies, representing sacrifice, secrets, and the tragic consequences of trying to fix the multiverse.",
                R.drawable.richtofen_primis_pfp
        ));


    }

    public static List<EasterEgg> getEasterEggs() {
        return easterEggs;
    }
}