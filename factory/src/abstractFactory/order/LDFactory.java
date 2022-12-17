package abstractFactory.order;

import abstractFactory.pizza.*;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza create(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
