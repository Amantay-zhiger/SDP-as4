package hotel.abstractfactory;

public class LuxuryHotelFactory implements HotelFactory {
    @Override
    public Room createRoom() {
        return new LuxuryRoom();
    }

    @Override
    public HotelService createService() {
        return new LuxuryService();
    }
}
