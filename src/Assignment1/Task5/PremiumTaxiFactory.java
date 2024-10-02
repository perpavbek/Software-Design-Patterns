package Assignment1.Task5;

public class PremiumTaxiFactory extends Factory {
    public Taxi createTaxi(String name, String license) {
        return new PremiumTaxi(new PremiumDriver(name), license);
    }
}