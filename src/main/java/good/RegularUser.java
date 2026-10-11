package good;

public class RegularUser implements Registerable, Loggable {
    @Override
    public void register(String name) {
        System.out.println(name + " registered");
    }

    @Override
    public void login(String name) {
        System.out.println(name + " logged in");
    }
}
