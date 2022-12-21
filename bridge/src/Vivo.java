/**
 * @author LongZhen
 * @date Created in 2022/12/21 14:25
 */


public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
