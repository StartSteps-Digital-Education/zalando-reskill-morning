package org.startsteps.week10.day04.exercises.dependency;

public class Exercise4 {
    public static void main(String[] args) {
        NotificationChannel email = new EmailNotification();
        NotificationChannel sms = new SMSNotification();
        NotificationChannel push = new PushNotification();

        NotificationSender sender = new NotificationSender(email);
        sender.sendNotification("Hello via Email!");

        sender = new NotificationSender(sms);
        sender.sendNotification("Hello via SMS!");

        sender = new NotificationSender(push);
        sender.sendNotification("Hello via Push!");
    }
}


interface NotificationChannel {
    void send(String message);
}

class EmailNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}

class NotificationSender {
    private NotificationChannel channel;

    public NotificationSender(NotificationChannel channel) {
        this.channel = channel;
    }

    public void sendNotification(String message) {
        channel.send(message);
    }
}
