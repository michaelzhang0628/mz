package michael.freeresponse;

import java.util.LinkedList;

public class Screen {
    private LinkedList<Pixel>[] data;
    private int numRows;
    private int numCols;

// postcondition: data is created with
// height elements;
// numCols is set to
// width
    public Screen(int height, int width) {
        this.numRows = height;
        this.numCols = width;
        data = (LinkedList<Pixel>[]) new LinkedList[numRows];
        for (int i = 0; i < numRows; i++) {
            data[i] = new LinkedList<Pixel>();
        }
    }

    // precondition: 0 <= row <=
    // data.length - 1;
    // 0 <= col <= numCols - 1
    // postcondition: returns the pixel at
    // the given row and col
    // if it exists (black)
    // or null if the pixel
    // doesn't exist (white)
    public Pixel pixelAt(int row, int col) {
        if (col < numCols) {
            if (col <= this.numCols - 1 && row <= this.numRows - 1) {
                for (int i = 0; i < data[row].size(); i++) {
                    Pixel pixel = data[row].get(i);
                    if (pixel.getCol() == col) {
                        return pixel;
                    }
                }
            }
        }
        return null;
    }

    // precondition: 0 <= row <=
    // data.length - 1;
    // 0 <= col <= numCols - 1;
    // the pixel at row, col
    // does not exist
    // in this Screen
    // postcondition: adds the pixel at
    // the given row and col
    // so that pixels in a
    // given row of data are
    // in increasing column
    // order
    public void pixelOn(int row, int col) {
        if (col < numCols) {
            boolean isBlack = false;
            for (int i = 0; i < data[row].size(); i++) {
                Pixel currentBlack = data[row].get(i);
                if (currentBlack.getCol() == col) {
                    isBlack = true;
                }
            }
            if (!isBlack) {
                data[row].add(new Pixel(row, col));
            }
        }
    }
}
