package good;

public class DefaultOrderProcessor implements OrderProcessor {
    @Override
    public void process(Order order) {
        System.out.println("Processing order: " + order.getName() + " now...");
    }
}
