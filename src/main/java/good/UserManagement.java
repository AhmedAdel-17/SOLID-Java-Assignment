package good;

public class UserManagement {
    private final OrderProcessor orderProcessor;
    private final PaymentProcessor paymentProcessor;
    private final NotificationService notificationService;

    public UserManagement(OrderProcessor orderProcessor,
                          PaymentProcessor paymentProcessor,
                          NotificationService notificationService) {
        this.orderProcessor = orderProcessor;
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    public void placeOrder(Customer customer, Order order, PaymentMethod paymentMethod) {
        orderProcessor.process(order);
        paymentProcessor.processPayment(order, paymentMethod);
        notificationService.sendOrderConfirmation(customer, order);
    }
}
