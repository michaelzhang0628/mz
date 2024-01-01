package michael.exam.apcsa12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClimbingClub {
    private List<ClimbInfo> climbList;

    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    public List<ClimbInfo> getClimbList() {
        return climbList;
    }

    public void addClimb1(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    public void addClimb2(String peakName, int climbTime) {
        int i = 0;
        while (i < climbList.size() && peakName.compareTo(climbList.get(i).getName()) > 0) {
            i++;
        }
        climbList.add(i, new ClimbInfo(peakName, climbTime));
    }

    public void addClimb3(String peakName, int climbTime) {
        int i = 0;
        for (i = 0; i < climbList.size(); i++) {
            if (peakName.compareTo(climbList.get(i).getName()) <= 0) {
                break;
            }
        }
        climbList.add(i, new ClimbInfo(peakName, climbTime));
    }

    /**
     * This method returns the number of the distinct peak names However, it assumes
     * climbList is ordered by peak names
     * 
     * @return
     */
    public int distinctPeakNames() {
        if (climbList.size() == 0) {
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for (int i = 1; i < climbList.size(); i++) {
            currInfo = climbList.get(i);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0) {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
    
    public int distinctPeakNames2() {
        Set<String> set = new HashSet<String>();
        for (ClimbInfo info : climbList) {
            set.add(info.getName());
        }
        return set.size();
    }

}
