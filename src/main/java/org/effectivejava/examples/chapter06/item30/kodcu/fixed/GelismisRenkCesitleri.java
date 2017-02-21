package org.effectivejava.examples.chapter06.item30.kodcu.fixed;

/**
 * Created by MAC on 27/08/15.
 */
public class GelismisRenkCesitleri {

    /**
     *
     * @param type  COLOR_TYPE
     * @return  code of the color
     */
    public static String calculateColorCode(COLOR_TYPE type) {
        //....
        return "x01012" ; // sample
    }

    public static void main(String[] args) {
        GelismisRenkCesitleri.calculateColorCode(COLOR_TYPE.BLACK) ;


    }
}
