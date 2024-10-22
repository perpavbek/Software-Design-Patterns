package Assignment4.Task4;

public class Order {
    private int distance;
    private int time;
    private int cost;
    private boolean isAvailable;
    private boolean isConfirmed;
    public Order(int distance, boolean isAvailable) {
        this.distance = distance;
        this.isAvailable = isAvailable;
        this.time = distance * 2;
    }
    public int getDistance() {
        return distance;
    }
    public int getTime() {
        return time;
    }
    public boolean isConfirmed() {
        return isConfirmed;
    }
    public void confirm() {
        isConfirmed = true;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    @Override
    public String toString() {
        return "Order info\nDistance = " + distance + "\nTime = " + time + "\nCost = " + cost + "\nAvailable = " + isAvailable + "\nConfirmed = " + isConfirmed;
    }
}
