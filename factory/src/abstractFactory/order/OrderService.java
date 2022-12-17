package abstractFactory.order;

import abstractFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderService {

    AbsFactory factory;

    public void setFactory(AbsFactory factory) {
        this.factory = factory;
    }

    public void order() {
        Pizza pizza = null;

        do {

            pizza = factory.create(getType());

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
        }
    }
}
