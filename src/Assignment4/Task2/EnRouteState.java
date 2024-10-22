package Assignment4.Task2;

import java.util.Scanner;

public class EnRouteState extends State{
    Scanner sc = new Scanner(System.in);

    public EnRouteState(Order order) {
        super(order);
    }

    @Override
    public String getStateName() {
        return "En route";
    }
    @Override
    public void doAction(){
        System.out.println("If you arrived, print finish");
        if(sc.nextLine().equals("finish")){
            order.setState(new CompletedState(order));
        }
    }
}