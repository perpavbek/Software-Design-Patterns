package Assignment3.Task1;

public class PassengerBalanceHandler extends Handler{

    @Override
    public boolean handle(Request request) {
        if(request.getPassengerBalance() < request.getTripCost()){
            return false;
        }
        return next == null || next.handle(request);
    }
}
