package org.effectivejava.examples.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Instant;

public class SpeedTest {



    public static void main(String[] args) {


        long[] myLongArray = new long[10];


        long  start = Instant.now().toEpochMilli();


            long i = 0;
            for (int j = 0; j < Integer.MAX_VALUE ; j++) {

                    i += j + myLongArray[j];



            }

            System.out.println(" value = " + i);



        long  stop = Instant.now().toEpochMilli();

        System.out.println(" Time " +  (stop - start) );
    }
}
