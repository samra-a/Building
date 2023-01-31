import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StreetTest {
    Street street;
    @BeforeEach
    void setUp(){
        street = new Street();
    }

    @Test
    void canCountBuildings(){
        assertThat(street.countBuildings()).isEqualTo(0);
    }

    @Test
    void canAddBuilding(){
        Bungalow bungalow = new Bungalow(LocalDate.of(1964, 06,9), "wooden flooring", true, 3);
        street.addBuilding(bungalow);
        assertThat(street.countBuildings()).isEqualTo(1);
    }

    @Test
    void canAddMoreBuildings(){
        Bungalow bungalow2 = new Bungalow(LocalDate.of(1989, 06,8), "Vinyl", false,3);
        Office office = new Office(LocalDate.of(1989, 06,8), "Vinyl", "Bright Network");
        street.addBuilding(bungalow2);
        street.addBuilding(office);
        assertThat(street.countBuildings()).isEqualTo(2);
    }
}
