package good;

public class PaymentProcessor {
    public void processPayment(Order order, PaymentMethod paymentMethod) {
        System.out.println("Processing payment for order: " + order.getName());
        System.out.println("Issuing payment for amount: " + order.getTotalPrice());
        paymentMethod.pay(order.getTotalPrice());
    }
}
