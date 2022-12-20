package classadapter;

public class Phone {

    public void charging(Adapter adapter) {
        if(5 == adapter.output5V()) {
            System.out.println("可以充电");
        } else if(5 < adapter.output5V()) {
            System.out.println("不可以充电");
        }
    }
}
