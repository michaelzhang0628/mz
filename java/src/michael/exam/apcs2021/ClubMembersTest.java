package michael.exam.apcs2021;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ClubMembersTest {

    @Test
    void testAddMembers() {
        ClubMembers cm = new ClubMembers();
        String[] names = new String[] {"Smith, Jane", "Fox, Steve", "Xin, Michael", "Garcia, Maria"};
        cm.addMembers(names, 2019, true);
        assertEquals(new MemberInfo("Smith, Jane", 2019, true), cm.getMemberList().get(0));
        assertEquals(new MemberInfo("Fox, Steve", 2019, true), cm.getMemberList().get(1));
        assertEquals(new MemberInfo("Xin, Michael", 2019, true), cm.getMemberList().get(2));
        assertEquals(new MemberInfo("Garcia, Maria", 2019, true), cm.getMemberList().get(3));
    }

    @Test
    void testRemoveMembers() {
        ClubMembers cm = new ClubMembers();
        String[] name1 = new String[] {"Smith, Jane"};
        String[] name2 = new String[] {"Fox, Steve"};
        String[] name3 = new String[] {"Xin, Michael"};
        String[] name4 = new String[] {"Garcia, Maria"};
        cm.addMembers(name1, 2019, false);
        cm.addMembers(name2, 2018, true);
        cm.addMembers(name3, 2017, false);
        cm.addMembers(name4, 2020, true);
        ArrayList<MemberInfo> expected = new ArrayList<MemberInfo> ();
        expected.add(new MemberInfo("Fox, Steve", 2018, true));
        assertEquals(expected, cm.removeMembers(2018));
        ArrayList<MemberInfo> listLeft = new ArrayList<MemberInfo> ();
        listLeft.add(new MemberInfo("Smith, Jane", 2019, false));
        listLeft.add(new MemberInfo("Garcia, Maria", 2020, true));        
        assertEquals(2, cm.getMemberList().size());
        assertEquals(listLeft.get(0), cm.getMemberList().get(0));
        assertEquals(listLeft.get(1), cm.getMemberList().get(1));        
    }
}
