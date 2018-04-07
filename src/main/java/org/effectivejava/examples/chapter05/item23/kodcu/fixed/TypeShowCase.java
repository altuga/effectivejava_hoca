package org.effectivejava.examples.chapter05.item23.kodcu.fixed;


import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}


public class TypeShowCase {

    List<? extends A> la;
    List<? super B> lb;

    {

        la = new ArrayList<B>();
        la = new ArrayList<C>();
        la = new ArrayList<D>();


        lb = new ArrayList<A>();
       // lb = new ArrayList<C>();

        otherMethod(lb);


    }

    public void someMethod(List<? extends B> lb) {
        B b = lb.get(0); // is fine
        lb.add(new B()); //will not compile as we do not know the type of the list, only that it is bounded above by B
    }

    public void otherMethod(List<? super B> lb) {
        B b = lb.get(0); // will not compile as we do not know whether the list is of type B, it may be a List<A> and only contain instances of A
        lb.add(new B()); // is fine, as we know that it will be a super type of A
    }
}
