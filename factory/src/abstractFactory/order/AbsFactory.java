package abstractFactory.order;

import abstractFactory.pizza.Pizza;

public interface AbsFactory {

    Pizza create(String orderType);
}
