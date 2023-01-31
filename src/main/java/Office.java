import java.time.LocalDate;

public class Office extends Building {
    private String companyName;
    private int numberOfStaff;

    public Office(LocalDate dateOfConstruction, String flooring, String companyName){
        super(dateOfConstruction, flooring);
        this.companyName = companyName;
        this.numberOfStaff = numberOfStaff;
    }

    @Override
    public String howToClean() {
        return "make sure to clean your workspace after yourself!";
    }

    public String workingHours(){
        return "We are open 5 days a week from 9AM to 5PM";
    }


//    public String payRent(){
//        return "Amount of rent varies with number of rooms";
//    }


}
