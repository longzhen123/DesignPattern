package simpleFactory.order;

import simpleFactory.pizza.CheesePizza;
import simpleFactory.pizza.GreekPizza;
import simpleFactory.pizza.PepperPizza;
import simpleFactory.pizza.Pizza;

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
