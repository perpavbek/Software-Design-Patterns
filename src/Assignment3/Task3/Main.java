package Assignment3.Task3;

public class Main {
    public static void main(String[] args) {
        DriverCollection drivers = new DriverCollection();
        Driver driver = null;

        drivers.addDriver(new Driver("Pavel", false));
        drivers.addDriver(new Driver("Abu", false));
        drivers.addDriver(new Driver("Ernur", true));

        driver = drivers.getAvailableDriver();

        if(driver != null){
            System.out.println(driver.getName() + " is available");
        }
        else {
            System.out.println("Driver not found");
        }
    }
}
