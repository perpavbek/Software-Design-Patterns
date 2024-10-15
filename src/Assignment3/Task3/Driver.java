package Assignment3.Task3;

public class Driver {
    private String name;
    private boolean availability;

    public Driver(String name, boolean availability) {
        this.name = name;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return availability;
    }
}
