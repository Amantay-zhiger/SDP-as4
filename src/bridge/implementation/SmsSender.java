package bridge.implementation;

public class SmsSender implements MessageSender {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[SMS] To: " + recipient);
        System.out.println("Message: " + message);
    }
}
