package structural.facade.worstcase;

public class OrderSystem {
    public void createOrder(String product, int quantity) {
        System.out.println("Order created for " + quantity + " of " + product);
    }

    public void getOrderStatus(int orderId) {
        System.out.println("Order status for order ID: " + orderId);
    }
}

