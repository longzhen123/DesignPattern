/**
 * @author LongZhen
 * @date Created in 2023/1/24 15:59
 */


public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
