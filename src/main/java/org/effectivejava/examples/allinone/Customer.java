package org.effectivejava.examples.allinone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


class Flight
{
    private List<Customer> customers = new ArrayList<>();

    // this one ?
    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    // this one ?
    public Stream<Customer> getCustomerStream()
    {
        return customers.stream();
    }

}

class Customer {

}
