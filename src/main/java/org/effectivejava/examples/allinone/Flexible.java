// ITEM 64
package org.effectivejava.examples.allinone;

import org.effectivejava.examples.exceptions.CustomerDepartureInformation;

import java.util.*;

public class Flexible {
    // Good - uses interface as type
    List<CustomerDepartureInformation> customerDepartureInformationList = new LinkedList<>();

    // Bad - uses class as type!
    LinkedList<CustomerDepartureInformation> badReferenceList = new LinkedList<>();

    public Flexible() {

        // If you get into the habit of using interfaces as types, your program will be
        //much more flexible.
        customerDepartureInformationList =new ArrayList<>();
    }


}
