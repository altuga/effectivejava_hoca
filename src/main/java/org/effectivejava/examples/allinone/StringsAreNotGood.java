// ITEM 62
package org.effectivejava.examples.allinone;

import java.util.concurrent.ThreadLocalRandom;

public class StringsAreNotGood {

    ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
    public StringsAreNotGood() {

        // not good, be specific
        String compoundKey = this.getClass().getName() + "#" + threadLocalRandom.nextInt();
    }

}


 class DataLocal {
    private DataLocal() { } // Noninstantiable
    // Sets the current datalocal's value for the named variable.
    public static void set(String key, Object value) {};
    // Returns the current datalocal's value for the named variable.
    public static Object get(String key){ return  new Object();};
}


// string-based API problem solved
class DataLocal2 {
    private DataLocal2() { } // Noninstantiable
    public static class Key { // (Capability)
        private int value;
        Key() {  }
        public void setValue(int value) { this.value = value;}
    }
    // Generates a unique, unforgeable key
    public static Key getKey() {
        return new Key();
    }
    public static void set(Key key, Object value){};
    public static Object get(Key key){return  new Object();};
}

final class DataLocal3<T> {
    private T value ;
    public DataLocal3(){};
    public void set(T value){};
    public T get(){ return value ; };


}








