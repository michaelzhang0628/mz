package michael.exam.apcsa19;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DelimitersTest {

    @Test
    void testGetDelimitersList() {
        Delimiters p = new Delimiters("(", ")");
        String[] example1 = {"(", "x + y", ")", " * 5"};
        ArrayList<String> l1 = p.getDelimitersList(example1);
        assertEquals(l1.size(), 2);
        assertEquals(l1.get(0), "(");
        assertEquals(l1.get(1), ")");
        p = new Delimiters("<q>", "</q>");
        String[] example2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> l2 = p.getDelimitersList(example2);
        assertEquals(l2.size(), 3);
        assertEquals(l2.get(0), "<q>");
        assertEquals(l2.get(1), "</q>");
        assertEquals(l2.get(2), "</q>");
    }
    
    void testIsBalanced() {
        Delimiters p = new Delimiters("<sup>", "</sup>");
        String[] example1 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        assertTrue(p.isBalanced(p.getDelimitersList(example1)));
        String[] example2 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        assertFalse(p.isBalanced(p.getDelimitersList(example2)));
        String[] example3 = {"</sup>"};
        assertFalse(p.isBalanced(p.getDelimitersList(example3)));
        String[] example4 = {"<sup>", "<sup>", "</sup>"};
        assertFalse(p.isBalanced(p.getDelimitersList(example4)));
    }
}
