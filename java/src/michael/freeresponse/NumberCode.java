package michael.freeresponse;

public class NumberCode {
    // 2 dimensional square array of single-digit integers created in the instructor
    private int[][] numMatrix;
    
    // number of rows and columns, set by the constructor private int size
    private int size;
    
    public NumberCode(int size) {
        this.size = size;
        this.numMatrix = new int[size][size];
    }
    
    // converts a digit in string form to its integer value
    // ch is a numerical digit in string form
    static int toDigit(String ch) {
        try{
            return Integer.parseInt(ch);
        }
        catch (NumberFormatException ex){
            return -1;
        }   
    }
    
    // place a number string into numMatrix row-major order
    // numMatrix is a square matrix
    // str contains at least one character
    // all characters in str are numerical digits
    // if str.length() < size * size, 0is placed in each unfilled cell
    // if str.length() > size * size, trailing characters are ignored
    private void fillArray(String str) {
        int x = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (x < str.length()) {
                    String oneChar = str.substring(x, x + 1);
                    numMatrix[i][j] = toDigit(oneChar);
                }
                else {
                    numMatrix[i][j] = 0;
                }
                x++;
            }
        }
    }
    
    // constructs and returns a code number from its string parameter
    // digitStr contains at least one character
    // all characters in digitStr are numerical digits
    public int getNumberCode(String digitStr) {
        fillArray(digitStr);
        int code = 0;
        for (int i = 0; i < size; i++) {
            code = code * 10 + numMatrix[i][i];
        }
        return code;
    }
}