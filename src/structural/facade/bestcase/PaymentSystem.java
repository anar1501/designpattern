package structural.facade.bestcase;

public class PaymentSystem {
    public void processPayment(String paymentType, double amount) {
        System.out.println("Processing " + paymentType + " payment of $" + amount);
    }

    public void refundPayment(int orderId, double amount) {
        System.out.println("Refunding payment of $" + amount + " for order ID: " + orderId);
    }
}

