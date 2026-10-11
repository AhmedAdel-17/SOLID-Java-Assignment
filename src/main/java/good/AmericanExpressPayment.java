package good;

public class AmericanExpressPayment implements PaymentMethod {
    @Override public String getDisplayName() { return "AMERICAN_EXPRESS"; }
    @Override public void pay(double amount) {
        System.out.println("Processing American Express payment: " + amount);
    }
}
