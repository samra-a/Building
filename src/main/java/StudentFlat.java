import interfaces.IResident;

import java.time.LocalDate;

public class StudentFlat extends Building implements IResident {

    private int numberOfParties;
    private int countResidency;

    public StudentFlat(LocalDate dateOfConstruction, String flooring, int numberOfParties, int countResidency){
        super(dateOfConstruction, flooring);
        this.numberOfParties = numberOfParties;
        this.countResidency = countResidency;
    }

    public int getCountResidency() {
        return countResidency;
    }

    public void setCountResidency(int countResidency) {
        this.countResidency = countResidency;
    }
    public String throwParty(){
        return "I want to leave:/";
    }

    @Override
    public String howToClean() {
        return "scrub every corner of the room, rigorously with bleach!";
    }


    public String payRent(){
        return "Amount of rent varies with number of rooms";
    }

    @Override
    public String amountOfResidents(int countResidency) {
        return "This property has" +countResidency+ " residents occupying it.";
    }
}
