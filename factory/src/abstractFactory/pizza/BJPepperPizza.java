package abstractFactory.pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒Pizza");
        System.out.println("北京胡椒Pizza");
    }
}
