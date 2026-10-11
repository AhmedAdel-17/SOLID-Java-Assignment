package good;

public class Subscriber implements Registerable, Subscribable {
    @Override
    public void register(String name) {
        System.out.println(name + " registered");
    }

    @Override
    public void subscribe(String name) {
        System.out.println(name + " subscribed to newsletter");
    }
}
