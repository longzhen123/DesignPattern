package factoryMethod.order;

import factoryMethod.pizza.*;

public class LDPizzaFactory extends PizzaFactory{
    @Override
    public Pizza create(String orderType) {
        Pizza pizza = null;

        if("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
