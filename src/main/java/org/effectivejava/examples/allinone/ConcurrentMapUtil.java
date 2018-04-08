// ITEM 81
package org.effectivejava.examples.allinone;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapUtil {

    /**
     *
     *  1 - Prefer ConcurrentHashMap instead of using Collections.synchronizedMap
     *    1.1 - Difference between Hashtable and ConcurrentHashMap ??
     *  2 - Always use System.nanoTime();
     */


    /**
     *
     *  3 - Simply replacing synchronized maps with concurrent maps can
     *  dramatically increase the performance of concurrent applications.
     */
    private static final ConcurrentMap<String, String> map =
            new ConcurrentHashMap<>();

    // Concurrent canonicalizing map atop ConcurrentMap - not optimal
    public static String find(String s) {
        String previousValue = map.putIfAbsent(s, s);
        return previousValue == null ? s : previousValue;

    }


    // Concurrent canonicalizing map atop ConcurrentMap - faster!
    public static String effectiveFind(String s) {
        String result = map.get(s); // is optimized for retrieval get
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null)
                result = s;
        }
        return result;
    }

    public static void main(String[] args) {
        long start = System.nanoTime(); // 2- Always use System.nanoTime();
        for (int i = 0; i < 1; i++) {
            String result = effectiveFind("hello");
        }
        long stop = System.nanoTime(); // 2- Always use System.nanoTime();
        System.err.println("" + ((stop - start) /  1000000000.0));
    }

}
