package michael.exam.apcsa14;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Scrambler {
    public static String scrambleWord(String word) {
        String scrambledWord = word;
        int i = 1;
        while (i < scrambledWord.length()) {
            if ("A".equals(scrambledWord.substring(i - 1, i)) && !("A".equals(scrambledWord.substring(i, i + 1)))) {
                scrambledWord = scrambledWord.substring(0, i - 1) + scrambledWord.substring(i, i + 1) + "A" + scrambledWord.substring(i + 1);
                i += 2;
            } else {
                i++;
            }
        }   
        return scrambledWord;
    }
    
    public static void scrambleOrRemove(List<String> wordList) {
        ListIterator<String> it = wordList.listIterator();
        while (it.hasNext()) {
            String scrambled = it.next();
            if (scrambled.equals(scrambleWord(scrambled))) {
                it.remove();
            } else {
                it.set(scrambleWord(scrambled));
            }
        }
    }
}
