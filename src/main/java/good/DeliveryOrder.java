package good;

public class DeliveryOrder extends Order implements Shippable {
    public DeliveryOrder(String name, double price) { super(name, price); }

    @Override
    public void ship() {
        System.out.println("Delivering " + getName() + " to customer's address");
    }
}
