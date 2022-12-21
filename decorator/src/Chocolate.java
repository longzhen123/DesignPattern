/**
 * @author LongZhen
 * @date Created in 2022/12/21 15:25
 */


public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
