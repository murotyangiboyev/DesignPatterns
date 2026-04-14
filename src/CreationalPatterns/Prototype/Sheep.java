package CreationalPatterns.Prototype;

public class Sheep implements AnimalPrototype {
    public String name;
    public Stomach stomach;

    public Sheep(String name, Stomach stomach) {
        this.name = name;
        this.stomach = stomach;
    }
    @Override
    public AnimalPrototype clone() {
        Stomach clonedStomach = stomach.cloneStomach();
        return new  Sheep(name + " Clone", clonedStomach);
    }

    public void eat(int amount){
        stomach.foodAmount += amount;
        System.out.println(name + " ate. Stomach now has: " + stomach.foodAmount );
    }

    public String getName() {
        return name;
    }

    public Stomach getStomach() {
        return stomach;
    }
}
