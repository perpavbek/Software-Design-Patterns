package Assignment3.Task1;

public class LocationHandler extends Handler{

    @Override
    public boolean handle(Request request) {
        if(!request.getLocations().contains(request.getPassengerLocation())){
            return false;
        }
        return next == null || next.handle(request);
    }
}
