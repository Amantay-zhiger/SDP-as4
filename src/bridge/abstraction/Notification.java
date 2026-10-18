package bridge.abstraction;

import bridge.implementation.MessageSender;

public abstract class Notification {
    protected final MessageSender sender;

    protected Notification(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String recipient, String message);
}
