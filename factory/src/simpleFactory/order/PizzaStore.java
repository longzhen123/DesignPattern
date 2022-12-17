package simpleFactory.order;

public class PizzaStore {

    public static void main(String[] args) {
//        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
//        orderPizza.order();

        OrderPizza2 orderPizza2 = new OrderPizza2();
        orderPizza2.order();
    }
}
