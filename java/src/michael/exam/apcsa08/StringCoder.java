package michael.exam.apcsa08;

import java.util.ArrayList;

public class StringCoder {
    private String masterString;

    public StringCoder(String master) {
        masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts) {
        String decoded = "";
        for (int i = 0; i < parts.size(); i++) {
            StringPart strPart = parts.get(i);
            decoded += masterString.substring(strPart.getStart(), strPart.getStart() + strPart.getLength());
        }
        return decoded;
    }

    private StringPart findPart(String str) {
        String strPart = str;
        int index = masterString.indexOf(strPart);
        while (index == -1) {
            strPart = strPart.substring(0, strPart.length() - 1);
            index = masterString.indexOf(strPart);
        }
        return new StringPart(index, strPart.length());
    }

    public ArrayList<StringPart> encodeString(String word) {
        ArrayList<StringPart> parts = new ArrayList<StringPart>();
        String wordRemaining = word;
        while (wordRemaining.length() > 0) {
            StringPart sp = findPart(wordRemaining);
            parts.add(sp);
            wordRemaining = wordRemaining.substring(sp.getLength());
        }
        return parts;
    }
}
