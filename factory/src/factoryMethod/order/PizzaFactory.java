package factoryMethod.order;

import factoryMethod.pizza.Pizza;

public abstract class PizzaFactory {

    public abstract Pizza create(String orderType);

}
