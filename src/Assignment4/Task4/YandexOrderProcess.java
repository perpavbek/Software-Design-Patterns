package Assignment4.Task4;

public class YandexOrderProcess extends OrderProcess {
    @Override
    public void calculateCost(Order order) {
        order.setCost(order.getDistance() * 300);
    }

    @Override
    void confirmOrder(Order order) {
        if(order.getDistance() < 20){
            order.confirm();
        }
        else{
            System.out.println("Distance is too big");
        }
    }
}
