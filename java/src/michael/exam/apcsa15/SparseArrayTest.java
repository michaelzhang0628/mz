package michael.exam.apcsa15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SparseArrayTest {

    @Test
    void test() {
        SparseArray sa = new SparseArray(6, 5);  
        sa.setValueAt(1, 4, 4);
        sa.setValueAt(2, 0, 1);
        sa.setValueAt(3, 1, -9);
        sa.setValueAt(1, 1, 5);
        sa.setValueAt(7, 6, 2);
        assertEquals(5, sa.getNumCols());
        assertEquals(0, sa.getValueAt(7, 6));
        assertEquals(-9, sa.getValueAt(3, 1));
        // TODO assert 1,1 and 1,4
        assertEquals(1, sa.getValueAt(2, 0));
        assertEquals(0, sa.getValueAt(3, 3));
        assertEquals(0, sa.getValueAt(5, 3));
        sa.removeColumn(1);
        assertEquals(4, sa.getNumCols());
        // TODO assert 1,1 and 1,4
        assertEquals(4, sa.getValueAt(1, 3));
        assertEquals(1, sa.getValueAt(2, 0));
        assertEquals(0, sa.getValueAt(1, 1));
        assertEquals(0, sa.getValueAt(3, 1));
    }

}
