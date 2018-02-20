package org.effectivejava.examples.chapter02.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    static String firstLineOfFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        try {

            return br.readLine();

        } finally {

            br.close();

        }

    }

    public static void main(String[] args) throws Exception{
        System.out.println(
                Read.
                        firstLineOfFile("/Users/altuga/Documents/openshift-egitimi-plani.txt"));

    }
}
