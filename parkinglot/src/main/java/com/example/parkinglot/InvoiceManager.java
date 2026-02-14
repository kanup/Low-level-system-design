package com.example.parkinglot;

public class InvoiceManager {
    private final PricingStrategyRetriever pricingStrategyRetriever;
    public InvoiceManager ( PricingStrategyRetriever pricingStrategyRetriever){

        this.pricingStrategyRetriever = pricingStrategyRetriever;
    }

    public double calculateBill(Ticket ticket){
        double duartion = ticket.getCheckoutTime() - ticket.getCheckinTime();
        PricingStrategy strategy = pricingStrategyRetriever.getPricingStrategy(ticket.getVehicle().getVehicleType());
        return strategy.calculatePrice(duartion);
    }
}
