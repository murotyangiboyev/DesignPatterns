package Prototype;

public class Stomach {

    public int foodAmount;
    public Stomach(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public Stomach cloneStomach() {
        return new Stomach(this.foodAmount);
    }
}
