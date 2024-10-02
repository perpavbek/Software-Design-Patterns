package Assignment1.Task4;

public class StandardTaxiFactory extends Factory {
    public Taxi createTaxi(String name, String license) {
        return new StandardTaxi(name, license);
    }
}
