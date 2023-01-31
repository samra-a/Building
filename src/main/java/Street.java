import interfaces.IResident;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private ArrayList<Building> buildingsOnStreet;
    private List<IResident> residents;

    public ArrayList<Building> getBuildingsOnStreet() {
        return buildingsOnStreet;
    }

    public void setBuildingsOnStreet(ArrayList<Building> buildingsOnStreet) {
        this.buildingsOnStreet = buildingsOnStreet;
    }

    public List<IResident> getResidents() {
        return residents;
    }

    public void setResidents(List<IResident> residents) {
        this.residents = residents;
    }

    public Street(){
        this.buildingsOnStreet = new ArrayList<>();
        this.residents = new ArrayList<>();
    }
    public int countBuildings(){
        return this.buildingsOnStreet.size();
    }
    public void addBuilding(Building building){
        this.buildingsOnStreet.add(building);
    }




}
