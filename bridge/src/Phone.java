/**
 * @author LongZhen
 * @date Created in 2022/12/21 14:27
 */


public abstract class Phone {
    public Brand brand;

    public Phone() {
    }

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void open();
    public abstract void close();
    public abstract void call();

}
