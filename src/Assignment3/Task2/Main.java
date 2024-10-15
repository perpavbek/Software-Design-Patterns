package Assignment3.Task2;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Dispatcher dispatcher = new Dispatcher();

        Command createOrderCommand = new CreateOrderCommand(order, "Location 1");
        Command cancelOrderCommand = new CancelOrderCommand(order);
        Command changeDestinationCommand = new ChangeDestinationCommand(order, "Location 2");

        dispatcher.setCommand(createOrderCommand);
        dispatcher.execute();

        dispatcher.setCommand(cancelOrderCommand);
        dispatcher.execute();

        dispatcher.setCommand(changeDestinationCommand);
        dispatcher.execute();
    }
}
