package Assignment3.Task4;

public class Driver {
    private String name;
    private boolean availability;
    private Client assignedClient;
    private Mediator mediator;

    public Driver(String name, boolean availability, Mediator mediator) {
        this.name = name;
        this.availability = availability;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setClient(Client assignedClient) {
        this.assignedClient = assignedClient;
        mediator.notify(this, "OnTheWay");
    }
    public Client getAssignedClient(){
        return assignedClient;
    }
}
