package good;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOrderConfirmation(Customer customer, Order order) {
        System.out.println("Sending email notification to: " + customer.getEmail()
                + " with message: Order " + order.getName() + " confirmed");
    }
}
