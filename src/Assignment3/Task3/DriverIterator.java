package Assignment3.Task3;

import java.util.Iterator;

public class DriverIterator implements Iterator<Driver> {
    private DriverCollection drivers;
    private int index = 0;

    public DriverIterator(DriverCollection drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean hasNext() {
        return index < drivers.getDrivers().size();
    }

    @Override
    public Driver next() {
        return drivers.getDrivers().get(index++);
    }
}
