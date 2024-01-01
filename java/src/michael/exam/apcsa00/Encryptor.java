package michael.exam.apcsa00;

public class Encryptor {
    private char[][] myMat;

    public Encryptor(char[][] myMat) {
        super();
        this.myMat = myMat;
    }
    
    public String encryptTwo(String pair) {
        char firstChar = pair.charAt(0);
        int firstRow = 0;
        int firstCol = 0;
        char secondChar = pair.charAt(1);
        int secondRow = 0;
        int secondCol = 0;
        for (int i = 0; i < myMat.length; i++) {
            for (int j = 0; j < myMat[0].length; j++) {
                if (myMat[i][j] == firstChar) {
                    firstRow = i;
                    firstCol = j;
                } else if (myMat[i][j] == secondChar) {
                    secondRow = i;
                    secondCol = j;
                }
            }
        }
        if (firstRow == secondRow || firstCol == secondCol) {
            return new StringBuilder().append(secondChar).append(firstChar).toString();
        }
        firstChar = myMat[firstRow][secondCol];
        secondChar = myMat[secondRow][firstCol];
        return new StringBuilder().append(firstChar).append(secondChar).toString();
    }
    
    public Point getCoordinates(char c) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < myMat.length; i++) {
            for (int j = 0; j < myMat[0].length; j++) {
                if (myMat[i][j] == c) {
                    row = i;
                    col = j;
                }
            }
        }
        return new Point(row, col);
    }
    
    public String encryptWord(String word) {
        String result = "";
        String lastChar = "";
        if (word.length() % 2 == 1) {
            lastChar = word.substring(word.length() - 1);
            word = word.substring(0, word.length() - 1);
        }
        for (int i = 1; i < word.length(); i += 2) {
            result += encryptTwo(word.substring(i - 1, i + 1));
        }
        return result + lastChar;
    }
    
    
}
