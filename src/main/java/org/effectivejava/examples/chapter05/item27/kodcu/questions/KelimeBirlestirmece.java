
package org.effectivejava.examples.chapter05.item27.kodcu.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KelimeBirlestirmece {


    public static  Set birlestir(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;

    }


    public static void main(String[] args) {
        Set<String> marmaraBolgesiSehirleri = new HashSet<String>(Arrays.asList("Edirne", "Edirne", "Tekirdag", "Kocaeli"));
        Set<String> egeBolgesiSehirleri = new HashSet<String>(Arrays.asList("Izmir", "Aydin", "Mugla"));

        Set aflCio = birlestir(marmaraBolgesiSehirleri, egeBolgesiSehirleri);
        System.out.println(aflCio);

        // TODO

/*
        Set<Integer> ints = new HashSet<Integer>(Arrays.asList(12, 13, 14));
        Set<Integer> go = birlestir(marmaraBolgesiSehirleri, egeBolgesiSehirleri);
        for (Integer intValue : go) {
            System.out.println(intValue);
        }

*/

    }
}
