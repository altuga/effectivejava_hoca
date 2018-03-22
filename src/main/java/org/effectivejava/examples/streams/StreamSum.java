package org.effectivejava.examples.streams;

import java.util.stream.IntStream;

public class StreamSum {
    static final int SUM = IntStream.range(0, 100).reduce((n, m) -> n + m).getAsInt();

    public static void main(String[] args) {
        System.out.println(SUM);
    }
}