package Assignment3.Task1;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }
    public abstract boolean handle(Request request);
}