package com.example.parkinglot;

import com.example.parkinglot.Entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {
    public ParkingSpot findSpot(List<ParkingLevel> parkingLevels);

}
