package com.example.theeastereggguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps_OBJECT_HANDLER {

    private final Map<Enums.COD_MAP, Map_OBJECT> mapObjects = new HashMap<>();

    public Maps_OBJECT_HANDLER() {
        // This is placeholder data and needs to be filled in for each map.
        mapObjects.put(Enums.COD_MAP.NACHT_DER_UNTOTEN, new Map_OBJECT(
                Enums.COD_MAP.NACHT_DER_UNTOTEN.toString(),
                new ArrayList<>(Arrays.asList("None")),
                new ArrayList<>(Arrays.asList(
                        "Music Radio",
                        "Secret Barrier Glitch"
                )),
                new ArrayList<>(Arrays.asList(
                        "None"
                ))
        ));

        for (Enums.COD_MAP map : Enums.COD_MAP.values()) {
            if (!mapObjects.containsKey(map)) {
                mapObjects.put(map, new Map_OBJECT(map.toString(), new ArrayList<>(Arrays.asList("Main Quest Placeholder")), new ArrayList<>(), new ArrayList<>()));
            }
        }
    }

    public Map_OBJECT getMapObject(Enums.COD_MAP map) {
        return mapObjects.get(map);
    }
}
