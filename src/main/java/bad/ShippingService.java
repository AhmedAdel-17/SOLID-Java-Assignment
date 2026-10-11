package bad;

import java.util.List;

public class ShippingService {
    public static void shipAll(List<Order> orders) {
        for (Order order : orders) {
            order.ship();
        }
    }
}
