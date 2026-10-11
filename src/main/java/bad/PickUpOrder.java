package bad;

public class PickUpOrder extends Order {
    public PickUpOrder(String name, double price) { super(name, price); }

    @Override
    public void ship() {
        throw new UnsupportedOperationException("Pick-up orders can't be shipped");
    }
}
