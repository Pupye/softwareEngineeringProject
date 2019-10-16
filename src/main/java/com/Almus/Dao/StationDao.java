package com.Almus.Dao;

import com.Almus.Entity.Station;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StationDao {
    private static Map<Integer, Station> stations;

    static {
        stations = new HashMap<Integer, Station>(){
            {
                put(1, new Station(1, "Astana 1", "Astana"));
                put(2, new Station(2, "Kostanai", "Kostanai"));
                put(3, new Station(3, "Almaty 1", "Almaty"));
                put(4, new Station(4, "Almaty 2", "Almaty"));
            }
        };
    }

    public Collection<Station> getAllStations(){
        return stations.values();
    }

}
