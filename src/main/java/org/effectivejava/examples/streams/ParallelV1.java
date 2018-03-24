package org.effectivejava.examples.streams;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;


public class ParallelV1 {

    final static BigInteger TWO = BigInteger.valueOf(2);

    public static void main(String[] args) {
        long start = System.nanoTime();

        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))

                .filter(mersenne -> mersenne.isProbablePrime(50))

                .limit(20)

                .forEach(System.out::println);

        long duration = (System.nanoTime() - start) / 1_000_000;;
        System.out.println("Result: " + duration);

    }



    static Stream<BigInteger> primes() {

            return Stream.iterate(TWO, BigInteger::nextProbablePrime);

    }
}
