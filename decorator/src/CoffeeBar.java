/**
 * @author LongZhen
 * @date Created in 2022/12/21 15:26
 */


public class CoffeeBar {

    public static void main(String[] args) {

        Drink order = new LongBack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());

        order = new Milk(order);
        System.out.println("order 加入一份牛奶 费用 = " + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());

        order = new Chocolate(order);
        System.out.println("order 加入一份巧克力 费用 = " + order.cost());
        System.out.println("order 加入一份巧克力 描述 = " + order.getDes());

        order = new Soy(order);
        System.out.println("order 加入一份豆浆 费用 = " + order.cost());
        System.out.println("order 加入一份豆浆 描述 = " + order.getDes());

    }
}
