
import FactoryMethod.EmailNotification;
import FactoryMethod.EmailNotificationFactory;
import FactoryMethod.Notification;
import FactoryMethod.NotificationFactory;
import Singleton.SingletonPattern;

public class Main {
    public static void main(String[] args) {



        // singleton pattern usage
        SingletonPattern singletonPattern =  SingletonPattern.getInstance();
        singletonPattern.query("Singleton pattern 1");

        SingletonPattern singletonPattern2 =  SingletonPattern.getInstance();
        singletonPattern2.query("Singleton pattern 2");

        System.out.println(singletonPattern == singletonPattern2);


        // factory method usage

        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        notification.notifyUser();


    }
}