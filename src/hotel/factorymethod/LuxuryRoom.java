package hotel.factorymethod;

public class LuxuryRoom implements Room {
    @Override
    public String getDescription() {
        return "Luxury room with king-size bed";
    }
}
