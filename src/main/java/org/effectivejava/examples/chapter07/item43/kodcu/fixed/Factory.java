// Sample uses of varargs
package org.effectivejava.examples.chapter07.item43.kodcu.fixed;

import org.effectivejava.examples.chapter07.item43.kodcu.questions.*;
import org.effectivejava.examples.chapter07.item43.kodcu.questions.Cheese;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Factory {

    private static final List<Cheese> cheesesInStock = new ArrayList();


    // doing someting



    public static List<Cheese> getCheeses() {
        if (cheesesInStock.size() == 0) {
            return Collections.emptyList(); // Always returns same list
        }
         return new ArrayList<Cheese>(cheesesInStock); // create a new list

    }

    public static void main(String[] args) {

        List<Cheese> cheeseList = Factory.getCheeses();

        // no need to control null list anymore
        if (Arrays.asList(cheeseList).contains(Cheese.Cheese_Type.STILTON))
            System.out.println("Peynir budur");
    }
}
