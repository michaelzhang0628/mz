package michael.exam.apcsa18;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int matches = 0;
        for (WordPair wordPair : allPairs) {
            if (wordPair.getFirst().equals(wordPair.getSecond())) {
                matches++;
            }
        }
        return matches;
    }
}
