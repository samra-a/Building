import java.util.ArrayList;

public class Street {
    private ArrayList<Building> buildingsOnStreet;

    public ArrayList<Building> getBuildingsOnStreet() {
        return buildingsOnStreet;
    }

    public void setBuildingsOnStreet(ArrayList<Building> buildingsOnStreet) {
        this.buildingsOnStreet = buildingsOnStreet;
    }

    public Street(){
        this.buildingsOnStreet = new ArrayList<>();
    }
    public int countBuildings(){
        return this.buildingsOnStreet.size();
    }
    public void addBuilding(Building building){
        this.buildingsOnStreet.add(building);
    }



}
