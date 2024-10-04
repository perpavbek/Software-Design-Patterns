package Assignment2;

public class Client {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Car car = new Car();
        CarSharing carSharing = new CarSharing(car);
        TaxiService taxiService =  new CarSharingAdapter(carSharing);
        taxiService.requestTaxi(passenger);
}
}
