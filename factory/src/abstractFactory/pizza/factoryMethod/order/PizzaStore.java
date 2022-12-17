package abstractFactory.pizza.factoryMethod.order;

public class PizzaStore {

    public static void main(String[] args) {

        OrderPizza orderPizza = new OrderPizza();

        String pizzaType = "LD";

        if("BJ".equals(pizzaType)) {
            orderPizza.setPizzaFactory(new BJPizzaFactory());
        } else {
            orderPizza.setPizzaFactory(new LDPizzaFactory());
        }

        orderPizza.order();
    }
}
