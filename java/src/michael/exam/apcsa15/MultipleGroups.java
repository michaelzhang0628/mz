package michael.exam.apcsa15;

import java.util.List;

// TODO could MultipleGroups implements NumberGroup?
public class MultipleGroups {
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
