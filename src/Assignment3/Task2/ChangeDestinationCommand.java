package Assignment3.Task2;

public class ChangeDestinationCommand implements Command {
    private Order order;
    private String destination;

    public ChangeDestinationCommand(Order order, String destination) {
        this.order = order;
        this.destination = destination;
    }
    @Override
    public void execute() {
        order.changeDestination(destination);
    }
}
