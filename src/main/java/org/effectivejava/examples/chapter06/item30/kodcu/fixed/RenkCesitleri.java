package org.effectivejava.examples.chapter06.item30.kodcu.fixed;

/**
 * Created by MAC on 27/08/15.
 */
public class RenkCesitleri {

    /** Calculate color Code.
     * @param type Type of  to count. Can be 1=green ,
     * 2=red , 3=black , 0=all colors.
     * @return number of colors of type
     */
    public static String calculateColorCode(int type) {
        return "x01012" ; // sample
    }

    public static void main(String[] args) {
        RenkCesitleri.calculateColorCode(3) ;
        RenkCesitleri.calculateColorCode(99) ; // oops !

    }
}
