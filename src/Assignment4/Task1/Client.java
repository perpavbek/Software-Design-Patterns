package Assignment4.Task1;

public class Client implements EventListener {

    @Override
    public void update(String event, String message) {
        System.out.println(message);
    }
}
