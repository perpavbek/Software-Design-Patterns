package Assignment3.Task1;


import java.util.Arrays;
import java.util.List;

public class Car {
    private boolean availability;
    private float tripCost;
    private List<String> locations = Arrays.asList("Location1", "Location2", "Location3");

    public Car(boolean availability, float tripCost) {
        this.availability = availability;
        this.tripCost = tripCost;
    }

    public boolean isAvailable() {
        return availability;
    }
    public float getTripCost() {
        return tripCost;
    }
    public List<String> getLocations() {
        return locations;
    }
}
