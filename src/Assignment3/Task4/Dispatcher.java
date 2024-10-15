package Assignment3.Task4;

public class Dispatcher {
    public void notifyDriverAssignment(Driver driver, Client client) {
        System.out.println("Dispatcher: Driver " + driver.getName() + " assigned to client " + client.getName());
    }
    public void notifyOnTheWay(Driver driver) {
        System.out.println("Dispatcher: Driver " + driver.getName() + " on the way");
    }
}
