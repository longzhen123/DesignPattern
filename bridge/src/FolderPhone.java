/**
 * @author LongZhen
 * @date Created in 2022/12/21 14:28
 */


public class FolderPhone extends Phone{

    public FolderPhone(Brand brand) {
        super(brand);
    }

    public FolderPhone() {
    }

    @Override
    public void open() {
        brand.open();
        System.out.println("翻盖手机");
    }

    @Override
    public void close() {
        brand.close();
        System.out.println("翻盖手机");
    }

    @Override
    public void call() {
        brand.call();
        System.out.println("翻盖手机");
    }
}
