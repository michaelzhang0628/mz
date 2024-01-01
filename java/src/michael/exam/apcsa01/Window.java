package michael.exam.apcsa01;

public class Window {
    private int[][] myMat;
    
    public Window(int[][] myMat) {
        super();
        this.myMat = myMat;
    }

    public int[][] getMyMat() {
        return myMat;
    }

    public boolean isInBounds(int row, int col) {
        if (row >= 0 && row < myMat.length && col >= 0 && col < myMat[0].length) {
            return true;
        }
        return false;
    }
    
    public void colorSquare(int ULrow, int ULcol, int N, int val) {
        for (int row = 0; row < myMat.length; row++) {
            for (int col = 0; col < myMat[0].length; col++) {
                if ((row >= ULrow && (row < (ULrow + N) || row == myMat.length)) && (col >= ULcol && (col < (ULcol + N) || col == myMat[0].length))) {
                    myMat[row][col] = val;
                }
            }
        }
    }
    
    public int valAt(int row, int col) {
        return myMat[row][col];
    }
    
    private int[][] copyMat(int[][] source) {
        int[][] destination = new int[source.length][];
        for (int i = 0; i < source.length; ++i) {
             destination[i] = new int[source[i].length];
             System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }

        return destination;
    }
    
    public int[][] extractRectangle(Rectangle rect) {
        int[][] r = new int[rect.getNumRows()][rect.getNumCols()];
        for (int row = rect.getULrow(); row < rect.getULrow() + rect.getNumRows(); row++) {
            for (int col = rect.getULcol(); col < rect.getULcol() + rect.getNumCols(); col++) {
                r[row - rect.getULrow()][col - rect.getULcol()] = myMat[row][col];
            }
        }
        return r;
    }
    
    public void enlarge(Rectangle rect, int factor) {
        int[][] r = extractRectangle(rect);
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                colorSquare(rect.getULrow() + factor * i, rect.getULcol() + factor * j, factor, r[i][j]);
            }
        }
    }
}




