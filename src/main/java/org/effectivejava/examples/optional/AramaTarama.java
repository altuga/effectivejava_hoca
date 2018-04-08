package org.effectivejava.examples.optional;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class AramaTarama {

    public static int max(List collection) {


        // TODO liste icerisindeki en buyuk sayiyi bulunuz
         throw new NotImplementedException();

    }

    public static void main(String[] args) {

        List<Integer> liste = Arrays.asList(10,20,30);
        int enBuyuk = max(liste);
        System.out.println(" sonuc " + enBuyuk );
    }
}
