package org.effectivejava.examples.optional;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class AramaTarama2 {

    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {

        if (Objects.isNull(c)) {
            return Optional.empty();
        }

        E result  = Collections.max(c);
        return Optional.of(result);

    }

    public static void main(String[] args) {

        List<Integer> liste = null;
        int maxNumber  = max(liste).orElse(0);
        System.out.println(" sonuc " + maxNumber );
    }
}
