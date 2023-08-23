package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TravelPlanTest {

    @Test
    void testCheckTourConflict() {
        TravelPlan testPlan = new TravelPlan("");

        // no conflict
        Tour t1 = new Tour(1, 4, 8, "");
        Tour t2 = new Tour(2, 4, 8, "");
        assertFalse(testPlan.checkTourConflict(t1, t2));
        t1 = new Tour(4, 4, 8, "");
        t2 = new Tour(4, 14, 18, "");
        assertFalse(testPlan.checkTourConflict(t1, t2));
        t1 = new Tour(4, 4, 8, "");
        t2 = new Tour(4, 1, 2, "");
        assertFalse(testPlan.checkTourConflict(t1, t2));

        // conflict
        t1 = new Tour(3, 4, 8, "");
        t2 = new Tour(3, 4, 8, "");
        assertTrue(testPlan.checkTourConflict(t1, t2));
        t1 = new Tour(3, 4, 8, "");
        t2 = new Tour(3, 6, 7, "");
        assertTrue(testPlan.checkTourConflict(t1, t2));
        t1 = new Tour(3, 4, 8, "");
        t2 = new Tour(3, 2, 18, "");
        assertTrue(testPlan.checkTourConflict(t1, t2));
        t1 = new Tour(3, 4, 8, "");
        t2 = new Tour(3, 2, 4, "");
        assertTrue(testPlan.checkTourConflict(t1, t2));
        t1 = new Tour(3, 4, 8, "");
        t2 = new Tour(3, 8, 18, "");
        assertTrue(testPlan.checkTourConflict(t1, t2));
    }

    @Test
    void testRealWorld() {
        TravelPlan lvTrip = new TravelPlan("Las Vegas");
        if (lvTrip.addTour(new Tour(1, 6, 18, "Casino"))) {
            System.out.println("added casino");
        } else {
            System.out.println("Can not add casino");
        }
        if (lvTrip.addTour(new Tour(2, 18, 20, "Dinner"))) {
            System.out.println("added dinner");
        } else {
            System.out.println("Can not add dinner");
        }
        if (lvTrip.addTour(new Tour(2, 19, 20, "Dance"))) {
            System.out.println("added Dance");
        } else {
            System.out.println("Can not add Dance");
        }
        System.out.println(lvTrip.getTours());
    }

}
