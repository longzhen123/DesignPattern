package factoryMethod.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪Pizza");
        System.out.println("北京奶酪Pizza");
    }
}
