package com.Almus.Entity;

public class Station {
    private int id;
    private String stationName;
    private String stationLocation;

    public Station(int id,
                   String stationName,
                   String stationLocation) {
        this.id = id;
        this.stationName = stationName;
        this.stationLocation = stationLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }
}
