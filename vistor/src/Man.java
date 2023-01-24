/**
 * @author LongZhen
 * @date Created in 2023/1/24 15:59
 */


public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
