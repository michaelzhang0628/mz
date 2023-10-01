package michael.exam.apcsa17;

import java.util.Objects;

public class Position {
    private int row;
    private int col;
    
    public Position(int r, int c) {
        this.row = r;
        this.col = c;
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
        if (!(obj instanceof Position))
            return false;
        Position other = (Position) obj;
        return col == other.col && row == other.row;
    }
}
