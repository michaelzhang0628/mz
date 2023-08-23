package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeatingChartTest {

    @Test
    void testConstructor() {
        Name[] names = { new Name("Zhang", "Michael"), new Name("Zhang", "G"), new Name("Zhang", "C"),
                new Name("Zhang", "Keke") };
        SeatingChart s = new SeatingChart(names, 4, 3);
        assertEquals(4, s.getRows());
        assertEquals(3, s.getCols());
        String[][] seats = s.getChart();
        boolean foundMZ = false;
        boolean foundCZ = false;
        int taken = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j].equals("")) {
                    taken++;
                    if (seats[i][j].equals("Zhang, Michael")) {
                        foundMZ = true;
                    }
                    if (seats[i][j].equals("Zhang, C")) {
                        foundCZ = true;
                    }
                }
            }
        }
        assertEquals(4, taken);
        assertTrue(foundMZ);
        assertTrue(foundCZ);
        System.out.println(s.toString());
    }

}
