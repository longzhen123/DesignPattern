package objectadapter;

public class Adapter implements IVoltage5V{

    private Voltage220V voltage220V;

    public Adapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        return voltage220V.output220V() / 44;
    }
}
