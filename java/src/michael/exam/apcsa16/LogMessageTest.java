package michael.exam.apcsa16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogMessageTest {

    @Test
    void test() {
        assertTrue(new LogMessage("server1:disk").containsWord("disk"));
        assertTrue(new LogMessage("server1:disk offline").containsWord("disk"));
        assertTrue(new LogMessage("server1:error on disk").containsWord("disk"));
        assertTrue(new LogMessage("server1:error on/dev/disk disk").containsWord("disk"));
        assertTrue(new LogMessage("server1:error on disk DSK1").containsWord("disk"));
        assertFalse(new LogMessage("server1:DISK").containsWord("disk"));
        assertFalse(new LogMessage("server1:error on disk3").containsWord("disk"));
        assertFalse(new LogMessage("server1:error on /dev/disk").containsWord("disk"));
        assertFalse(new LogMessage("server1:diskette").containsWord("disk"));
        assertTrue(new LogMessage("server1:diskette A disk B").containsWord("disk"));
        assertFalse(new LogMessage("server1:error on 3disk").containsWord("disk"));
    }

}
