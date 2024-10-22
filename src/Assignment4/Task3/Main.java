package Assignment4.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order order = new Order();

        System.out.println("Select the strategy:\n1. Fixed\n2. Distance\n3. Time");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                order.setPricingStrategy(new FixedPricingStrategy());
                break;
            case 2:
                order.setPricingStrategy(new DistancePricingStrategy());
                break;
            case 3:
                order.setPricingStrategy(new TimePricingStrategy());
                break;
        }
        System.out.println("Enter the parameter: ");
        System.out.println(order.getPrice(sc.nextInt()));
    }
}
