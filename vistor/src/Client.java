/**
 * @author LongZhen
 * @date Created in 2023/1/24 16:10
 */


public class Client {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();

        structure.attach(new Man());

        structure.attach(new Woman());

        structure.display(new Success());

        System.out.println("=========================");

        structure.display(new Fail());

        System.out.println("=========================");

        structure.display(new Wait());
    }
}
