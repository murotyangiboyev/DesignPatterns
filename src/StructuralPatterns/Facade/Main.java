package StructuralPatterns.Facade;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem sound  = new SoundSystem();
        Lights lights = new Lights();
        DvdPlayer dvd = new DvdPlayer();

        HomeTheater theater = new HomeTheater(tv, sound, lights, dvd);
        theater.watchMovie("Intersteller");
        theater.endMovie();
    }

}
