/**
 * @author LongZhen
 * @date Created in 2023/1/23 21:28
 */


public class Client {

    public static void main(String[] args) {

        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("====================");

        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("====================");

        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
        System.out.println("====================");
    }
}
