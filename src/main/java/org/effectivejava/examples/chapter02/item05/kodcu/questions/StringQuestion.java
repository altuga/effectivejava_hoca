package org.effectivejava.examples.chapter02.item05.kodcu.questions;

public class StringQuestion {

    public static void main(String[] args) {


        String s1 = new String("selam");
        String s2 = "selam";
        String s3 = "selam" ;

        if (s1 == s2) {
            System.out.println(" s1 == s2");
        }

        if (s2 == s3) {
            System.out.println("s2 == s3");
        }


    }
}
