package michael.exam.apcsa15;

import java.util.List;

public class MultipleGroups implements NumberGroup {
    private List<NumberGroup> groupList;

    public MultipleGroups(List<NumberGroup> groupList) {
        super();
        this.groupList = groupList;
    }
    
    public boolean contains(int num) {
        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).contains(num)) {
                return true;
            }
        }
        return false;
    }
}
