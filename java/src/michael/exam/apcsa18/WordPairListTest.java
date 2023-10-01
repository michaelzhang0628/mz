package michael.exam.apcsa18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordPairListTest {

    @Test
    void test() {
        String[] wordNums = {"one", "two", "three"};
        WordPairList e1 = new WordPairList(wordNums);
        assertEquals(3, e1.getAllPairs().size());
        String[] phase = {"the", "more", "the", "merrier"};
        WordPairList e2 = new WordPairList(phase);
        assertEquals(6, e2.getAllPairs().size());
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList e3 = new WordPairList(moreWords);
        assertEquals(2, e3.numMatches());
    }
}
