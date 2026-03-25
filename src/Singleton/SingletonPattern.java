package Singleton;

public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {
        System.out.println("Creating Singleton Pattern");
    }

    public static synchronized SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    public void query(String s){
        System.out.println(s);
    }
}
