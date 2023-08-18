package michael.freeresponse;

public class Pixel {
    private int row;
    private int col;

    public Pixel(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    
    @Override
    public String toString() {
        return "pixel at " + this.row + ", " + this.col;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Pixel)) {
            return false;
        }
        
        Pixel another = (Pixel)o;
        if (this.col == another.col && this.row == another.row) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.row + this.col;
        return hash;
    }

}
