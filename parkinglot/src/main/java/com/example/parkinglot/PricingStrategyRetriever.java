package com.example.parkinglot;

import com.example.parkinglot.Entity.VehicleType;

public class PricingStrategyRetriever {
//    private PricingStrategy pricingStrategy;
//
//    public PricingStrategyRetriever(PricingStrategy pricingStrategy) {
//        this.pricingStrategy = pricingStrategy;
//    }

    public PricingStrategy getPricingStrategy(VehicleType vehicleType){
        if (vehicleType.equals(VehicleType.BIKE)){
            return new TwoWheelerPricingStrategy();
        }else{
            return new FourWheelerPricingStrategy();
        }

    }
}
