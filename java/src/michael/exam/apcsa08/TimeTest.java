package michael.exam.apcsa08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void testConstructor() {
        assertEquals(90, new Time("1:30 AM").getTime());
        assertEquals(810, new Time("1:30 PM").getTime());
        assertEquals(660, new Time("11:00 am").getTime());
        assertEquals(0, new Time("00:00 am").getTime());
        assertEquals(0, new Time("12:00 am").getTime());
        assertEquals(1, new Time("12:01 am").getTime());
        assertEquals(720, new Time("12:00 Pm").getTime());
        assertEquals(721, new Time("12:01 Pm").getTime());
    }

}
