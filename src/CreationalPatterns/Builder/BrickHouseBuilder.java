package CreationalPatterns.Builder;

public class BrickHouseBuilder implements HouseBuilder {

    private House house = new House();

    public void buildWalls(){
        house.setWalls("Brick walls");
    }
    public void buildRoof(){
        house.setRoof("Concrete roof");
    }
    public void buildGarage(){
        house.setHasGarage(false);
    }
    public House getHouse(){
        return house;
    }
}
