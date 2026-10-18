package bridge.implementation;

public class EmailSender implements MessageSender {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[EMAIL] To: " + recipient);
        System.out.println("Message: " + message);
    }
}
