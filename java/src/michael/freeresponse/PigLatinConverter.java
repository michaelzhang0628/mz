package michael.freeresponse;

import java.util.ArrayList;
import java.util.Arrays;

public class PigLatinConverter {
    private String line;

    public PigLatinConverter(String str) {
        line = str;
    }

    // ch is a single-character string
    // Returns true if ch is vowel, false otherwise
    private static boolean isVowel(String ch) {
        if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u") || ch.equals("A")
                || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")) {
            return true;
        } else {
            return false;
        }
    }

    // Return pig Latin form of word
    // word is not null
    // may be begin with vowel or constant
    public static String toPig(String word) {
        if (isVowel(word.substring(0, 1)) == true) {
            return word + "yay";
        } else {
            return word.substring(1) + word.substring(0, 1) + "ay";
        }
    }
    // Returns a list of words in line
    // line contains at least one word
    // words are separated by one space
    // No punctuation

    ArrayList<String> getLineWords() {
        ArrayList<String> list = new ArrayList<String>();
        String[] a = line.split(" ");
        for (int i = 0; i < a.length; i++) {
            list.add(new String(a[i]));
        }
        return list;
    }

    // Converts line to pig Latin
    // line contains at least one word
    // words are separated by one space
    // No punctuation
    public void pigLatin() {
        ArrayList<String> words = getLineWords();
        /*
         * using strp to remove space line = ""; for (String word : words) { line +=
         * toPig(word) + " "; } line = line.strip();
         */
        line = toPig(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            line += " " + toPig(words.get(i));
        }
    }

    public String getLine() {
        return line;
    }
}
