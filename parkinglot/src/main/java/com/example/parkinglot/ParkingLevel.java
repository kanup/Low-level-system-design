package com.example.parkinglot;

import com.example.parkinglot.Entity.ParkingSpot;

import java.util.List;

public class ParkingLevel {
    private List<ParkingSpot> spots;

    public ParkingLevel(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }
}
