package pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("希腊pizza prepare");
        setName("希腊");
    }
}
