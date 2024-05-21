package structural.facade.bestcase;

public class Main {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        PaymentSystem paymentSystem = new PaymentSystem();
        ECommerceFacade eCommerceFacade = new ECommerceFacade(orderSystem, paymentSystem);
        eCommerceFacade.placeOrder("Laptop", 1, "Credit Card", 1500.00, "123 Main St");
        eCommerceFacade.getOrderDetails(1);
    }
}

