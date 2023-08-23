package michael.math;

public class QuadraticFunction {
    private int a;
    private int b;
    private int c;

    /**
     * Create a QuadraticFunction object using parameter a, b, and c to repsent
     * a*sqr(x)+b*x+c.
     * 
     * @param a
     * @param b
     * @param c
     */
    public QuadraticFunction(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Returns how many real number roots does this Quadratic function have. It
     * could be 0, 1, or 2.
     * 
     * @return
     */
    public int rootCount() {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            return 2;
        } else if (discriminant == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Returns the axis of symmetry, which is the x value of the Vertex.
     * 
     * @return
     */
    public float axisOfSymmetry() {
        return ((float) (-b)) / (2 * a);
    }

    /**
     * Returns true if the U graph shape is upside up, Returns false if the U graph
     * shape is upside down.
     * 
     * @return
     */
    public boolean isUShaped() {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns roots. Order is small to big.
     */
    public float[] getRoots() {
        if (rootCount() == 2) {

            float[] root = new float[2];
            root[0] = (float) ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            root[1] = (float) ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            return root;
            /**
             * float r1 = (float) ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
             * float r2 = (float) ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
             * return new float[] {r1, r2};
             **/
        } else if (rootCount() == 1) {
            return new float[] { ((float) (-b)) / (2 * a) };
        } else {
            return new float[0];
        }
    }
}
