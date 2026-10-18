package hotel.abstractfactory;

public class StandardService implements HotelService {
    @Override
    public String getDescription() {
        return "Standard breakfast service";
    }
}
