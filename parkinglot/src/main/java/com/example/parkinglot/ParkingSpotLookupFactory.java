package com.example.parkinglot;

import com.example.parkinglot.Entity.VehicleType;

public class ParkingSpotLookupFactory {
    public ParkingSpotLookupStrategy getSpotLookupStrategy(VehicleType type){
        if( type.equals(VehicleType.BIKE)){
            return new TwoWheelerSpotLookupStrategy();
        }else{
            return new FourWheelerSpotLookupStrategy();
        }
    }
}
