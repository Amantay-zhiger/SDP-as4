package hotel.abstractfactory;

public class StandardRoom implements Room {
    @Override
    public String getDescription() {
        return "Standard room";
    }
}
