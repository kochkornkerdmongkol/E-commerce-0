package StrategyPattern;

import DataModels.Order;

/**
 * คำณวนราคา
 */
public class OrderCalculator {
    public double calculateFinalPrice(Order order, DiscountStrategy strategy){
        return strategy.applyDiscount(order);
        
    }
}
