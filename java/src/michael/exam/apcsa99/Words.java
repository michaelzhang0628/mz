package michael.exam.apcsa99;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Words {
    private List<String> wordList;

    public Words(List<String> wordList) {
        super();
        this.wordList = wordList;
    }

    public List<String> getWordList() {
        return wordList;
    }

    public int wordIndex(String word) {
        for (int i = 0; i < wordList.size(); i++) {
            if (word.compareTo(wordList.get(i)) <= 0) {
                return i;
            }
        }
        return wordList.size();
    }

    public void insertInOrder(String word) {
        for (int i = 0; i < wordList.size(); i++) {
            if (word.equals(wordList.get(i))) {
                return;
            }
            if (word.compareTo(wordList.get(i)) < 0) {
                wordList.add(i, word);
                return;
            }
        }
        wordList.add(word);
    }

}
