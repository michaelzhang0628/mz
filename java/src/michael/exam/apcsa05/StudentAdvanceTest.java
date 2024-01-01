package michael.exam.apcsa05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentAdvanceTest {

    @Test
    void testStudentAdvance() {
        StudentAdvance sa = new StudentAdvance(10);
        assertEquals(15, sa.getPrice());
        System.out.print(sa.toString());
        
        
    }

}
