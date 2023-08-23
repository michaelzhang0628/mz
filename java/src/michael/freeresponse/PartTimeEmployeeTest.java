package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartTimeEmployeeTest {

    @Test
    void testUnionStatus() {
        // less than 15k
        PartTimeEmployee mz = new PartTimeEmployee("Michael", "Mt. Laurel", true, 10000, 0.5, false);
        mz.changeUnionStatus();
        assertFalse(mz.isUnionMember());
        mz = new PartTimeEmployee("Michael", "Mt. Laurel", true, 10000, 0.5, true);
        mz.changeUnionStatus();
        assertTrue(mz.isUnionMember());

        // more than 15k
        mz = new PartTimeEmployee("Michael", "Mt. Laurel", true, 20000, 0.5, true);
        mz.changeUnionStatus();
        assertFalse(mz.isUnionMember());
        mz = new PartTimeEmployee("Michael", "Mt. Laurel", true, 20000, 0.5, false);
        mz.changeUnionStatus();
        assertTrue(mz.isUnionMember());
    }

    @Test
    void testSalary() {
        Employee gz = new Employee("Dad", "nowhere", true, 10000);
        assertEquals(10000, gz.getSalary());
        assertEquals(10000, gz.getActualPay());

        PartTimeEmployee mz = new PartTimeEmployee("Michael", "Mt. Laurel", true, 10000, 0.5, false);
        assertEquals(10000, mz.getSalary());
        assertEquals(5000, mz.getActualPay());
    }
}
