package michael.math;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Number {
    private final int base;
    private final int decimal;
    private final String str;
    private Map<Character, Integer> ChToInt = new HashMap<Character, Integer>();
    private Map<Integer, Character> IntToCh = new HashMap<Integer, Character>();

    public Number(String str, int base) {
        ChToIntConverter();
        this.base = base;
        this.str = str.toLowerCase();
        // set this.decimal
        // convert str to int
        // 1d to 29 in hexadecimal
        int d = 0;
        for(int i = 0; i < this.str.length(); i++) {
            d += (ChToInt(this.str.charAt(i)) * Math.pow(base, this.str.length() - i - 1));
        }
        this.decimal = d;
    }

    public Number(int decimal, int base) {
        IntToChConverter();
        this.base = base;
        this.decimal = decimal;
        // set this.str
        // convert int to str
        // 29 to 1d in hexadecimal
        // 291 to 123 in hexadecimal
        StringBuilder sb = new StringBuilder();
        int q = this.decimal;
        while (q >= this.base) {
            sb.append(IntToCh(q % this.base));
            q = q / this.base;
        }
        sb.append(IntToCh(q));
        this.str = sb.reverse().toString();
    }

    private void ChToIntConverter() {
        ChToInt.put('0', 0);
        ChToInt.put('1', 1);
        ChToInt.put('2', 2);
        ChToInt.put('3', 3);
        ChToInt.put('4', 4);
        ChToInt.put('5', 5);
        ChToInt.put('6', 6);
        ChToInt.put('7', 7);
        ChToInt.put('8', 8);
        ChToInt.put('9', 9);
        ChToInt.put('a', 10);
        ChToInt.put('b', 11);
        ChToInt.put('c', 12);
        ChToInt.put('d', 13);
        ChToInt.put('e', 14);
        ChToInt.put('f', 15);
    }

    private int ChToInt(char ch) {
        return ChToInt.get(ch);
    }

    private void IntToChConverter() {
        IntToCh.put(0, '0');
        IntToCh.put(1, '1');
        IntToCh.put(2, '2');
        IntToCh.put(3, '3');
        IntToCh.put(4, '4');
        IntToCh.put(5, '5');
        IntToCh.put(6, '6');
        IntToCh.put(7, '7');
        IntToCh.put(8, '8');
        IntToCh.put(9, '9');
        IntToCh.put(10, 'a');
        IntToCh.put(11, 'b');
        IntToCh.put(12, 'c');
        IntToCh.put(13, 'd');
        IntToCh.put(14, 'e');
        IntToCh.put(15, 'f');

    }

    private char IntToCh(int in) {
        return IntToCh.get(in);
    }

    public int getDecimal() {
        return decimal;
    }

    @Override
    public String toString() {
        return str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(decimal);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Number))
            return false;
        Number other = (Number) obj;
        return decimal == other.decimal;
    }
}
