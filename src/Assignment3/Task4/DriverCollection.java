package Assignment3.Task4;

import java.util.ArrayList;

public class DriverCollection {
    private ArrayList<Driver> drivers;

    public DriverCollection() {
        drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public DriverIterator iterator() {
        return new DriverIterator(this);
    }

    public Driver getAvailableDriver(){
        for (Driver driver : getDrivers()) {
            if(driver.isAvailable()) {
                return driver;
            }
        }
        return null;
    }
}
