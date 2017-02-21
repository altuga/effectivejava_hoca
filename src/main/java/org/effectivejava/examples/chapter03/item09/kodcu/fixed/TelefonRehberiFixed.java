package org.effectivejava.examples.chapter03.item09.kodcu.fixed;

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



    public static void main(String[] args) {
        Map<TelefonRehberiFixed, String> m = new HashMap<TelefonRehberiFixed, String>();
        m.put(new TelefonRehberiFixed(707, 867, 5309), "Ayse");
        System.out.println(m.get(new TelefonRehberiFixed(707, 867, 5309)));
    }
}
