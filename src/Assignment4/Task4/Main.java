package Assignment4.Task4;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(20, true);

        YandexOrderProcess yandex = new YandexOrderProcess();
        yandex.processOrder(order);
        System.out.println(order);

        order = new Order(20, true);

        UberOrderProcess uber = new UberOrderProcess();
        uber.processOrder(order);
        System.out.println(order);
    }
}
