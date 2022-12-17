package factoryMethod.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪Pizza");
        System.out.println("伦敦奶酪Pizza");
    }
}
