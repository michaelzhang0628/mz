package michael.exam.apcsa21;

import java.util.ArrayList;
import java.util.Iterator;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();
    
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    public void addGoodMembers(String[] names, int gradeYear) {
        for (String name: names) {
            MemberInfo m = new MemberInfo(name, gradeYear, true);
            memberList.add(m);
        }
   }
   
    public void addBadMembers(String[] names, int gradeYear) {
        for (String name: names) {
            MemberInfo m = new MemberInfo(name, gradeYear, false);
            memberList.add(m);
        }
   }
   
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> goodGraduatedList = new ArrayList<MemberInfo>();
        Iterator<MemberInfo> itr = memberList.iterator();
        while (itr.hasNext()) {
            MemberInfo graduatedMember = itr.next();
            if (graduatedMember.getGradeYear() <= year) {
                if (graduatedMember.inGoodStanding()) {
                    goodGraduatedList.add(graduatedMember);
                }
                itr.remove();
            }
        }
        return goodGraduatedList;
    }
}
