/**
 * @author LongZhen
 * @date Created in 2023/1/24 14:38
 */


public class Client {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        CommandController commandController = new CommandController();

        commandController.setOnCommand(0, lightOnCommand, lightOffCommand);

        commandController.onCommandButtonWasPushed(0);

        commandController.offCommandButtonWasPushed(0);

        commandController.undoCommandButtonWasPushed();
    }
}
