package abstractFactory.pizza.simpleFactory.order;

import abstractFactory.pizza.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {


    public void order() {
        Pizza pizza = null;
        do {

            pizza = SimpleFactory.createPizza2(getType());

            if(null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }

        } while (true);

    }

    public String getType() {

        BufferedReader bufferedReader = null;

        try {
            System.out.println("输入pizza类型：");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();

            return str;
        } catch (IOException e) {
            return "";
//        } finally {
//
//            if(null != bufferedReader) {
//                try {
//                    bufferedReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
        }
    }
}
