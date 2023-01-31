import java.time.LocalDate;

//
public abstract class Building {
   private int numberOfRooms;
   //protected
   protected LocalDate dateOfConstruction;
   //protected
   protected String flooring;

   int rent;
   String clean;

    public Building (LocalDate dateOfConstruction, String flooring){
        this.dateOfConstruction = dateOfConstruction;
        this.flooring = flooring;
    }

    public String typeOfFlooring(){
        return "This building has " +this.flooring+ ".";
    }


    //Override method
    public String payRent(){
            return "You're rent is due!";
        } //improve this

    // Abstract method
    public abstract String howToClean();


}

