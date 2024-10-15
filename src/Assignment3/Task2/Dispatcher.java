package Assignment3.Task2;

public class Dispatcher {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void execute() {
        command.execute();
    }
}
