package bridge.abstraction;

import bridge.implementation.MessageSender;

public class ReminderNotification extends Notification {
    public ReminderNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String recipient, String message) {
        sender.send(recipient, "REMINDER: " + message);
    }
}
