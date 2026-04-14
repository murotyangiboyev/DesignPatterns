package CreationalPatterns.FactoryMethod;

public class SMSNotification implements Notification {

    public void notifyUser(){
        System.out.println("Sending an Email Notification");
    }
}
