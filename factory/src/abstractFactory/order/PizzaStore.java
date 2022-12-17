package abstractFactory.order;

public class PizzaStore {

    public static void main(String[] args) {

        String type = "LD";
        OrderService orderService = new OrderService();
        if("BJ".equals(type)) {
            orderService.setFactory(new BJFactory());
        } else {
            orderService.setFactory(new LDFactory());
        }
        orderService.order();
    }
}
