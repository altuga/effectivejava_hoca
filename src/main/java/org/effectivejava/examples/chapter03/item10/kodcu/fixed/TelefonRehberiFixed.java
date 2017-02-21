package org.effectivejava.examples.chapter03.item10.kodcu.fixed;

// Shows the need for overriding hashcode when you override equals - Pages 45-46

import java.util.HashMap;
import java.util.Map;

public final class TelefonRehberiFixed {
    private final short alanKod;
    private final short prefix;
    private final short numara;

    public TelefonRehberiFixed(int alanKod, int prefix, int numara) {
        kontrol(alanKod, 999, "alan kod");
        kontrol(prefix, 999, "prefix");
        kontrol(numara, 9999, "numara");
        this.alanKod = (short) alanKod;
        this.prefix = (short) prefix;
        this.numara = (short) numara;
    }

    private static void kontrol(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TelefonRehberiFixed))
            return false;
        TelefonRehberiFixed pn = (TelefonRehberiFixed) o;
        return pn.numara == numara && pn.prefix == prefix
                && pn.alanKod == alanKod;
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + alanKod;
        result = 31 * result + prefix;
        result = 31 * result + numara;
        return result;
    }


    /**
     * Returns the string representation of this phone number. The string
     * consists of fourteen characters whose format is "(XXX) YYY-ZZZZ", where
     * XXX is the area code, YYY is the prefix, and ZZZZ is the line number.
     * (Each of the capital letters represents a single decimal digit.)
     *
     * If any of the three parts of this phone number is too small to fill up
     * its field, the field is padded with leading zeros. For example, if the
     * value of the line number is 123, the last four characters of the string
     * representation will be "0123".
     *
     * Note that there is a single space separating the closing parenthesis
     * after the area code from the first digit of the prefix.
     */
    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", alanKod, prefix, numara);
    }


    public static void main(String[] args) {
        Map<TelefonRehberiFixed, String> m = new HashMap<TelefonRehberiFixed, String>();
        m.put(new TelefonRehberiFixed(707, 867, 5309), "Ayse");
        System.out.println(m);
    }
}
