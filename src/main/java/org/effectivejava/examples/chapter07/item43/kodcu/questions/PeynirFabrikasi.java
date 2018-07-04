
package org.effectivejava.examples.chapter07.item43.kodcu.questions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeynirFabrikasi {

    private static final List<Peynir> stok = new ArrayList<Peynir>();


    /**
     * @return an array containing all of the cheeses in the shop,
     * or null if no cheeses are available for purchase.
     */
    public static List<Peynir> peynirleriGetir() {
        if (stok.isEmpty()) {
            return null;
        }
        return stok;

    }

    public static void main(String[] args) {

        List<Peynir> peynirList = PeynirFabrikasi.peynirleriGetir();
        if ( peynirList != null && peynirList.contains(Peynir.EZINE)) {
            System.out.println("Peynir budur");
        }
    }
}
