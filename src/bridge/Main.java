package bridge;

import bridge.abstraction.AlertNotification;
import bridge.abstraction.Notification;
import bridge.abstraction.ReminderNotification;
import bridge.implementation.EmailSender;
import bridge.implementation.MessageSender;
import bridge.implementation.SmsSender;

public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        Notification alertByEmail = new AlertNotification(emailSender);
        Notification alertBySms = new AlertNotification(smsSender);

        Notification reminderByEmail = new ReminderNotification(emailSender);
        Notification reminderBySms = new ReminderNotification(smsSender);

        System.out.println("=== Bridge Pattern Demo ===");

        alertByEmail.notifyUser(
                "student@example.com",
                "Assignment deadline is today."
        );

        System.out.println();

        alertBySms.notifyUser(
                "+77001234567",
                "Assignment deadline is today."
        );

        System.out.println();

        reminderByEmail.notifyUser(
                "student@example.com",
                "Do not forget to upload the project."
        );

        System.out.println();

        reminderBySms.notifyUser(
                "+77001234567",
                "Defense practice starts next week."
        );

        System.out.println();
        System.out.println("=== Runtime implementation switching ===");

        Notification notification = new AlertNotification(emailSender);
        notification.notifyUser(
                "student@example.com",
                "First message uses Email."
        );

        // The same abstraction type is recreated with another implementor.
        // AlertNotification itself does not need to change.
        notification = new AlertNotification(smsSender);
        notification.notifyUser(
                "+77001234567",
                "The same alert now uses SMS."
        );
    }
}
