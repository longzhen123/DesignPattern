package factoryMethod.order;

import factoryMethod.pizza.BJCheesePizza;
import factoryMethod.pizza.BJPepperPizza;
import factoryMethod.pizza.Pizza;

public class BJPizzaFactory extends PizzaFactory{
    @Override
    public Pizza create(String orderType) {
        Pizza pizza = null;

        if("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
