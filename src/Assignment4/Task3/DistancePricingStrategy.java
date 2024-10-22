package Assignment4.Task3;

public class DistancePricingStrategy implements PricingStrategy{
    @Override
    public double execute(int distance){
        return distance * 300;
    }
}
