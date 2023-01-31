import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    Bungalow bungalow;

    @BeforeEach
    void setUp(){
        bungalow = new Bungalow(LocalDate.of(1988 , 6, 4), "carpet", true, 3);
    }

    @Test
    void isTheHeatingTurnedOn(){
        assertThat(bungalow.turnOnHeating()).isEqualTo("It's nice and cosy in here!");
    }

    @Test
    void canPayRent(){
        assertThat(bungalow.payRent()).isEqualTo("Payment has been received");
    }

    @Test
    void canCountResidents() {
        int countResidency = 3;
        assertThat(bungalow.amountOfResidents(countResidency)).isEqualTo("Bungalow has 3 residents.");
    }
}
