package michael.exam.apcsa04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class WordListTest {

    @Test
    void testNumWordsOfLength() {
        ArrayList<String> myList = new ArrayList<> ();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
        WordList animals = new WordList(myList);
        assertEquals(1, animals.numWordsOfLength(4));
        assertEquals(3, animals.numWordsOfLength(3));
        assertEquals(0, animals.numWordsOfLength(2));
    }
    
    @Test
    void testRemoveWorsOfLength1() {
        ArrayList<String> myList = new ArrayList<String> ();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
        WordList animals = new WordList(myList);
        animals.removeWordsOfLEngth(4);
        assertEquals(4, animals.getMyList().size());
        animals.removeWordsOfLEngth(3);
        assertEquals(1, animals.getMyList().size());
        animals.removeWordsOfLEngth(2);
        assertEquals(1, animals.getMyList().size());
    }
    
}
