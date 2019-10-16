package com.Almus.Entity;

public class Ticket {
    private int locationInRouteId;
    private int destinationInRouteId;
    private int seatNum;
    private int cargoNum;

    public Ticket(int locationInRouteId, int destinationInRouteId, int seatNum, int cargoNum) {
        this.locationInRouteId = locationInRouteId;
        this.destinationInRouteId = destinationInRouteId;
        this.seatNum = seatNum;
        this.cargoNum = cargoNum;
    }

    public int getLocationInRouteId() {
        return locationInRouteId;
    }

    public void setLocationInRouteId(int locationInRouteId) {
        this.locationInRouteId = locationInRouteId;
    }

    public int getDestinationInRouteId() {
        return destinationInRouteId;
    }

    public void setDestinationInRouteId(int destinationInRouteId) {
        this.destinationInRouteId = destinationInRouteId;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getCargoNum() {
        return cargoNum;
    }

    public void setCargoNum(int cargoNum) {
        this.cargoNum = cargoNum;
    }
}
