package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Maps_OBJECT_HANDLER {

    private final Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

    public Maps_OBJECT_HANDLER() {
        mapObjects.putAll(WorldAtWar_Map_Object_Handler.getMaps());
        mapObjects.putAll(BlackOps1_Map_Object_Handler.getMaps());
        mapObjects.putAll(BlackOps2_Map_Object_Handler.getMaps());
        mapObjects.putAll(BlackOps3_Map_Object_Handler.getMaps());
        mapObjects.putAll(BlackOps4_Map_Object_Handler.getMaps());
        mapObjects.putAll(BlackOpsColdWar_Map_Object_Handler.getMaps());

        for (Enums.COD_MAP map : Enums.COD_MAP.values()) {
            if (!mapObjects.containsKey(map)) {
                ArrayList<ExpandableItem> defaultMainQuest = new ArrayList<>();
                defaultMainQuest.add(new ExpandableItem("None", new ArrayList<>()));
                mapObjects.put(map, new Map_OBJECT(map.toString(), R.drawable.zombierichtofen_bk, defaultMainQuest, new ArrayList<>(), new ArrayList<>()));
            }
        }
    }

    public Map_OBJECT getMapObject(Enums.COD_MAP map) {
        return mapObjects.get(map);
    }
}
