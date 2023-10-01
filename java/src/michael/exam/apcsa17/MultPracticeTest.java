package michael.exam.apcsa17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultPracticeTest {

    @Test
    void test() {
        StudyPractice p1 = new MultPractice(7, 3);
        assertEquals("7 TIMES 3", p1.getProblem());
        p1.nextProblem();
        assertEquals("7 TIMES 4", p1.getProblem());
        p1.nextProblem();
        assertEquals("7 TIMES 5", p1.getProblem());
        p1.nextProblem();
        assertEquals("7 TIMES 6", p1.getProblem());
        
        StudyPractice p2 = new MultPractice(4, 12);
        p2.nextProblem();
        assertEquals("4 TIMES 13", p2.getProblem());
        assertEquals("4 TIMES 13", p2.getProblem());
        p2.nextProblem();
        p2.nextProblem();
        assertEquals("4 TIMES 15", p2.getProblem());
        p2.nextProblem();
        assertEquals("4 TIMES 16", p2.getProblem());
    }

}
