package Assignment4.Task3;

public class TimePricingStrategy implements PricingStrategy{

    @Override
    public double execute(int time) {
        return time * 150;
    }
}
