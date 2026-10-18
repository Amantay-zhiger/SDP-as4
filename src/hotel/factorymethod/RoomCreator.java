package hotel.factorymethod;

public abstract class RoomCreator {
    public abstract Room createRoom();

    public void showRoom() {
        Room room = createRoom();
        System.out.println(room.getDescription());
    }
}
