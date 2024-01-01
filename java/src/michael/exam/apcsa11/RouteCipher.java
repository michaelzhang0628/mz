package michael.exam.apcsa11;

public class RouteCipher {
    private int numRows;
    private int numCols;
    private String[][] letterBlock;

    public RouteCipher(int numRows, int numCols) {
        super();
        this.numRows = numRows;
        this.numCols = numCols;
        letterBlock = new String[numRows][numCols];
    }

    public String[][] getLetterBlock() {
        return letterBlock;
    }

    void fillBlock(String str) {
        int strIndex = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (strIndex >= str.length()) {
                    letterBlock[i][j] = "A";
                } else {
                    letterBlock[i][j] = str.substring(strIndex, strIndex + 1);
                }
                strIndex++;
            }
        }
    }

    String encryptBlock() {
        String str = "";
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                str += letterBlock[j][i];
            }
        }
        return str;
    }

    public String encryptMessage(String message) {
        String cipherText = "";
        int mIndex = 0;
        while (mIndex < message.length()) {
            fillBlock(message.substring(mIndex));
            cipherText += encryptBlock();
            mIndex += numRows * numCols;
        }
        return cipherText;
    }
}
