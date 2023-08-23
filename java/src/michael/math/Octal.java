package michael.math;

import java.util.HashMap;
import java.util.Map;

public class Octal extends Number {
    public Octal(String str) {
        super(str, 8);
    }

    public Octal(int decimal) {
        super(decimal, 8);
    }
}
