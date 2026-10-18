package hotel.factorymethod;

public class StandardRoomCreator extends RoomCreator {
    @Override
    public Room createRoom() {
        return new StandardRoom();
    }
}
