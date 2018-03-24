package org.effectivejava.examples.streams;

import java.math.BigInteger;
import java.util.stream.LongStream;


public class ParallelV3 {

    final static BigInteger TWO = BigInteger.valueOf(2);

    public static void main(String[] args) {


        long start = System.nanoTime();
        long result = pi(1_000_0000);
        System.out.println("Result : " + result );
        long duration = (System.nanoTime() - start) / 1_000_000;;
        System.out.println("Duration: " + duration);

    }




    static long pi(long n) {

        return LongStream.rangeClosed(2, n)

                .mapToObj(BigInteger::valueOf)

                .filter(i -> i.isProbablePrime(50))

                .count();

    }
}
