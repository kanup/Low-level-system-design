package com.example.parkinglot.Entity;

public class ParkingSpot {
    private final String spotId;
    private boolean isFree = true;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;

    }

    public String getSpotId() {
        return spotId;
    }

    public boolean isSpotFree() {
        return isFree;
    }

    public void setSpotFree() {
        isFree = true;
    }

    public void occupySpot() {
        isFree = false;
    }
}
