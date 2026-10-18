package hotel.facade;
public class HotelFacade{
    private final HotelRoomService room=new HotelRoomService();
    private final PaymentService payment=new PaymentService();
    private final HousekeepingService house=new HousekeepingService();
    private final ReceptionService reception=new ReceptionService();
    public void bookRoom(String g,String t,double a){
        room.reserveRoom(t);payment.processPayment(a);
        house.prepareRoom();
        reception.checkIn(g);
        System.out.println("Booking completed.");
    }
}