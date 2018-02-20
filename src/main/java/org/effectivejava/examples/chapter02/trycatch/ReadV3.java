package org.effectivejava.examples.chapter02.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadV3 {

    // try-with-resources - the the best way to close resources!

    // AutoCloseable , Closeable
    static String firstLineOfFile(String path) throws IOException {

        try (BufferedReader br = new BufferedReader(

                new FileReader(path))) {

            return br.readLine();

        }
    }


}
