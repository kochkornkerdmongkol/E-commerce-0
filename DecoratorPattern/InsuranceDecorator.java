package DecoratorPattern;

import DataModels.Order;
import FactoryMethodPattern.Shipment;

/**
 * บริการการซื้อประกันสินค้า
 */
public class InsuranceDecorator extends ShipmentDecorator{
    private final Order order;
    public InsuranceDecorator(Shipment wrappedShipment, Order order) {
        super(wrappedShipment);
        this.order = order  ;
    }
    
    @Override
    public String getInfo(){
        return super.getInfo() + "+ Insurace";
    }
    
    @Override
    public double getCost(){
        return super.getCost() + (order.getTotalPrice() * 0.10) ; 
    }


}
