package abstractFactory.pizza.simpleFactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("奶酪pizza prepare");
        setName("奶酪");
    }
}
