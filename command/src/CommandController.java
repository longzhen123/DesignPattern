/**
 * @author LongZhen
 * @date Created in 2023/1/24 14:07
 */


public class CommandController {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public CommandController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for(int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

    }

    public void setOnCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onCommandButtonWasPushed(int no) {
        onCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void offCommandButtonWasPushed(int no) {
        offCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void undoCommandButtonWasPushed() {
        if(null == undoCommand) {
            System.out.println("撤销命令是空");
        } else {
            undoCommand.execute();
        }

    }
}
