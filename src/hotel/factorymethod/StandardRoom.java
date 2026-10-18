package hotel.factorymethod;

public class StandardRoom implements Room {
    @Override
    public String getDescription() {
        return "Standard room with one bed";
    }
}
