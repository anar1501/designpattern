package structural.facade.worstcase;
public class Main {
    public static void main(String[] args) {
        // Creating subsystem instances
        OrderSystem orderSystem = new OrderSystem();
        PaymentSystem paymentSystem = new PaymentSystem();

        // Placing an order (Client code directly interacting with subsystems)
        System.out.println("Starting order placement process...");
        orderSystem.createOrder("Laptop", 1);
        paymentSystem.processPayment("Credit Card", 1500.00);
        int orderId = 1;  // Assume an order ID is generated
        System.out.println("Order placed successfully!");

        // Getting order details (Client code directly interacting with subsystems)
        System.out.println("Fetching order details...");
        orderSystem.getOrderStatus(orderId);
    }
}
