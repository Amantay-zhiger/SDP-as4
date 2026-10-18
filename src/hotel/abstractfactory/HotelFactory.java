package hotel.abstractfactory;

public interface HotelFactory {
    Room createRoom();
    HotelService createService();
}
