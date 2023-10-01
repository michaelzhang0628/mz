package michael.exam.apcsa19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StepTrackerTest {

    @Test
    void test() {
        StepTracker2 tr = new StepTracker2(10000);
        assertEquals(0, tr.activeDays());
        assertEquals(0.0, tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        assertEquals(0, tr.activeDays());
        assertEquals(7000.0, tr.averageSteps());
        tr.addDailySteps(13000);
        assertEquals(1, tr.activeDays());
        assertEquals(9000, tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        assertEquals(2, tr.activeDays());
        assertEquals(10222.2, tr.averageSteps());
    }
}
