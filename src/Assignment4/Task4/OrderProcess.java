package Assignment4.Task4;

import java.util.Scanner;

public abstract class OrderProcess {
    public void processOrder(Order order){
        Scanner sc = new Scanner(System.in);
        if(checkAvailability(order)){
            calculateCost(order);
            System.out.println("To confirm the order print confirm");
            if(sc.nextLine().equals("confirm")) {
                confirmOrder(order);
            }
        }
    }

    public boolean checkAvailability(Order order){
        return order.isAvailable();
    }

    abstract void calculateCost(Order order);
    abstract void confirmOrder(Order order);
}
