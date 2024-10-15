package Assignment3.Task2;

public class CancelOrderCommand implements Command{
    private Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }
    @Override
    public void execute() {
        order.cancelOrder();
    }
}
