package com.example.parkinglot;

import com.example.parkinglot.Entity.VehicleType;

public class ParkingSpotLookupFactory {
    public ParkingSpotLookupStrategy getSpotLookupStrategy(VehicleType type){
        if( type.equals(VehicleType.CAR)){
            return new TwoWheelerSpotLookupStrategy();
        }else{
            return new FourWheelerSpotLookupStrategy();
        }
    }
}
