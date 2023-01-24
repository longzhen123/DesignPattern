/**
 * @author LongZhen
 * @date Created in 2023/1/24 13:54
 */


public class LightOffCommand implements Command{
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
