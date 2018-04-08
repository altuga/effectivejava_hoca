// ITEM 40
package org.effectivejava.examples.allinone;




import java.util.HashMap;
import java.util.Map;

// Can you spot the bug?
public final class TelefonRehberi {
    private final short alanKod;
    private final short prefix;
    private final short numara;

    public TelefonRehberi(int alanKod, int prefix, int numara) {
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


    public boolean equals(TelefonRehberi o) {
        if (o == this)
            return true;
        if (!(o instanceof TelefonRehberi))
            return false;

        return o.numara == numara && o.prefix == prefix
                && o.alanKod == alanKod;
    }



    public int hashCode() {
        int result = 17;
        result = 31 * result + alanKod;
        result = 31 * result + prefix;
        result = 31 * result + numara;
        return result;
    }



    public static void main(String[] args) {
        Map<TelefonRehberi, String> m = new HashMap<TelefonRehberi, String>();
        m.put(new TelefonRehberi(707, 867, 5309), "Ayse");
        System.out.println(m.get(new TelefonRehberi(707, 867, 5309)));
    }
}
