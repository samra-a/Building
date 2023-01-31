import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuildingTest {
    Building building;

    @BeforeEach
    void setUp(){
        //building = new Building(LocalDate.of(1988 , 6, 4), "wooden flooring");
    }

    @Test
    public void hasFlooring(){
        assertThat(building.typeOfFlooring()).isEqualTo("This building has wooden flooring.");
    }

    @Test
    public void canPayRent(){
        assertThat(building.payRent()).isEqualTo("You're rent is due!");
    }
}
