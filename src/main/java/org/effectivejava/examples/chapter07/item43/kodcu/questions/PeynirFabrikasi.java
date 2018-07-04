
package org.effectivejava.examples.chapter07.item43.kodcu.questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeynirFabrikasi {

    private static final List<Peynir> stok = new ArrayList();


    /**
     * @return an array containing all of the cheeses in the shop,
     * or null if no cheeses are available for purchase.
     */
    public static List<Peynir> peynirleriGetir() {
        if (stok.size() == 0) {
            return null;
        }
        return stok;

    }

    public static void main(String[] args) {

        List<Peynir> peynirList = PeynirFabrikasi.peynirleriGetir();
        if (peynirList != null &&  peynirList.contains(Peynir.EZINE)) {
            System.out.println("Peynir budur");
        }
    }
}
