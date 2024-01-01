package michael.exam.apcsa15;

public class HiddenWord {
    private String word;
    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String hint = "";
        for (int i = 0; i < guess.length(); i++) {
            if (i < word.length() && guess.charAt(i) == word.charAt(i)) {
                hint += word.charAt(i);
            } else if (word.indexOf(guess.charAt(i)) != -1) {
                hint += "+";
            } else {
                hint += "*";      
            }
        }
        return hint;
    }
}
