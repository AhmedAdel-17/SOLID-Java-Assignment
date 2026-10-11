package bad;

public class Subscriber implements UserOperations {
    @Override
    public void register(String name) {
        System.out.println(name + " registered");
    }

    @Override
    public void login(String name) {
        throw new UnsupportedOperationException("Subscribers can't login");
    }

    @Override
    public void subscribe(String name) {
        System.out.println(name + " subscribed to newsletter");
    }
}
