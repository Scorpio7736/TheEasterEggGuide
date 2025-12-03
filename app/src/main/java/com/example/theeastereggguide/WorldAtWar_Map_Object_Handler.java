package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WorldAtWar_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- World at War --------------------------
        mapObjects.put(
                Enums.COD_MAP.NACHT_DER_UNTOTEN,
                new Map_OBJECT(
                        Enums.COD_MAP.NACHT_DER_UNTOTEN.toString(),
                        R.drawable.nacht_waw,
                        new ArrayList<>(),
                        new ArrayList<>(Arrays.asList(
                                "Music Radio",
                                "Secret Barrier Glitch"
                        )),
                        new ArrayList<>()
                ));

        mapObjects.put(
                Enums.COD_MAP.VERRUCKT,
                new Map_OBJECT(
                        Enums.COD_MAP.VERRUCKT.toString(),
                        R.drawable.verruckt_waw,
                        new ArrayList<>(Collections.singletonList("None")),
                        new ArrayList<>(Arrays.asList(
                                "Teddy Bear Music Egg",
                                "The Cries of the Damned"
                        )),
                        new ArrayList<>(Collections.singletonList("None"))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.SHI_NO_NUMA,
                new Map_OBJECT(
                        Enums.COD_MAP.SHI_NO_NUMA.toString(),
                        R.drawable.shinonuma_waw,
                        new ArrayList<>(Collections.singletonList("None")),
                        new ArrayList<>(Collections.singletonList(
                                "Song - The One"
                        )),
                        new ArrayList<>(Collections.singletonList("None"))
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DER_RIESE,
                new Map_OBJECT(
                        Enums.COD_MAP.DER_RIESE.toString(),
                        R.drawable.derreise_waw,
                        new ArrayList<>(Collections.singletonList("Fly Trap")),
                        new ArrayList<>(Arrays.asList(
                                "Song - Beauty of Anihilation",
                                "Pack A Punch"
                        )),
                        new ArrayList<>(Collections.singletonList("None"))
                )
        );
        return mapObjects;
    }
}
