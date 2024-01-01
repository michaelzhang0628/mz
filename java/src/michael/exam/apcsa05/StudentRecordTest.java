package michael.exam.apcsa05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentRecordTest {
    
    StudentRecord getStudentRecord() {
        int[] scores = new int[] {1, 2, 18, 30, 40, 55, 70, 88, 92, 95, 98, 100};
        StudentRecord sr = new StudentRecord(scores);
        return sr;
    }
    
    @Test
    void testAverage() {
        StudentRecord sr = getStudentRecord();
        assertEquals(7, sr.average(1, 18));
        assertEquals(35, sr.average(30, 40));
        assertEquals(80, sr.average(55, 95));
    }
    
    @Test
    void testHasImproved() {
        StudentRecord sr = getStudentRecord();
        assertTrue(sr.hasImproved());
        int[] scores = new int[] {1, 2, 18, 30, 58, 55, 70, 88, 92, 95, 98, 100};
        StudentRecord sr2 = new StudentRecord(scores);
        assertFalse(sr2.hasImproved());
    }

    @Test
    void testFinalAverage() {
        StudentRecord sr = getStudentRecord();
        assertEquals(90.5, sr.finalAverage());
        int[] scores = new int[] {1, 2, 18, 30, 58, 55, 70, 88, 92, 95, 98, 100};
        StudentRecord sr2 = new StudentRecord(scores);
        assertEquals(707.0/12, sr2.finalAverage());
    }
}
