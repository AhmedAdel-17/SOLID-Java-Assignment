package good;

public class MasterCardPayment implements PaymentMethod {
    @Override public String getDisplayName() { return "MASTER_CARD"; }
    @Override public void pay(double amount) {
        System.out.println("Processing MasterCard payment: " + amount);
    }
}
