package ke.co.safaricom.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquadTest {

    Squad testSquad = new Squad("Masters", "Organisation", 8);

    @Test
    @DisplayName(value = "SQUAD NAME")
    void getSquad() {
        assertEquals("Masters", testSquad.getSquad());
    }

    @Test
    @DisplayName(value = "SQUAD CAUSE")
    void getCause() {
        assertEquals("Organisation", testSquad.getCause());
    }

    @Test
    @DisplayName(value = "SQUAD SIZE")
    void getSize() {
        assertEquals(8, testSquad.getSize());
    }

}
