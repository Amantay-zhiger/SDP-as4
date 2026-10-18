package bridge.abstraction;

import bridge.implementation.MessageSender;

public class AlertNotification extends Notification {
    public AlertNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String recipient, String message) {
        sender.send(recipient, "ALERT: " + message);
    }
}
