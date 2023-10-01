package michael.exam.apcsa21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ClubMembersTest {

    @Test
    void test() {
        ClubMembers cm = new ClubMembers();
        cm.addBadMembers(new String[] {"Smith, Jane"}, 2019);
        cm.addGoodMembers(new String[] {"Fox, Steve"}, 2018);
        cm.addBadMembers(new String[] {"Xin, Michael"}, 2017);
        cm.addGoodMembers(new String[] {"Garcia, Marcia"}, 2020); 
        ArrayList<MemberInfo> graduated = cm.removeMembers(2018);
        assertEquals(graduated.size(), 1);
        assertEquals(graduated.get(0).getName(), "Fox, Steve");
        ArrayList<MemberInfo> current = cm.getMemberList();
        assertTrue(current.get(0).getName().equals("Smith, Jane") || 
                current.get(1).getName().equals("Smith, Jane"));
        assertTrue(current.get(0).getName().equals("Garcia, Marcia") || 
                current.get(1).getName().equals("Garcia, Marcia"));
    }

}
