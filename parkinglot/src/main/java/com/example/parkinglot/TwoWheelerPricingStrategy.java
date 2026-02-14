package com.example.parkinglot;

public class TwoWheelerPricingStrategy implements PricingStrategy{



    @Override
    public double calculatePrice(double hours) {
        if (hours < 1 ) return 5;
        return 5*hours;
    }
}
