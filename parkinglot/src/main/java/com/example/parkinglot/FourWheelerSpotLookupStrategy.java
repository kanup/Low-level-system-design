package com.example.parkinglot;

import com.example.parkinglot.Entity.ParkingSpot;

import java.util.List;

public class FourWheelerSpotLookupStrategy implements ParkingSpotLookupStrategy{

    @Override
    public ParkingSpot findSpot(List<ParkingLevel> parkingLevels) {
        for (ParkingLevel level: parkingLevels){
            for (ParkingSpot spot: level.getSpots()){
                if (spot.isSpotFree()) return spot;
            }
        }
        throw new RuntimeException("Parking is full!");
    }
}
