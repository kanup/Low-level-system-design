package com.example.parkinglot;

public class FourWheelerPricingStrategy implements PricingStrategy{

    @Override
    public double calculatePrice(double hours) {
        if( hours < 1 ) return 10;
        return 10*hours;
    }
}
