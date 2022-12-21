/**
 * @author LongZhen
 * @date Created in 2022/12/21 15:17
 */


public abstract class Drink {
    public String des;
    private float price;

    public String getDes() {
        return des + " " + price;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Drink() {
    }

    public abstract float cost();
}
