package Assignment1.Task1;

public class Client {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();

        DriverManager driverManager = DriverManager.getInstance();

        String driver = driverManager.findNearestDriver("Location A");

        passenger.assignTaxi(driver);

        System.out.println("Passenger's taxi is " + passenger.getTaxi());
    }
}
