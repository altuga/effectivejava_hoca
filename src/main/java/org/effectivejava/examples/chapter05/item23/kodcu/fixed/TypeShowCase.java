package org.effectivejava.examples.chapter05.item23.kodcu.fixed;


import java.util.ArrayList;
import java.util.List;

/*
class Arac extends Object{}
class Araba extends Arac {}
class SporAraba extends Araba {}
class AileArabasi extends Araba {}


public class TypeShowCase {

    List<? extends Arac> aracListesi;
    List<? super Araba> arabaListesi;

    {

        aracListesi = new ArrayList<Araba>(); // ??
        aracListesi = new ArrayList<SporAraba>(); // ??
        aracListesi = new ArrayList<AileArabasi>(); // ??


        arabaListesi = new ArrayList<Arac>(); // ??
        arabaListesi = new ArrayList<AileArabasi>(); // ??

        //someMethod(aracListesi);


    }

    public void someMethod(List<? extends Araba> lb) {
        Araba araba = lb.get(0); // ??
        lb.add(new Araba()); // ??
    }

    public void otherMethod(List<? super Araba> lb) {
        Araba araba = lb.get(0);  // ??
        lb.add(new Araba()); // ??
    }

}
*/
