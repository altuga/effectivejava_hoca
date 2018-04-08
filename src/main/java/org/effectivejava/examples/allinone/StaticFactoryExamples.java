// ITEM 1
package org.effectivejava.examples.allinone;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;

public class StaticFactoryExamples {

    public static void main(String[] args) {

        Date d = Date.from(Instant.now());

       // Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

        Date[] dates = (Date[]) Array.newInstance(Date.class, 1);

    }
}
