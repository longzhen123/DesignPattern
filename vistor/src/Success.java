/**
 * @author LongZhen
 * @date Created in 2023/1/24 16:01
 */


public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是很成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是很成功");
    }
}
