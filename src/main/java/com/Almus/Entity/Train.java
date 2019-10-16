package com.Almus.Entity;

public class Train {
    private int trainId;
    private int capacity;
    private String trainClass;
    private String releaseDate;

    public Train(int trainId, int capacity, String trainClass, String releaseDate) {
        this.trainId = trainId;
        this.capacity = capacity;
        this.trainClass = trainClass;
        this.releaseDate = releaseDate;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTrainClass() {
        return trainClass;
    }

    public void setTrainClass(String trainClass) {
        this.trainClass = trainClass;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
