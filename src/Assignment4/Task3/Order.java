package Assignment4.Task3;

public class Order {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double getPrice(int param) {
        return pricingStrategy.execute(param);
    }
}
