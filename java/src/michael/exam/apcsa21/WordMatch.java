package michael.exam.apcsa21;

public class WordMatch {
    private String secret;
    
    public WordMatch(String word) {
        this.secret = word;
    }
    
    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }
        return (int) (count * Math.pow(guess.length(), 2));
    }
    
    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess(guess1) >= scoreGuess(guess2)) {
            return guess1;
        } 
        return guess2;
    }   
}
