package michael.exam.apcsa16;

import java.util.List;

public class StringFormatter {
    public static int totalLetters(List<String> wordList) {
        int letters = 0;
        for (int i = 0; i < wordList.size(); i++) {
            letters += wordList.get(i).length();
        }
        return letters;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        int gaps = wordList.size() - 1;
        int spaces = formattedLen - totalLetters(wordList);
        return (spaces / gaps);
    }

    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        int gaps = wordList.size() - 1;
        int spaces = formattedLen - totalLetters(wordList);
        return (spaces % gaps);
    }

    public static String format(List<String> wordList, int formattedLen) {
        int width = basicGapWidth(wordList, formattedLen);
        int leftoverRemaining = leftoverSpaces(wordList, formattedLen);
        String formatted = "";
        for (int i = 0; i < wordList.size() - 1; i++) {
            formatted += wordList.get(i);
            for (int s = 1; s <= width; s++) {
                formatted += " ";
            }
            if (leftoverRemaining > 0) {
                formatted += " ";
                leftoverRemaining--;
            }
        }
        formatted += wordList.get(wordList.size() - 1);
        return formatted;
    }
}
