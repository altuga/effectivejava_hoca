// ITEM 57
package org.effectivejava.examples.allinone;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class KeepItSimple {

    static List<String> c = Arrays.asList("Antalya", "Izmir" , "Sinop") ;

    static List<String> c2 = Arrays.asList("Kagithane", "Istoc" , "Findikli") ;

    public static void calculate() {

        Iterator<String> i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // .....

        Iterator<String> i2 = c2.iterator();
        while (i.hasNext()) {
            System.out.println(i2.next());
        }
    }




    public static void main(String[] args) {
        calculate();
    }
}
