package Assignment4.Task2;

import java.util.Scanner;

public class ConfirmedState extends State {
    Scanner sc = new Scanner(System.in);

    public ConfirmedState(Order order) {
        super(order);
    }

    @Override
    public String getStateName() {
        return "Confirmed";
    }

    @Override
    public void doAction(){
        System.out.println("Your order has been confirmed");
        order.setState(new EnRouteState(order));
    }
}