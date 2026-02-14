package com.example.parkinglot.Entity;

import java.util.UUID;

public class ParkingSpot {
    private final String spotId;
    private boolean isFree = true;

    public ParkingSpot() {
        this.spotId = UUID.randomUUID().toString();

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
