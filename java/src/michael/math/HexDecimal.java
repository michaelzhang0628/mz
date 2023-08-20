package michael.math;

import java.util.HashMap;
import java.util.Map;

public class HexDecimal {
    private int decimal;
    private String str;
    private Map<Character, Integer> converter = new HashMap<Character, Integer>();
    
    /**
     * Takes in a value in hexdecimal form like "1d" or "1D"
     * Letter can be small or big cases
     * @param str
     */
    public HexDecimal(String str) {
        initConverter();
        this.str = str.toLowerCase();
        for (int i = this.str.length() - 1; i > -1; i--) {
            decimal += convertHexDigitToInt2(this.str.charAt(i)) * Math.pow(16, str.length() - 1 - i);
        }
    }
 
    /**
     * Takes in a decimal value like 29
     * @param str
     */
    public HexDecimal(int decimal) {
        // TODO
 }
 
    private void initConverter() {
        converter.put('0',  0);
        converter.put('1',  1);
        converter.put('2',  2);
        converter.put('3',  3);
        converter.put('4',  4);
        converter.put('5',  5);
        converter.put('6',  6);
        converter.put('7',  7);
        converter.put('8',  8);
        converter.put('9',  9);
        converter.put('a',  10);
        converter.put('b',  11);
        converter.put('c',  12);
        converter.put('d',  13);
        converter.put('e',  14);
        converter.put('f',  15);
    }

    private int convertHexDigitToInt2(char ch) {
        return converter.get(ch);
    }

    private int convertHexDigitToInt(char ch) {
        int x = 0;
        if (ch == '0') {
            x = 0;
        }
        if (ch == '1') {
            x = 1;
        }
        if (ch == '2') {
            x = 2;
        }
        if (ch == '3') {
            x = 3;
        }
        if (ch == '4') {
            x = 4;
        }
        if (ch == '5') {
            x = 5;
        }
        if (ch == '6') {
            x = 6;
        }
        if (ch == '7') {
            x = 7;
        }
        if (ch == '8') {
            x = 8;
        }
        if (ch == '9') {
            x = 9;
        }
        if (ch == 'a') {
            x = 10;
        }
        if (ch == 'b') {
            x = 11;
        }
        if (ch == 'c') {
            x = 12;
        }
        if (ch == 'd') {
            x = 13;
        }
        if (ch == 'e') {
            x = 14;
        }
        if (ch == 'f') {
            x = 15;
        }
        return x;
    }
    
    /**
     * return its value in decimal 
     * @return
     */
    public int getDecimal() {
        return decimal;
    }
    
    /**
     * Returns its value in hexdecimal form like "1d" in small case
     */
    @Override
    public String toString() {
        return str;
    }
}
