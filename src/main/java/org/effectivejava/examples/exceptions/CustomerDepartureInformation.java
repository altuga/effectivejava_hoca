package org.effectivejava.examples.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class CustomerDepartureInformation {
    // null values are legal
    private Map<String, String> valuesFromDB;

    private static Map<String, String> defaultValues;

    class CustomerNotFoundException extends Exception {
        public CustomerNotFoundException(String message) {
            super(message);
        }
    }

    public String getByKey(String key) {
        try {
            return getValueByKey(key);
        } catch (CustomerNotFoundException | RuntimeException  ex ) {
            String defaultValue = defaultValues.get(key);
            valuesFromDB.put(key, defaultValue);
            return defaultValue;
        }
    }

    private String getValueByKey(String key) throws CustomerNotFoundException {
        if (valuesFromDB.containsKey(key)) {
            return valuesFromDB.get(key);
        } else {
            throw new CustomerNotFoundException( key + " is not present");
        }
    }


}