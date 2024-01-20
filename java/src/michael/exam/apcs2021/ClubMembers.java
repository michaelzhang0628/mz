package michael.exam.apcs2021;

import java.util.ArrayList;
import java.util.Iterator;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<MemberInfo> ();
    }

    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    public void addMembers(String[] names, int gradYear, boolean hasGoodStanding) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, hasGoodStanding));
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> goodGraduated = new ArrayList<MemberInfo>();
        Iterator<MemberInfo> it = memberList.iterator();
        while (it.hasNext()) {
            MemberInfo i = it.next();
            if (i.getGradYear() <= year) {
                if (i.inGoodStanding()) {
                    goodGraduated.add(i);
                }
                it.remove();
            }
        }
        return goodGraduated;
    }
}
