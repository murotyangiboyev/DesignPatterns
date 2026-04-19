package StructuralPatterns.Facade;

public class DvdPlayer {
    public void turnOn(){
        System.out.println("DVD Player is ON");
    }
    public void play(String movie){
        System.out.println("Playing \"" + movie + "\"");
    }
    public void turnOff(){
        System.out.println("DVD Player is OFF");
    }
}
