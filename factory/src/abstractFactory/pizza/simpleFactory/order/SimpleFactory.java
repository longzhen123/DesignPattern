package abstractFactory.pizza.simpleFactory.order;

import abstractFactory.pizza.simpleFactory.pizza.CheesePizza;
import abstractFactory.pizza.simpleFactory.pizza.GreekPizza;
import abstractFactory.pizza.simpleFactory.pizza.PepperPizza;
import abstractFactory.pizza.simpleFactory.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if("cheese".equalsIgnoreCase(orderType)) {
            pizza = new CheesePizza();
        } else if("greek".equalsIgnoreCase(orderType)) {
            pizza = new GreekPizza();
        } else if("pepper".equals(orderType)) {
            pizza = new PepperPizza();
        }

        return pizza;
    }

    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;

        if("cheese".equalsIgnoreCase(orderType)) {
            pizza = new CheesePizza();
        } else if("greek".equalsIgnoreCase(orderType)) {
            pizza = new GreekPizza();
        } else if("pepper".equals(orderType)) {
            pizza = new PepperPizza();
        }

        return pizza;
    }
}
