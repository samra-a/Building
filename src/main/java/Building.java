import java.time.LocalDate;

//
public abstract class Building {
   private int numberOfRooms;
   protected LocalDate dateOfConstruction;
   protected String flooring;


    public Building (LocalDate dateOfConstruction, String flooring){
        this.dateOfConstruction = dateOfConstruction;
        this.flooring = flooring;
    }

    public String typeOfFlooring(){
        return "This building has " +this.flooring+ ".";
    }

    // Abstract method
    public abstract String howToClean();


}

