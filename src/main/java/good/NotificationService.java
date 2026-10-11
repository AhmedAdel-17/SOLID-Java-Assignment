package good;

public interface NotificationService {
    void sendOrderConfirmation(Customer customer, Order order);
}
