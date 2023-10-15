package michael.exam.apcsa15;

public class HiddenWord {
    private String word;
    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        // TODO what if guess have different number of characters
        // TODO replace substring with charAt for efficiency
        String hint = "";
        for (int i = 0; i < word.length(); i++) {
            String guessLetter = guess.substring(i, i + 1);
            if (word.substring(i, i + 1).equals(guessLetter)) {
                hint += guessLetter;
            } else if (word.indexOf(guessLetter) != -1) {
                hint += "+";
            } else
                hint += "*";
        }
        return hint;
    }
}
