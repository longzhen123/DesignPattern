package abstractFactory.order;

import abstractFactory.pizza.Pizza;

public abstract class PizzaFactory {

    public abstract Pizza create(String orderType);

}
