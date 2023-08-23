package michael.freeresponse;

public class MarbleSet {
    String color;
    int numMarbles;

    /** Constructs a new MarbleSet object */
    public MarbleSet(String color, int numMarbles) {
        this.color = color;
        this.numMarbles = numMarbles;
    }

    /** @return the color of the set of marbles */
    public String getColor() {
        return color;
    }

    /**
     * @return the number of marbles in the set
     */
    public int getNumber() {
        return numMarbles;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.

}