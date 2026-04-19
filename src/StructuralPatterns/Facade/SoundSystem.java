package StructuralPatterns.Facade;

public class SoundSystem {
    public void turnOn(){
        System.out.println("Sound System is ON");
    }
    public void setVolume(int level){
        System.out.println("Volume set to " + level);
    }
    public void turnOff(){
        System.out.println("Sound System is OFF");
    }
}
