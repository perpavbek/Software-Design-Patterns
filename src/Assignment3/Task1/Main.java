package Assignment3.Task1;

public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger("Location3", 5000);
        Car car = new Car(true, 2000);

        CarAvailabilityHandler carAvailabilityHandler = new CarAvailabilityHandler();
        LocationHandler locationHandler = new LocationHandler();
        PassengerBalanceHandler passengerBalanceHandler = new PassengerBalanceHandler();

        carAvailabilityHandler.setNext(passengerBalanceHandler);
        passengerBalanceHandler.setNext(locationHandler);

        Request request = new Request(passenger, car);

        if(carAvailabilityHandler.handle(request)){
            System.out.println("The car is coming to the passenger");
        }
        else{
            System.out.println("The car is not coming to the passenger");
        }
    }
}
