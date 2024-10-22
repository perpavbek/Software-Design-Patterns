package Assignment4.Task2;

public class CompletedState extends State {
    public CompletedState(Order order) {
        super(order);
    }

    @Override
    public String getStateName() {
        return "Completed";
    }

    @Override
    public void doAction() {
        System.out.println("Your order has been completed");
    }
}