package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WorldAtWar_Map_Object_Handler {
    public static Map<Enums.COD_MAP, Map_OBJECT> getMaps() {
        Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

        // -------------------------- World at War --------------------------
        ArrayList<ExpandableItem> nachtMainQuest = new ArrayList<>();
        nachtMainQuest.add(new ExpandableItem("Survive", new ArrayList<>(Arrays.asList("Step 1: Open the Help Door", "Step 2: Get a gun from the mystery box", "Step 3: Survive as long as you can"))));

        ArrayList<ExpandableItem> nachtSideQuests = new ArrayList<>();
        nachtSideQuests.add(new ExpandableItem("Music Radio", new ArrayList<>(Arrays.asList("Step 1: Find the radio", "Step 2: Activate the radio"))));
        nachtSideQuests.add(new ExpandableItem("Secret Barrier Glitch", new ArrayList<>(Arrays.asList("Step 1: Find the barrier", "Step 2: Perform the glitch"))));

        mapObjects.put(
                Enums.COD_MAP.NACHT_DER_UNTOTEN,
                new Map_OBJECT(
                        Enums.COD_MAP.NACHT_DER_UNTOTEN.toString(),
                        R.drawable.nacht_waw,
                        nachtMainQuest,
                        nachtSideQuests,
                        new ArrayList<>()
                ));

        mapObjects.put(
                Enums.COD_MAP.VERRUCKT,
                new Map_OBJECT(
                        Enums.COD_MAP.VERRUCKT.toString(),
                        R.drawable.verruckt_waw,
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<>()
                )
        );

        mapObjects.put(
                Enums.COD_MAP.SHI_NO_NUMA,
                new Map_OBJECT(
                        Enums.COD_MAP.SHI_NO_NUMA.toString(),
                        R.drawable.shinonuma_waw,
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<>()
                )
        );

        mapObjects.put(
                Enums.COD_MAP.DER_RIESE,
                new Map_OBJECT(
                        Enums.COD_MAP.DER_RIESE.toString(),
                        R.drawable.derreise_waw,
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<>()
                )
        );
        return mapObjects;
    }
}
