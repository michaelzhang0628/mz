package michael.freeresponse;

public class SeatingChart {
    private String[][] chart;
    private int rows;
    private int cols;

    /**
     * Constructs a SeatingChart having r rows and c columns. All elements contained
     * in the names array should be placed randomly in the chart array using the
     * format: lastName, firstName (e.g. Jolie, Angelina). Any locations not used in
     * the chart should be initialized to the empty string.
     */
    SeatingChart(Name[] names, int rows, int cols) {
        chart = new String[rows][cols];
        this.rows = rows;
        this.cols = cols;
        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                chart[i][j] = "";
            }
        }
        for (int i = 0; i < names.length; i++) {
            int randomRow = (int)(Math.random() * rows);
            int randomCol = (int)(Math.random() * cols);
            while (!(chart[randomRow][randomCol].equals(""))) {
                randomRow = (int)(Math.random() * rows);
                randomCol = (int)(Math.random() * cols);
            }
            chart[randomRow][randomCol] = names[i].toString();
        }
    }

    public int getRows() {
        return rows;
    }
    
    public int getCols() {
        return cols;
    }
    
    public String[][] getChart() {
        return chart;
    }
    
    /**
     * Returns a string containing all elements of the chart array in row-major
     * order. The method should return a string containing all the elements in the
     * chart array. The method padWithSpaces should be called on each element of the
     * chart before it is added to the string to ensure each name will be printed
     * with the same length. Each row of the chart should be separated by a line
     * break.
     */

    public String toString() {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                str.append(padWithSpaces(chart[i][j]));
            }
            str.append('\n');
        }
        return str.toString();
    }

    /**
     * Pads a string with spaces to ensure each string is exactly 35 characters
     * long.
     */
    private String padWithSpaces(String s) {
        StringBuffer str = new StringBuffer(s);
        for (int a = s.length(); a < 35; a++) {
            str.append(' ');
        }
        return str.toString();
    }
}
