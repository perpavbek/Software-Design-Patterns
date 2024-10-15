package Assignment3.Task1;

public class CarAvailabilityHandler extends Handler{

    @Override
    public boolean handle(Request request) {
        if(!request.getCarAvailability()){
            return false;
        }
        return next == null || next.handle(request);
    }
}
