package org.effectivejava.examples.streams;

import java.io.SequenceInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

public class ParallelV2 {

    public static final ArrayList<Long> myList = new ArrayList<>();



    public static void main(String[] args) {

        Stream<Long> baseStream =
                myList.stream();

        long start = System.nanoTime();

        for (int i = 0; i< 1_000_0000; i ++) {
            myList.add((long)i);
        }

        baseStream.map(value -> new BigInteger(value+""))
                .filter( value -> value.isProbablePrime(50)).count();
        long duration = (System.nanoTime() - start) / 1_000_000;;
        System.out.println("Result: " + duration + " - "
                + baseStream.isParallel());
    }
}
