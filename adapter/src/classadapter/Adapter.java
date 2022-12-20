package classadapter;

public class Adapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        System.out.println("输出" + dst + "V");
        return dst;
    }
}
