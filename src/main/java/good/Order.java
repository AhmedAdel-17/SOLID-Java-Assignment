package good;

public class Order {
    private final String name;
    private final double totalPrice;

    public Order(String name, double totalPrice) {
        if (totalPrice < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.name = name;
        this.totalPrice = totalPrice;
    }

    public String getName() { return name; }
    public double getTotalPrice() { return totalPrice; }
}
