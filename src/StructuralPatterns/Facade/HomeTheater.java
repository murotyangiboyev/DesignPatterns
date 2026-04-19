package StructuralPatterns.Facade;

public class HomeTheater {
    private TV tv;
    private SoundSystem sound;
    private Lights lights;
    private DvdPlayer dvd;

    public HomeTheater(TV tv, SoundSystem sound, Lights lights, DvdPlayer dvd){
        this.tv = tv;
        this.sound = sound;
        this.lights = lights;
        this.dvd = dvd;
    }

    public void watchMovie(String movie){
        System.out.println("--- Get ready to watch a movie! ---");
        lights.dim();
        tv.turnOn();
        sound.turnOn();
        sound.setVolume(20);
        dvd.turnOn();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("--- Shutting movie theater down ---");
        lights.turnOn();
        tv.turnOff();
        sound.turnOff();
        dvd.turnOff();
    }
}
