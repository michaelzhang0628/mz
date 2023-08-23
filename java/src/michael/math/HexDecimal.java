package michael.math;

import java.util.HashMap;
import java.util.Map;

public class HexDecimal extends Number {
    /**
     * Takes in a value in hexdecimal form like "1d" or "1D" Letter can be small or
     * big cases
     * 
     * @param str
     */
    public HexDecimal(String str) {
        super(str, 16);
    }

    /**
     * Takes in a decimal value like 29
     * 
     * @param str
     */
    public HexDecimal(int decimal) {
        super(decimal, 16);
    }
}
