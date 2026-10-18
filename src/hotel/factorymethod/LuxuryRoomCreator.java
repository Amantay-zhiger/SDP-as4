package hotel.factorymethod;

public class LuxuryRoomCreator extends RoomCreator {
    @Override
    public Room createRoom() {
        return new LuxuryRoom();
    }
}
