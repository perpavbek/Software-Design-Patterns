package Assignment3.Task4;

public class DispatcherMediator implements Mediator {
    private DriverCollection drivers;
    private Dispatcher dispatcher;

    public DispatcherMediator(DriverCollection drivers, Dispatcher dispatcher) {
        this.drivers = drivers;
        this.dispatcher = dispatcher;
    }

    @Override
    public void notify(Object sender, String event) {
        if(sender instanceof Client && event.equals("RequestDriver")) {
            Driver driver = drivers.getAvailableDriver();
            if(driver != null){
                driver.setClient((Client) sender);
            }
            dispatcher.notifyDriverAssignment(driver, driver.getAssignedClient());
        }
        else if(sender instanceof Driver && event.equals("OnTheWay")) {
            dispatcher.notifyOnTheWay((Driver) sender);
        }
    }
}
