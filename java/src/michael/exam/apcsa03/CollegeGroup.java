package michael.exam.apcsa03;

import java.util.ArrayList;
import java.util.List;

public class CollegeGroup {
    List<College> collegeList;
    
    public CollegeGroup(List<College> collegeList) {
        super();
        this.collegeList = collegeList;
    }

    public void updateTuition(String collegeName, int newTuition) {
        for (College c : collegeList) {
            if (c.getName().equals(collegeName)) {
                c.setTuition(newTuition);
            }
        }
    }
    
    public List<College> getCollegeList(String region, int lowerBoundTuition, int upperBoundTuition) {
        List<College> collgesWithinBounds = new ArrayList<College> ();
        for (int i = 0; i < collegeList.size(); i++) {
            if (collegeList.get(i).getRegion().equals(region)) {
                if (collegeList.get(i).getTuition() >= lowerBoundTuition && collegeList.get(i).getTuition() <= upperBoundTuition) {
                    collgesWithinBounds.add(collegeList.get(i));
                }
            }
        }
        return collgesWithinBounds;
    }
} 
