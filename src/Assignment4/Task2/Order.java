package Assignment4.Task2;

public class Order {
    private State state;

    public Order() {
        this.state = new CreatedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getOrderStatus(){
        return this.state.getStateName();
    }

    public void createOrder(){
        while (!state.getStateName().equals("Completed")) {
            state.doAction();
        }
    }
}