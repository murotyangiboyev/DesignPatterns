import Singleton.SingletonPattern;

public class Main {
    public static void main(String[] args) {

        SingletonPattern singletonPattern =  SingletonPattern.getInstance();
        singletonPattern.query("Singleton pattern 1");

        SingletonPattern singletonPattern2 =  SingletonPattern.getInstance();
        singletonPattern2.query("Singleton pattern 2");

        System.out.println(singletonPattern == singletonPattern2);

    }
}