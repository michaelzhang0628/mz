package michael.exam.apcsa00;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WordCollection {
    private List<String> words;

    public WordCollection(List<String> words) {
        super();
        this.words = words;
    }
    
    public List<String> getWords() {
        return words;
    }

    public int size() {
        return words.size();
    }
    
    public void insert(String word) {
        words.add(word);
    }
    
    public void remove(String word) {
        if (words.contains(word)) {
            words.remove(word);
        }
    }
    
    public String findKth(int k) {
        String placeHolder = "";
        for (int i = 1; i < words.size(); i++) {
            String w1 = words.get(i - 1);
            String w2 = words.get(i);
            if (w1.compareTo(w2) > 0) {
                placeHolder = words.get(i - 1);
                w1 = words.get(i);
                w2 = placeHolder;
            }
        }
        return words.get(k);
    }
    
    public int occurrences(String word) {
        int occurrences = 0;
        for (int  i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)) {
                occurrences++;
            }
        }
        return occurrences;
    }
    
    public void removeDuplicates(String word) {
        int count = 0;
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
          String i = it.next();
          if (i.equals(word)) {
            if (count == 0) {
                count++;
            } else {
                it.remove();
            }
          }
        }
    }
    
    public String mostCommon() {
        Map<String, Integer> map = new HashMap<String, Integer> ();
        for (String word : words) {
            Integer occurence = map.get(word);
            if (occurence == null) {
                map.put(word, 1);
            } else {
                map.put(word, occurence + 1);
            }
        }
        String mostCommon = null;
        int max = 0;
        for (String word: map.keySet()) {
            int count = map.get(word);
            if (count>max) {
                max = count;
                mostCommon = word;
            }
        }
        return mostCommon;
    }
}
