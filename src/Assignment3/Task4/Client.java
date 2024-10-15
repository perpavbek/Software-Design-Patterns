package Assignment3.Task4;

public class Client {
    private String name;
    private Mediator mediator;

    public Client(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void requestDriver() {
        mediator.notify(this, "RequestDriver");
    }

    public String getName() {
        return name;
    }
}
