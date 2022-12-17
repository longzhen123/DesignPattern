package simpleFactory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("辣椒pizza prepare");
        setName("辣椒");
    }
}
