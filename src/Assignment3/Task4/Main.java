package Assignment3.Task4;

public class Main {
    public static void main(String[] args) {
        DriverCollection drivers = new DriverCollection();
        Dispatcher dispatcher = new Dispatcher();
        Mediator dispatcherMediator = new DispatcherMediator(drivers, dispatcher);
        drivers.addDriver(new Driver("Pavel", false, dispatcherMediator));
        drivers.addDriver(new Driver("Abu", false, dispatcherMediator));
        drivers.addDriver(new Driver("Ernur", true, dispatcherMediator));

        Client client1 = new Client("Pasha", dispatcherMediator);
        client1.requestDriver();
    }
}
