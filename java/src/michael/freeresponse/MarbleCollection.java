package michael.freeresponse;

import java.util.ArrayList;
import java.util.List;

public class MarbleCollection {
    /** This is a list of all marble sets */

    private List<MarbleSet> sets;

    /** Constructs a new MarbleSet object */
    public MarbleCollection() {
        sets = new ArrayList<MarbleSet>();
    }

    /**
     * Adds theSet to the marble collection
     * 
     * @param theSet the marble set to add to the marble collection
     */
    public void addSet(MarbleSet theSet) {
        sets.add(theSet);
    }

    /**
     * @return the total number of marbles
     */
    public int getTotalMarbles() {
        int amountOfMarbles = 0;
        for (int i = 0; i < sets.size(); i++) {
            amountOfMarbles += sets.get(i).getNumber();
        }
        return amountOfMarbles;
    }

    /**
     * Removes all the marble sets from the marble collection that have the same
     * color as marbleColor and returns the total number of marbles removed
     * 
     * @param marbleColor the color of the marble sets to be removed
     * @return the total number of marbles of marbleColor in the marble sets removed
     */
    public int removeColor(String marbleColor) {
        int numberOfMarbleColor = 0;
        for (int i = 0; i < sets.size(); i++) {
            if (sets.get(i).getColor().equals(marbleColor)) {
                numberOfMarbleColor += sets.get(i).getNumber();
            }
        }
        return numberOfMarbleColor;
    }
}



