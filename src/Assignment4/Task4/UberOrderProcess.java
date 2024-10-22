package Assignment4.Task4;

public class UberOrderProcess extends OrderProcess {
    @Override
    public void calculateCost(Order order) {
        order.setCost(order.getTime() * 150);
    }

    @Override
    void confirmOrder(Order order) {
        if(order.getTime() < 120){
            order.confirm();
        }
        else{
            System.out.println("Time is too long");
        }
    }
}
