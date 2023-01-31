import interfaces.IResident;

import java.time.LocalDate;
import java.util.List;

public class Bungalow extends Building implements IResident {
    private boolean centralHeating;
    private int countResidency;

    public Bungalow (LocalDate dateOfConstruction, String flooring, boolean centralHeating, int countResidency) {
        super(dateOfConstruction, flooring);
        this.centralHeating = centralHeating;
        this.countResidency = countResidency;

    }

    public boolean getCentralHeating() {
        return centralHeating;
    }

    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

    public int getCountResidency() {
        return countResidency;
    }

    public void setCountResidency(int countResidency) {
        this.countResidency = countResidency;
    }

    //Abstract method
    @Override
    public String howToClean() {
        if( this.flooring == "carpet") {
        return "use a vacuum!"; }
        else { return "can use mop or vacuum";}

    }

    public String turnOnHeating () {
            if (centralHeating = true) {
                return "It's nice and cosy in here!";
            } else {
                return "Stay cold!";
            }
        }

        // Override method
    public String payRent(){return "Payment has been received";}


    // interface
    @Override
    public String amountOfResidents(int countResidency) {
        return "Bungalow has " +countResidency+ " residents.";
    }
}
