package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndividualStudyModuleTest {

    @Test
    void testAssessProgress() {
        IndividualStudyModule m = new IndividualStudyModule(80, "z");
        assertEquals(IndividualStudyModule.LESS_GOOD, m.assessProgress());
        m = new IndividualStudyModule(20, "z");
        assertEquals(IndividualStudyModule.BAD, m.assessProgress());
        m = new IndividualStudyModule(50, "z");
        assertEquals(IndividualStudyModule.LESS_BAD, m.assessProgress());
        m = new IndividualStudyModule(100, "z");
        assertEquals(IndividualStudyModule.GOOD, m.assessProgress());
    }
}
