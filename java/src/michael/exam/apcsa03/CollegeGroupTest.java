package michael.exam.apcsa03;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CollegeGroupTest {

    @Test
    void test() {
        List<College> collegeList = new ArrayList<College> ();
        collegeList.add(new College("Colgate", "Northeast", 27025));
        collegeList.add(new College("Duke", "Southeast", 26000));
        collegeList.add(new College("Kalamazoo", "Midwest", 19764));
        collegeList.add(new College("Stanford", "West", 25917));
        collegeList.add(new College("Florida", "Southeast", 10800));
        collegeList.add(new College("Dartmouth", "Northeast", 27764));
        collegeList.add(new College("Spelman", "Southeast", 11455));
        CollegeGroup cg = new CollegeGroup(collegeList);
        cg.updateTuition("Colgate", 27500);
        assertEquals(27500, collegeList.get(0).getTuition());
        assertEquals(2, cg.getCollegeList("Southeast", 10000, 20000).size());
        assertEquals(new College("Florida", "Southeast", 10800), cg.getCollegeList("Southeast", 10000, 20000).get(0));
        assertEquals(new College("Spelman", "Southeast", 11455), cg.getCollegeList("Southeast", 10000, 20000).get(1));
    }

}
