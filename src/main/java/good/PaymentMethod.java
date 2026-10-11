package good;

public interface PaymentMethod {
    String getDisplayName();
    void pay(double amount);
}
