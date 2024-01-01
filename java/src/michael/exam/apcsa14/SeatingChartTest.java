package michael.exam.apcsa14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SeatingChartTest {

    @Test
    void test() {
        List<Student> roster = new ArrayList<Student> ();
        roster.add(new Student("Karen", 3));
        roster.add(new Student("Liz", 1));
        roster.add(new Student("Paul", 4));
        roster.add(new Student("Lester", 1));
        roster.add(new Student("Henry", 5));
        roster.add(new Student("Renee", 9));
        roster.add(new Student("Glen", 2));
        roster.add(new Student("Fran", 6));
        roster.add(new Student("David", 1));
        roster.add(new Student("Danny", 3));
        SeatingChart sc = new SeatingChart(roster, 3, 4);
        assertEquals(new Student("Karen", 3), sc.getStudent(0, 0));
        assertEquals(new Student("Lester", 1), sc.getStudent(0, 1));
        assertEquals(new Student("David", 3), sc.getStudent(2, 2));
        assertNull(sc.getStudent(1, 3));
        assertNull(sc.getStudent(2, 3));
        assertEquals(3, sc.removeAbsentStudents(4));
        assertNull(sc.getStudent(1, 1));
        assertNull(sc.getStudent(2, 1));
        assertNull(sc.getStudent(1, 2));

    }

}
