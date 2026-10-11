package bad;

public class Order {
    private final String name;
    private final double totalPrice;

    public Order(String name, double totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
    }

    public String getName() { return name; }
    public double getTotalPrice() { return totalPrice; }

    public void ship() {
        System.out.println("Shipping " + name);
    }
}
