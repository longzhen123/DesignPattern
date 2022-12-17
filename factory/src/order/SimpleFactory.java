package order;

import pizza.CheesePizza;
import pizza.GreekPizza;
import pizza.PepperPizza;
import pizza.Pizza;

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
