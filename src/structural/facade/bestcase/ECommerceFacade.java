package structural.facade.bestcase;

public class ECommerceFacade {
    private OrderSystem orderSystem;
    private PaymentSystem paymentSystem;

    public ECommerceFacade(OrderSystem orderSystem, PaymentSystem paymentSystem) {
        this.orderSystem = orderSystem;
        this.paymentSystem = paymentSystem;
    }

    public void placeOrder(String product, int quantity, String paymentType, double amount, String address) {
        System.out.println("Starting order placement process...");
        orderSystem.createOrder(product, quantity);
        paymentSystem.processPayment(paymentType, amount);
        System.out.println("Order placed successfully!");
    }

    public void getOrderDetails(int orderId) {
        System.out.println("Fetching order details...");
        orderSystem.getOrderStatus(orderId);
    }
}

