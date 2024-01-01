package michael.exam.apcsa00;

import java.util.Objects;

public class Point {
    private int row;
    private int col;
    
    Point() {
        
    }
    
    Point(int row, int col) {
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
    public int hashCode() {
        return Objects.hash(col, row);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Point))
            return false;
        Point other = (Point) obj;
        return col == other.col && row == other.row;
    }
    
}
