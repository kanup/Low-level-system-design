package com.example.parkinglot;

import com.example.parkinglot.Entity.ParkingSpot;
import com.example.parkinglot.Entity.Vehicle;

import java.time.LocalDateTime;

public class EntranceGate {

    private final ParkingLotManager parkinglotManager;

    public EntranceGate(ParkingLotManager parkinglotManager){
        this.parkinglotManager = parkinglotManager;
    }

    public Ticket bookSpot( Vehicle vehicle){

        ParkingSpot spot = parkinglotManager.findAndPark(vehicle);
        if( spot == null ){
            throw new RuntimeException("Parking Lot Full!");
        }else{
            return new Ticket(vehicle,spot);
        }

    }

}