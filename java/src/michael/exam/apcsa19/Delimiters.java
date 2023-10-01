package michael.exam.apcsa19;

import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;
    
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> allDelimiters = new ArrayList<String>();     
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                allDelimiters.add(token);
            }
        }
        return allDelimiters;
    }
    
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openDelimiterCount = 0;
        for (int i = 0; i < delimiters.size(); i++) {
            if (delimiters.get(i).equals(openDel)) {
                openDelimiterCount++;
            }
            if (delimiters.get(i).equals(closeDel)) {
                openDelimiterCount--;
            }
            if (openDelimiterCount < 0) {
                return false;
            }
        }
        if (openDelimiterCount == 0) {
            return true;
        }
        return false;
    }
}
