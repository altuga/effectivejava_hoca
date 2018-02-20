package org.effectivejava.examples.chapter02.trycatch;

import java.io.*;

public class ReadV5 {

    // try-with-resources with a catch clause

    // Ders cok net : Her zaman try - resource kullanalim

    static String firstLineOfFile(String path, String defaultVal) {

        try (BufferedReader br = new BufferedReader(

                new FileReader(path))) {

            return br.readLine();

        } catch (IOException e) {

            return defaultVal;

        }

    }

    public static void main(String[] args) throws Exception{

          String okunan = ReadV5.firstLineOfFile(
                  "/Users/altuga/Documents/openshift-egitimi-plan.txt",
                  "okunamadi");

        System.out.println(" Sonuc " + okunan);

    }
}
