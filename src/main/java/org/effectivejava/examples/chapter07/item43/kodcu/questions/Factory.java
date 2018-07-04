
package org.effectivejava.examples.chapter07.item43.kodcu.questions;


import java.util.Arrays;

public class Factory {

    private static final Cheese[]  cheesesInStock = new Cheese[10];


    // doing someting

    /**
     * @return an array containing all of the cheeses in the shop,
     * or null if no cheeses are available for purchase.
     */
    public static Cheese[] getCheeses() {
        if (cheesesInStock.length == 0) {
            return null;
        }
        return cheesesInStock;

    }

    public static void main(String[] args) {

        Cheese[] cheeses = Factory.getCheeses();
        if (cheeses != null &&
                Arrays.asList(cheeses).contains(Cheese.Cheese_Type.STILTON))
            System.out.println("Peynir budur");
    }
}
