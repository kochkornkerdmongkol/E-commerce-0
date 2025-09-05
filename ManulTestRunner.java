import java.util.List;

import DataModels.*;
import DecoratorPattern.*;
import FactoryMethodPattern.*;
import ObserverPattern.*;
import StrategyPattern.*;


public class ManulTestRunner {
    public static void main(String[] args) {
        System.out.println("--- E-commerce System Simulation ---");
        
        //-- 1. Setup ---
        Product laptop = new Product("P001","Laptop",30000.0);
        Product mouse = new Product("P002", "mouse", 800.0);
        Order myOrder = new Order("ORD-001", List.of(laptop, mouse), "customer@example.com");

        OrderCalculator calculator = new OrderCalculator();
        ShipmentFactory shipmentFactory = new ShipmentFactory();

        OrderProcessor orderProcessor = new OrderProcessor();
        InventoryService inventory =  new InventoryService();
        EmailService emiler = new EmailService();
        orderProcessor.register(inventory);
        orderProcessor.register(emiler);

        System.out.println("\n---2. Testing Strategy Pattern (Discounts) ---");
        double originalPrice = myOrder.getTotalPrice();
        System.out.println("Original Price: " + originalPrice);

        DiscountStrategy tenPercentOff = new FixedDiscount(10);















    }
}
