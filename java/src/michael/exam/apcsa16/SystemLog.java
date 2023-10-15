package michael.exam.apcsa16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SystemLog {
    private List<LogMessage> messageList;

    public SystemLog(List<LogMessage> messageList) {
        super();
        this.messageList = messageList;
    }

    public List<LogMessage> getMessageList() {
        return messageList;
    }

    public List<LogMessage> removeMessages(String keyword) {
        ArrayList<LogMessage> removedMessages = new ArrayList<LogMessage>();
        Iterator<LogMessage> it = messageList.iterator();
        while (it.hasNext()) {
            LogMessage m = it.next();
            if (m.containsWord(keyword)) {
                it.remove();
                removedMessages.add(m);
                
            }
        }
        return removedMessages;
    }
}
