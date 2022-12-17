package abstractFactory.order;

import abstractFactory.pizza.BJCheesePizza;
import abstractFactory.pizza.BJPepperPizza;
import abstractFactory.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza create(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
