// ITEM 1
package org.effectivejava.examples.allinone;

import org.effectivejava.examples.chapter04.item18.AbstractMapEntry;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.EnumSet;

public class StaticFactoryExamples {

    public static void main(String[] args) throws IOException {


        /**
         * Often static factories are preferable
         *
         * so avoid the reflex to provide
         * public constructors without first considering
         * static factories.
         */
        Date d = Date.from(Instant.now());

       // Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

        Date[] dates = (Date[]) Array.newInstance(Date.class, 1);

        Path logFile = Paths.get("/temp/logs/app.log");
        BufferedReader br = Files.newBufferedReader(logFile);

    }
}

