package com.example.parkinglot;

import com.example.parkinglot.Entity.ParkingSpot;
import com.example.parkinglot.Entity.Vehicle;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ParkingLotManager {
    private List<ParkingLevel> parkingLevels;
    private  ParkingSpotLookupFactory parkingSpotLookupFactory;

    public ParkingLotManager(List<ParkingLevel> parkingLevels, ParkingSpotLookupFactory parkingSpotLookupFactory) {
        this.parkingLevels = parkingLevels;
        this.parkingSpotLookupFactory = parkingSpotLookupFactory;
    }

    public ParkingSpot findAndPark(Vehicle vehicle){
        ParkingSpotLookupStrategy parkingSpotLookupStrategy = parkingSpotLookupFactory.getSpotLookupStrategy(vehicle.getVehicleType());
        ParkingSpot spot = parkingSpotLookupStrategy.findSpot(parkingLevels);

        if (spot == null ){
            throw  new RuntimeException("Parking Lot is Full!");
        }else{
            return spot;
        }
    }



}
