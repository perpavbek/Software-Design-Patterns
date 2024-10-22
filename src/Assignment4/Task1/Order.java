package Assignment4.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private Map<String, List<EventListener>> eventListeners = new HashMap<>();

    public void addEvent(String event) {
        if (!eventListeners.containsKey(event)) {
            this.eventListeners.put(event, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener eventListener) {
        List<EventListener> listeners = eventListeners.get(event);
        listeners.add(eventListener);
    }
    public void unsubscribe(String event, EventListener eventListener) {
        List<EventListener> listeners = eventListeners.get(event);
        listeners.remove(eventListener);
    }
    public void notify(String event, String message) {
        List<EventListener> listeners = eventListeners.get(event);
        for (EventListener listener : listeners) {
            listener.update(event, message);
        }
    }
}
