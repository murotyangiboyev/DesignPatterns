package CreationalPatterns.Builder;

public class House {

    private String walls;
    private String roof;
    private boolean hasGarage;

    public void setWalls(String walls){
        this.walls = walls;
    }
    public void setRoof(String roof){
        this.roof = roof;
    }
    public void setHasGarage(boolean hasGarage){
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls +  ", roof=" + roof + ", hasGarage=" + hasGarage + "]";
    }
}
