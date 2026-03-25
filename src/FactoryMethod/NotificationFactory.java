package FactoryMethod;

public class NotificationFactory {

    public Notification createNotification(String type){

        if (type == null || type.isEmpty()) return null;

        return switch (type.toLowerCase()){
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            default  -> throw new IllegalArgumentException("Invalid type " + type);
        };
    }
}
