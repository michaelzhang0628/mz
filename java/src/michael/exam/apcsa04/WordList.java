package michael.exam.apcsa04;

import java.util.ArrayList;
import java.util.Iterator;

public class WordList {
    private ArrayList<String> myList;

    public WordList(ArrayList<String> myList) {
        super();
        this.myList = myList;
    }

    public ArrayList<String> getMyList() {
        return myList;
    }

    public int numWordsOfLength(int len) {
        int numWords = 0;
        for (int i = 0; i < myList.size(); i++) {
            String word = (String) myList.get(i);
            if (word.length() == len) {
                numWords++;
            }
        }
        return numWords;
    }

    public void r(int len) {
        int i = 0;
        while (i < myList.size()) {
            String word = (String) myList.get(i);
            if (word.length() == len) {
                myList.remove(i);
            } else {
                i++;
            }
        }
    }

    public void removeWordsOfLEngth(int len) {
        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String word = it.next();
            if (word.length() == len) {
                it.remove();
            }
        }
    }

}
