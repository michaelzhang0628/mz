package michael.exam.apcsa01;

public class Rectangle {
    private int ULrow;
    private int ULcol;
    private int numRows;
    private int numCols;
    
    public Rectangle(int uLrow, int uLcol, int numRows, int numCols) {
        super();
        ULrow = uLrow;
        ULcol = uLcol;
        this.numRows = numRows;
        this.numCols = numCols;
    }
    
    public int getULrow() {
        return ULrow;
    }
    public int getULcol() {
        return ULcol;
    }
    public int getNumRows() {
        return numRows;
    }
    public int getNumCols() {
        return numCols;
    }
    
    
}
