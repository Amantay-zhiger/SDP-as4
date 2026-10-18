package hotel.abstractfactory;

public class StandardHotelFactory implements HotelFactory {
    @Override
    public Room createRoom() {
        return new StandardRoom();
    }

    @Override
    public HotelService createService() {
        return new StandardService();
    }
}
