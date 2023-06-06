package ke.co.safaricom.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroTest {

    Hero testHero = new Hero("Hero Name", 62,"Some Power",9, "Some Weakness", 2, "Gospel");

    @Test
    @DisplayName(value = "HEROES NAME")
    void getHero() {
        assertEquals("Hero Name", testHero.getHero());
    }

    @Test
    @DisplayName(value = "AGE TEST")
    void getAge() {
        assertEquals(62, testHero.getAge());
    }

    @Test
    @DisplayName(value = "POWER TYPE TEST")
    void getPower() {
        assertEquals("Some Power", testHero.getPower());
    }

    @Test
    @DisplayName(value = "POWER SCORE TEST")
    void getPower_score() {
        assertEquals(9,testHero.getPower_score());
    }

    @Test
    @DisplayName(value = "WEAKNESS TEST")
    void getWeakness() {
        assertEquals("Some Weakness", testHero.getWeakness());
    }

    @Test
    @DisplayName(value = "WEAKNESS SCORE TEST")
    void getWeakness_score() {
        assertEquals(2,testHero.getWeakness_score());
    }

    @Test
    @DisplayName(value = "SQUAD ASSIGNMENT TEST")
    void getSquad() {
        assertEquals("Gospel",testHero.getSquad());
    }
}
