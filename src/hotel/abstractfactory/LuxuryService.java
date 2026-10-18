package hotel.abstractfactory;

public class LuxuryService implements HotelService {
    @Override
    public String getDescription() {
        return "Luxury breakfast and room service";
    }
}
