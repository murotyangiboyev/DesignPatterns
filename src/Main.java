
import Builder.BrickHouseBuilder;
import Builder.House;
import Builder.HouseBuilder;
import Builder.HouseDirector;
import Builder.WoodHouseBuilder;
import FactoryMethod.EmailNotification;
import FactoryMethod.EmailNotificationFactory;
import FactoryMethod.Notification;
import FactoryMethod.NotificationFactory;
import Prototype.AnimalPrototype;
import Prototype.Sheep;
import Prototype.Stomach;
import Singleton.SingletonPattern;

public class Main {
    public static void main(String[] args) {



//         singleton pattern usage
        SingletonPattern singletonPattern =  SingletonPattern.getInstance();
        singletonPattern.query("Singleton pattern 1");

        SingletonPattern singletonPattern2 =  SingletonPattern.getInstance();
        singletonPattern2.query("Singleton pattern 2");

        System.out.println(singletonPattern == singletonPattern2);


        // factory method usage

        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();
        notification.notifyUser();

        HouseBuilder woodBuilder = new WoodHouseBuilder();
        HouseDirector director = new HouseDirector(woodBuilder);
        House woodHouse = director.constructHouse();
        System.out.println(woodHouse);

        HouseBuilder brickHouse = new BrickHouseBuilder();
        director = new HouseDirector(brickHouse);
        House brickHouse2 = director.constructHouse();
        System.out.println(brickHouse2);
//
        Stomach stomach = new Stomach(0);
        Sheep alex = new Sheep("Alex", stomach);
        Sheep bob = (Sheep) alex.clone();
        alex.eat(10);
        System.out.println(bob.name + "'s stomach has: " + bob.stomach.foodAmount);
        bob.eat(20);
        System.out.println(bob.name + "'s stomach has: " + bob.stomach.foodAmount);
    }
}