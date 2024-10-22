package Assignment4.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Client client = new Client();

        order.addEvent("approaching");
        order.addEvent("changing");

        order.subscribe("approaching", client);
        order.subscribe("changing", client);

        order.notify("changing", "We are sorry, your taxi will late");
        order.notify("approaching", "Your taxi is near");
    }
}
