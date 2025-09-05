package ObserverPattern;
import DataModels.Order;

/**
 * Conrete observer: ระบบส่งอีเมล
 */
public class EmailService implements OrderObserver{

    @Override
    public void update(Order order) {
        System.out.println("[Email Service] Confirmation email sent to" 
        + order.customerEmail() + "for order:" + order.orderId());
    }

    
    
    
}
