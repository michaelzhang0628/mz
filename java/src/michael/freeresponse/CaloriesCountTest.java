package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaloriesCountTest {

    @Test
    void testAssignment() {
        CalorieCount sunday = new CalorieCount(1500);
        sunday.addMeal(716, 38, 38, 45);
        sunday.addMeal(230, 16, 8, 16);
        sunday.addMeal(568, 38, 50, 24);
        assertFalse(sunday.onTrack());
        assertEquals(0.24, sunday.getProteinPercentage());
    }

}
