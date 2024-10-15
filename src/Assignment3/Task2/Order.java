package Assignment3.Task2;

public class Order {
    private String destination;

    public void createOrder(String destination) {
        this.destination = destination;
        System.out.println("Order created");
    }

    public void cancelOrder() {
        this.destination = null;
        System.out.println("Order cancelled");
    }

    public void changeDestination(String destination) {
        this.destination = destination;
        System.out.println("Destination changed to " + destination);
    }
}
