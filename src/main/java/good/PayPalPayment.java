package good;

public class PayPalPayment implements PaymentMethod {
    @Override public String getDisplayName() { return "PAYPAL"; }
    @Override public void pay(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}
