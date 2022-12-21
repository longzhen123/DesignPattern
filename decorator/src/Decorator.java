/**
 * @author LongZhen
 * @date Created in 2022/12/21 15:22
 */


public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() + " && " + drink.getDes();

    }
}
