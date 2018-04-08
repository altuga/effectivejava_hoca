// ITEM 63
package org.effectivejava.examples.allinone;

import java.util.concurrent.ThreadLocalRandom;

public class StringPerformance {

    // Inappropriate use of string concatenation - Performs poorly!
    public String statement() {
        String result = "";
        for (int i = 0; i < numItems(); i++)
            result += lineForItem(); // String concatenation
        return result;
    }


    public String statementWithStringBuilder() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < numItems(); i++)
            b.append(lineForItem());
        return b.toString();
    }

    private char lineForItem() {
         char c = (char)(ThreadLocalRandom.current().nextInt(26) + 'a');
         return c;
    }

    private int numItems() {
        return 100;
    }

}
