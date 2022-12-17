package abstractFactory.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒Pizza");
        System.out.println("伦敦胡椒Pizza");
    }
}
