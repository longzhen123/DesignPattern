package objectadapter;

import objectadapter.Phone;

public class Client {

    public static void main(String[] args) {

        Adapter adapter = new Adapter(new Voltage220V());

        Phone phone = new Phone();
        phone.charging(adapter);
    }
}
