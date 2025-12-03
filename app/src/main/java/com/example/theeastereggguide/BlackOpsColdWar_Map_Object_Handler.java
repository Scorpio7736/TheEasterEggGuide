package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BlackOpsColdWar_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- Black Ops Cold War --------------------------

        mapObjects.put(
                Enums.COD_MAP.DIE_MASCHINE,
                new Map_OBJECT(
                        Enums.COD_MAP.DIE_MASCHINE.toString(),
                        R.drawable.diemachine_bocw,
                        new ArrayList<>(Collections.singletonList("Die Maschine Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Alone",
                                "Dancing Zombies EE",
                                "Coffin Dance EE",
                                "Aetherscope Parts EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "D.I.E. Wonder Weapon (4 Upgrades)",
                                "Aether Tunnel System",
                                "Dark Aether Vision",
                                "Crafting Table"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.FIREBASE_Z,
                new Map_OBJECT(
                        Enums.COD_MAP.FIREBASE_Z.toString(),
                        R.drawable.firebasez_bocw,
                        new ArrayList<>(Collections.singletonList("Firebase Z Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Lost",
                                "Rabbit EE",
                                "Monkey Bomb Upgrade EE",
                                "Free Juggernog EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "RAI K-84 Wonder Weapon",
                                "Assault Rounds",
                                "Teleporter System",
                                "Orda Boss Fight"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.MFS_TOO,
                new Map_OBJECT(
                        Enums.COD_MAP.MFS_TOO.toString(),
                        R.drawable.mauerdertoten_bocw,
                        new ArrayList<>(Collections.singletonList("Mauer der Toten Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Amoeba",
                                "Free CRBR-S EE",
                                "Bunny Disco EE",
                                "Safe Dial EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "CRBR-S Wonder Weapon",
                                "Klaus (A.I. Companion)",
                                "Zipline System",
                                "Train System"
                        ))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.FORSAKEN,
                new Map_OBJECT(
                        Enums.COD_MAP.FORSAKEN.toString(),
                        R.drawable.forsaken_bocw,
                        new ArrayList<>(Collections.singletonList("Forsaken Main Quest")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Never Gonna Give You Up",
                                "Arcade Games EE",
                                "Free Chrysalax EE",
                                "Perkaholic EE"
                        )),
                        new ArrayList<>(Arrays.asList(
                                "Chrysalax Wonder Weapon",
                                "Teleporter System",
                                "Abomination Boss Fight",
                                "Aetherium Neutralizer"
                        ))
                )
        );

        return mapObjects;
    }
}
