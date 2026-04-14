package CreationalPatterns.Builder;

public interface HouseBuilder {

    void buildWalls();
    void buildRoof();
    void buildGarage();
    House getHouse();
}
