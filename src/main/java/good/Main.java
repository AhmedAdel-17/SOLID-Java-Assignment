package good;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sara", "sara@example.com");
        Order deliveryOrder = new DeliveryOrder("Laptop", 1200.0);

        UserManagement userManagement = new UserManagement(
                new DefaultOrderProcessor(),
                new PaymentProcessor(),
                new EmailNotificationService());

        userManagement.placeOrder(customer, deliveryOrder, new VisaPayment());

        // New payment types can be used without changing PaymentProcessor.
        userManagement.placeOrder(customer, new Order("Headphones", 150.0), new PayPalPayment());

        ShippingService shippingService = new ShippingService();
        shippingService.shipAll(List.of(
                new DeliveryOrder("Phone", 800.0),
                new DeliveryOrder("Tablet", 500.0)));

        new PickUpOrder("Book", 20.0).collectAtStore();

        Subscriber subscriber = new Subscriber();
        subscriber.register("Omar");
        subscriber.subscribe("Omar");

        new RegularUser().login("Mona");
    }
}
