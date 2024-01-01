package michael.exam.apcsa12;

public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public GrayImage(int[][] pixelValues) {
        super();
        this.pixelValues = pixelValues;
    }

    public int[][] getPixelValues() {
        return pixelValues;
    }
    
    public int countWhitePixels() {
        int whitePixels = 0;
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[0].length; j++) {
                if (pixelValues[i][j] == WHITE) {
                    whitePixels++;
                }
            }
        }
        return whitePixels;
    }

    public void processImage() {
        for (int row = 0; row < pixelValues.length - 2; row++) {
            for (int col = 0; col < pixelValues[0].length - 2; col++) {
                pixelValues[row][col] -= pixelValues[row + 2][col + 2];
                if (pixelValues[row][col] < BLACK) {
                    pixelValues[row][col] = BLACK;
                }
            }
        }
    }
}
