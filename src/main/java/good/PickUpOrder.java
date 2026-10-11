package good;

public class PickUpOrder extends Order {
    public PickUpOrder(String name, double price) { super(name, price); }

    public void collectAtStore() {
        System.out.println("Order " + getName() + " is ready for store pickup");
    }
}
