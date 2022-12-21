/**
 * @author LongZhen
 * @date Created in 2022/12/21 15:25
 */


public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
