package AbstractFactory;

public class DesertFactory implements EcosystemFactory {

    public LandAnimal createLandAnimal() {
        return new Camel();
    }
    public Bird createBird() {
        return new Eagle();
    }
}
