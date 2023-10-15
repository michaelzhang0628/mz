package michael.exam.apcsa15;

public class SparseArrayEntry {
    private int row;
    private int col;
    private int value;
    
    public SparseArrayEntry(int r, int c, int v) {
        this.row = r;
        this.col = c;
        this.value = v;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getCol() {
        return col;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
