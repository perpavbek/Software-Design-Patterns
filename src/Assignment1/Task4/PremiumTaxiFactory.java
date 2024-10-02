package Assignment1.Task4;

public class PremiumTaxiFactory extends Factory {
    public Taxi createTaxi(String name, String license) {
        return new PremiumTaxi(name, license);
    }
}
