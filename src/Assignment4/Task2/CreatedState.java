package Assignment4.Task2;

import java.util.Scanner;

public class CreatedState extends State {

    Scanner sc = new Scanner(System.in);

    public CreatedState(Order order) {
        super(order);
    }

    @Override
    public String getStateName() {
        return "Created";
    }

    @Override
    public void doAction(){
        System.out.println("Please confirm the order, print confirm");
        if(sc.nextLine().equals("confirm")){
            order.setState(new ConfirmedState(order));
        }
    }
}