package CreationalPatterns.Builder;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildGarage();
        return houseBuilder.getHouse();
    }
}
