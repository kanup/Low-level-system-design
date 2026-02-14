package com.example.parkinglot.Entity;

import com.example.parkinglot.ParkingLevel;
import com.example.parkinglot.ParkingSpotLookupStrategy;

import java.util.List;

public class NaturalOrderSpotLookupStrategy  implements ParkingSpotLookupStrategy {
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
