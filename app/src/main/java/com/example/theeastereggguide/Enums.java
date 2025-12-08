package com.example.theeastereggguide;

public class Enums {

    public enum App_Music
    {

        /*

        Credit for music:

            damned_boiiii.mp3: https://www.youtube.com/watch?v=b4g-twjkQWU&list=RDb4g-twjkQWU&start_radio=1
            damned_boiii.mp3: https://www.youtube.com/watch?v=KbT-jC9W6KA&list=RDKbT-jC9W6KA&start_radio=1
            damned_boii.mp3: https://www.youtube.com/watch?v=_4MvHGw62CI&list=RD_4MvHGw62CI&start_radio=1
            damned_boi.mp3: https://www.youtube.com/watch?v=mdLbVX6bErI&list=RDmdLbVX6bErI&start_radio=1

        Other Audio:

            easter_egg_found.mp3: https://www.youtube.com/watch?v=qfidRRBhFb4

         */
        Damned_Black_Ops_1("Damned Black Ops 1", R.raw.damned_boi),
        Damned_Black_Ops_2("Damned Black Ops 2", R.raw.damned_boii),
        Damned_Black_Ops_3("Damned Black Ops 3", R.raw.damned_boiii),
        Damned_Black_Ops_4("Damned Black Ops 4", R.raw.damned_boiiii);

        private final String displayName;
        private final int musicResId;

        App_Music(String displayName, int musicResId) {
            this.displayName = displayName;
            this.musicResId = musicResId;
        }

        @Override
        public String toString() {
            return displayName;
        }

        public int getMusicResId() {
            return musicResId;
        }
    }
    public enum COD_GAME
    {
        World_at_War("World at War"),
        Black_Ops_1("Black Ops 1"),
        Black_Ops_2("Black Ops 2"),
        Black_Ops_3("Black Ops 3"),
        Black_Ops_4("Black Ops 4"),
        Black_Ops_Cold_war("Black Ops Cold War"),
        Black_Ops_6("Black Ops 6"),
        Black_Ops_7("Black Ops 7");

        private final String displayName;

        COD_GAME(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return displayName;
        }
    }

    public enum COD_MAP {
        // ------------------ World at War ------------------
        NACHT_DER_UNTOTEN("Nacht der Untoten", COD_GAME.World_at_War),
        VERRUCKT("Verrückt", COD_GAME.World_at_War),
        SHI_NO_NUMA("Shi No Numa", COD_GAME.World_at_War),
        DER_RIESE("Der Riese", COD_GAME.World_at_War),

        // ------------------ Black Ops 1 ------------------
        KINO_DER_TOTEN("Kino der Toten", COD_GAME.Black_Ops_1),
        FIVE("Five", COD_GAME.Black_Ops_1),
        DEAD_OPS_ARCADE("Dead Ops Arcade", COD_GAME.Black_Ops_1),
        ASCENSION("Ascension", COD_GAME.Black_Ops_1),
        CALL_OF_THE_DEAD("Call of the Dead", COD_GAME.Black_Ops_1),
        SHANGRI_LA("Shangri-La", COD_GAME.Black_Ops_1),
        MOON("Moon", COD_GAME.Black_Ops_1),

        // ------------------ Black Ops 2 ------------------
        TRANZIT("TranZit", COD_GAME.Black_Ops_2),
        TOWN("Town", COD_GAME.Black_Ops_2),
        FARM("Farm", COD_GAME.Black_Ops_2),
        BUS_DEPOT("Bus Depot", COD_GAME.Black_Ops_2),
        NUKETOWN_ZOMBIES("Nuketown Zombies", COD_GAME.Black_Ops_2),
        DIE_RISE("Die Rise", COD_GAME.Black_Ops_2),
        MOB_OF_THE_DEAD("Mob of the Dead", COD_GAME.Black_Ops_2),
        BURIED("Buried", COD_GAME.Black_Ops_2),
        ORIGINS("Origins", COD_GAME.Black_Ops_2),

        // ------------------ Black Ops 3 ------------------
        SHADOWS_OF_EVIL("Shadows of Evil", COD_GAME.Black_Ops_3),
        THE_GIANT("The Giant", COD_GAME.Black_Ops_3),
        DER_EISENDRACHE("Der Eisendrache", COD_GAME.Black_Ops_3),
        ZETSUBOU_NO_SHIMA("Zetsubou No Shima", COD_GAME.Black_Ops_3),
        GOROD_KROVI("Gorod Krovi", COD_GAME.Black_Ops_3),
        REVELATIONS("Revelations", COD_GAME.Black_Ops_3),
        NACHT_DER_UNTOTEN_ZC("Nacht der Untoten (BO3)", COD_GAME.Black_Ops_3),
        VERRUCKT_ZC("Verrückt (BO3)", COD_GAME.Black_Ops_3),
        SHI_NO_NUMA_ZC("Shi No Numa (BO3)", COD_GAME.Black_Ops_3),
        KINO_DER_TOTEN_ZC("Kino der Toten (BO3)", COD_GAME.Black_Ops_3),
        ASCENSION_ZC("Ascension (BO3)", COD_GAME.Black_Ops_3),
        SHANGRI_LA_ZC("Shangri-La (BO3)", COD_GAME.Black_Ops_3),
        MOON_ZC("Moon (BO3)", COD_GAME.Black_Ops_3),
        ORIGINS_ZC("Origins (BO3)", COD_GAME.Black_Ops_3),
        DEAD_OPS_ARCADE_2("Dead Ops Arcade 2", COD_GAME.Black_Ops_3),

        // ------------------ Black Ops 4 ------------------
        IX("IX", COD_GAME.Black_Ops_4),
        VOYAGE_OF_DESPAIR("Voyage of Despair", COD_GAME.Black_Ops_4),
        BLOOD_OF_THE_DEAD("Blood of the Dead", COD_GAME.Black_Ops_4),
        CLASSIFIED("Classified", COD_GAME.Black_Ops_4),
        DEAD_OF_THE_NIGHT("Dead of the Night", COD_GAME.Black_Ops_4),
        ANCIENT_EVIL("Ancient Evil", COD_GAME.Black_Ops_4),
        ALPHA_OMEGA("Alpha Omega", COD_GAME.Black_Ops_4),
        TAG_DER_TOTEN("Tag der Toten", COD_GAME.Black_Ops_4),
        DEAD_OPS_ARCADE_3("Dead Ops Arcade 3", COD_GAME.Black_Ops_4),

        // ------------------ Black Ops Cold War ------------------
        DIE_MASCHINE("Die Maschine", COD_GAME.Black_Ops_Cold_war),
        FIREBASE_Z("Firebase Z", COD_GAME.Black_Ops_Cold_war),
        MFS_TOO("Mauer der Toten", COD_GAME.Black_Ops_Cold_war),
        FORSAKEN("Forsaken", COD_GAME.Black_Ops_Cold_war);

        private final String displayName;
        private final COD_GAME game;

        COD_MAP(String displayName, COD_GAME game) {
            this.displayName = displayName;
            this.game = game;
        }

        @Override
        public String toString() {
            return displayName;
        }

        public COD_GAME getGame() {
            return game;
        }
    }
}
