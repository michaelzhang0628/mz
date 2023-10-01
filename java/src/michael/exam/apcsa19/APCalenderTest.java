package michael.exam.apcsa19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class APCalenderTest {

    @Test
    void testNumberOfLeapYears() {
        assertEquals(2, APCalender.numberOfLeapYears(2001, 2009));
        assertEquals(2, APCalender.numberOfLeapYears(1995, 2004)); 
        assertEquals(1, APCalender.numberOfLeapYears(1895, 1904)); 
        assertEquals(3, APCalender.numberOfLeapYears(1799, 1816));
    }

    @Test
    void testDayOfWeek() {
        assertEquals(1, APCalender.dayOfWeek(9, 4, 2023));      
        assertEquals(4, APCalender.dayOfWeek(2, 2, 2023));      
    }
}
