// Sample uses of varargs
package org.effectivejava.examples.chapter07.item43.kodcu.fixed;

import org.effectivejava.examples.chapter07.item43.kodcu.fixed.*;
import org.effectivejava.examples.chapter07.item43.kodcu.fixed.Cheese;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Factory {

    private static final Cheese.Cheese_Type[]  cheesesInStock = new Cheese.Cheese_Type[10];


    static {
        cheesesInStock[0] = Cheese.Cheese_Type.STILTON;
        cheesesInStock[1] = Cheese.Cheese_Type.ALL;
        cheesesInStock[2] = Cheese.Cheese_Type.BLACK;
        cheesesInStock[3] = Cheese.Cheese_Type.RED;

    }

    /**
     * @return an array containing all of the cheeses in the shop,
     * or null if no cheeses are available for purchase.
     */
    public static Cheese.Cheese_Type[] getCheeses() {
        if (cheesesInStock.length == 0) {
            return null;
        }

        return cheesesInStock;
    }

    public static void main(String[] args) {

        Cheese.Cheese_Type[] cheeses = Factory.getCheeses();
        if (cheeses != null &&
                Arrays.asList(cheeses).contains(Cheese.Cheese_Type.STILTON))
            System.out.println("Peynir budur");
    }
}
