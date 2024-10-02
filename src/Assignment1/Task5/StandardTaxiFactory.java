package Assignment1.Task5;

public class StandardTaxiFactory extends Factory {
    public Taxi createTaxi(String name, String license) {
        return new StandardTaxi(new StandardDriver(name), license);
    }
}
