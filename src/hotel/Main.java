package hotel;

import hotel.factorymethod.LuxuryRoomCreator;
import hotel.factorymethod.RoomCreator;
import hotel.factorymethod.StandardRoomCreator;
import hotel.abstractfactory.HotelFactory;
import hotel.abstractfactory.HotelService;
import hotel.abstractfactory.Room;

public class Main {
    public static void main(String[] args) {
        demonstrateFactoryMethod();
        System.out.println();
        demonstrateAbstractFactory();
    }

    private static void demonstrateFactoryMethod() {
        System.out.println("=== Factory Method ===");

        RoomCreator standardCreator = new StandardRoomCreator();
        RoomCreator luxuryCreator = new LuxuryRoomCreator();

        standardCreator.showRoom();
        luxuryCreator.showRoom();
    }

    private static void demonstrateAbstractFactory() {
        System.out.println("=== Abstract Factory ===");

        HotelFactory standardFactory =
                new hotel.abstractfactory.StandardHotelFactory();

        HotelFactory luxuryFactory =
                new hotel.abstractfactory.LuxuryHotelFactory();

        printHotelFamily("Standard Hotel", standardFactory);
        printHotelFamily("Luxury Hotel", luxuryFactory);
    }

    private static void printHotelFamily(String hotelName, HotelFactory factory) {
        Room room = factory.createRoom();
        HotelService service = factory.createService();

        System.out.println(hotelName);
        System.out.println("- " + room.getDescription());
        System.out.println("- " + service.getDescription());
    }
}
