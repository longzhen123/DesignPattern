package abstractFactory.pizza.factoryMethod.order;

import abstractFactory.pizza.LDCheesePizza;
import abstractFactory.pizza.LDPepperPizza;
import abstractFactory.pizza.Pizza;

public class LDPizzaFactory extends PizzaFactory {
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
