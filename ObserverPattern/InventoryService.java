package ObserverPattern;
import DataModels.Order;
public class InventoryService implements OrderObserver{

    
    @Override
    public void update(Order order) {
        System.out.println("[Inventory Service] Stock has been updated for order:" + order.orderId());
    }

  
    
}
