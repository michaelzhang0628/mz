package michael.exam.apcsa99;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import michael.exam.apcsa00.WordCollection;

class StudentsTest {

    public Students getTestData() {
        List<StudentInfo> l = new ArrayList<StudentInfo> ();
        l.add(new StudentInfo("Claire", 110, 220.0));
        l.add(new StudentInfo("Max", 180, 720.0));
        l.add(new StudentInfo("Jake", 160, 560.0));
        l.add(new StudentInfo("Zach", 120, 300.0));    
        l.add(new StudentInfo("Josh", 0, 400.0));        
        l.add(new StudentInfo("Gabe", 180, 270.0));   
        l.add(new StudentInfo("David", 120, 480.0));
        return new Students(l);
    }
    
    @Test
    void testComputeGPA() {
        Students s = getTestData();
        s.computeGPA(3);
        assertEquals(2.0, s.getRoster().get(0).getGPA());
        assertEquals(4.0, s.getRoster().get(1).getGPA());
        assertEquals(3.5, s.getRoster().get(2).getGPA());
        assertEquals(0.0, s.getRoster().get(4).getGPA());
        s.computeGPA(7);
        assertEquals(2.0, s.getRoster().get(0).getGPA());
        assertEquals(4.0, s.getRoster().get(1).getGPA());
        assertEquals(3.5, s.getRoster().get(2).getGPA());
        assertEquals(2.5, s.getRoster().get(3).getGPA());
        assertEquals(0.0, s.getRoster().get(4).getGPA());
        assertEquals(1.5, s.getRoster().get(5).getGPA());
        assertEquals(4.0, s.getRoster().get(6).getGPA());
    }
    
    @Test
    void testIsSenior() {
        Students s = getTestData();
        s.computeGPA(7);
        assertFalse(s.isSenior(s.getRoster().get(0)));
        assertTrue(s.isSenior(s.getRoster().get(1)));
        assertTrue(s.isSenior(s.getRoster().get(2)));
        assertFalse(s.isSenior(s.getRoster().get(3)));
        assertFalse(s.isSenior(s.getRoster().get(4)));
        assertFalse(s.isSenior(s.getRoster().get(5)));
        assertFalse(s.isSenior(s.getRoster().get(6)));
    }
    
    @Test
    void testFillSeniorList() {
        Students s = getTestData();
        s.computeGPA(7);
        List<StudentInfo> seniors = new ArrayList<StudentInfo> ();
        s.fillSeniorList(3, seniors);
        assertEquals(new StudentInfo("Max", 180, 720.0), seniors.get(0));
        assertEquals(new StudentInfo("Jake", 160, 560.0), seniors.get(1));
        assertEquals(2, seniors.size());
    }

}
