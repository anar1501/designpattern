package structural.facade.bestcase;

public class Main {
    public static void main(String[] args) {
        // Creating subsystem instances
        OrderSystem orderSystem = new OrderSystem();
        PaymentSystem paymentSystem = new PaymentSystem();

        // Creating the facade
        ECommerceFacade eCommerceFacade = new ECommerceFacade(orderSystem, paymentSystem);

        // Using the facade to place an order
        eCommerceFacade.placeOrder("Laptop", 1, "Credit Card", 1500.00, "123 Main St");

        // Using the facade to get order details
        eCommerceFacade.getOrderDetails(1);
    }
}

