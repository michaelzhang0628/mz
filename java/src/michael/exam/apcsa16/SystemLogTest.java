package michael.exam.apcsa16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SystemLogTest {

    @Test
    void test() {
        List<LogMessage> l = new ArrayList<LogMessage>();
        l.add(new LogMessage("Client3:security alert"));
        l.add(new LogMessage("ws:disk offline"));
        l.add(new LogMessage("s1:file not found"));
        l.add(new LogMessage("s2:read error on disk D1"));
        l.add(new LogMessage("s1:read error on disk D2"));
        l.add(new LogMessage("ws:error on /dev/disk"));
        l.add(new LogMessage("ws:error on disk /dev/disk"));
        SystemLog theLog = new SystemLog(l);
        List<LogMessage> removed = theLog.removeMessages("disk");
        assertEquals(4, removed.size());
        assertEquals(3, theLog.getMessageList().size());
    }
}
