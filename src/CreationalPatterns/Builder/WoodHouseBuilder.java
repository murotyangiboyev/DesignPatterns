package CreationalPatterns.Builder;

public class WoodHouseBuilder implements HouseBuilder {

    private House house = new House();

    public void buildWalls(){
        house.setWalls("Wooden walls");
    }
    public void buildRoof(){
        house.setRoof("Wooden roof");
    }
    public void buildGarage(){
        house.setHasGarage(true);
    }
    public House getHouse(){
        return house;
    }
}
