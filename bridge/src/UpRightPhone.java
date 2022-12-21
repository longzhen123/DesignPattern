/**
 * @author LongZhen
 * @date Created in 2022/12/21 14:28
 */


public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public UpRightPhone() {
    }

    @Override
    public void open() {
        brand.open();
        System.out.println("直板手机");
    }

    @Override
    public void close() {
        brand.close();
        System.out.println("直板手机");
    }

    @Override
    public void call() {
        brand.call();
        System.out.println("直板手机");
    }
}
