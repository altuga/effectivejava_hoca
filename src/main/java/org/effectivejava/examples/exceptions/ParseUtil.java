package org.effectivejava.examples.exceptions;

public class ParseUtil {

    /**
     * Value must be between 10 and 100
     * @param value
     */
    public static void parse(int value) {

        if (value > 1000) {
            // Ders : Error tipi hatalar JVM içindir, bu hata tiplerini kullanmayın
            throw new Error();
        }


    }

    public static void main(String[] args) {
        ParseUtil.parse(200);
        System.out.println("bitti");
    }
}
