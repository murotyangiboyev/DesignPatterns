package CreationalPatterns.AbstractFactory;

public class ArcticFactory implements EcosystemFactory{

    public LandAnimal createLandAnimal() {
        return new PolarBear();
    }

    public Bird createBird() {
        return new Penguin();
    }
}
