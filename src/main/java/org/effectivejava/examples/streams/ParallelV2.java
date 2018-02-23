package org.effectivejava.examples.streams;

import java.math.BigInteger;
import java.util.stream.LongStream;


public class ParallelV2 {

    final static BigInteger TWO = BigInteger.valueOf(2);

    public static void main(String[] args) {



        long result = pi(1_000_0000);
        System.out.println("Result : " + result );

    }




    static long pi(long n) {

        return LongStream.rangeClosed(2, n)

                .mapToObj(BigInteger::valueOf)

                .filter(i -> i.isProbablePrime(50)).parallel()

                .count();

    }
}
