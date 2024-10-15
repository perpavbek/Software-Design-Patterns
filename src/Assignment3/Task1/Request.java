package Assignment3.Task1;

import java.util.List;

public class Request {
    private float passengerBalance;
    private boolean carAvailability;
    private String passengerLocation;
    private float tripCost;
    private List<String> locations;

    public Request(Passenger passenger, Car car) {
        this.passengerBalance = passenger.getBalance();
        this.passengerLocation = passenger.getLocation();
        this.carAvailability = car.isAvailable();
        this.tripCost = car.getTripCost();
        this.locations = car.getLocations();
    }
    public float getPassengerBalance(){
        return passengerBalance;
    }
    public boolean getCarAvailability(){
        return carAvailability;
    }
    public String getPassengerLocation(){
        return passengerLocation;
    }
    public float getTripCost(){
        return tripCost;
    }
    public List<String> getLocations(){
        return locations;
    }
}
