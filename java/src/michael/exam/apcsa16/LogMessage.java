package michael.exam.apcsa16;

public class LogMessage {
    private String machineID;
    private String description;
    
    public LogMessage(String message) {
        int colonIndex = message.indexOf(":");
        machineID = message.substring(0, colonIndex);
        description = message.substring(colonIndex + 1);
    }
    
    /**
     * keyword at beginning with space afterwards
     * keyword at ending with space before
     * keyword surrounded by empty space
     * @param keyword
     * @return
     */
    public boolean containsWord(String keyword) {
        int startingIndex = 0;
        while (true) {
            int keywordIndex = description.indexOf(keyword, startingIndex);
            if (keywordIndex == -1) {
                return false;
            }    
            if (keywordIndex == 0) {
                // keyword to start
                if (keyword.length() == description.length() || description.charAt(keywordIndex + keyword.length()) == ' ') {
                    return true;
                }
            }
            else if (keywordIndex == (description.length() - keyword.length())) {
                // keyword to end
                if (description.charAt(keywordIndex - 1) == ' ') {
                    return true;
                }
            }
            else {
                // keyword in the middle
                if (description.charAt(keywordIndex - 1) == ' ' 
                        && description.charAt(keywordIndex + keyword.length()) == ' ') {
                    return true;
                }
            }
            
            startingIndex++;
        }
    }
    
    public String getMachineID() {
        return machineID;
    }
    
    public String getDescription() {
        return description;
    }
}
