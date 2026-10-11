package good;

import java.util.List;

public class ShippingService {
    public void shipAll(List<? extends Shippable> orders) {
        for (Shippable order : orders) order.ship();
    }
}
