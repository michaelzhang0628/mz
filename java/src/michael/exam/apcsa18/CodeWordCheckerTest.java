package michael.exam.apcsa18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodeWordCheckerTest {

    @Test
    void test() {
        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        assertTrue(sc1.isValid("happy"));
        assertFalse(sc1.isValid("happy$"));
        assertFalse(sc1.isValid("Code"));
        assertFalse(sc1.isValid("happyCode"));
        StringChecker sc2 = new CodeWordChecker("pass");
        assertTrue(sc2.isValid("MyPass"));
        assertFalse(sc2.isValid("Mypassport"));
        assertFalse(sc2.isValid("happy"));
        assertFalse(sc2.isValid("1,000,000,000,000,000"));
    }

}
