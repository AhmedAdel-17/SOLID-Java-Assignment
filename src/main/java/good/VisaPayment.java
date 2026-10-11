package good;

public class VisaPayment implements PaymentMethod {
    @Override public String getDisplayName() { return "VISA"; }
    @Override public void pay(double amount) {
        System.out.println("Processing Visa card payment: " + amount);
    }
}
