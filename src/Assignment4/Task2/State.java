package Assignment4.Task2;

public abstract class State {
    protected Order order;
    public State(Order order) {
        this.order = order;
    }
    abstract public String getStateName();
    abstract public void doAction();
}