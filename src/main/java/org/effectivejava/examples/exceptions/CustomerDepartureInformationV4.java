package org.effectivejava.examples.exceptions;

import java.util.Map;

public class CustomerDepartureInformationV4 {
    // null values are legal
    private Map<String, String> valuesFromDB;

    private static Map<String, String> defaultValues;



    public String getByKey(String key) {
        if (valuesFromDB.containsKey(key)) {
            return valuesFromDB.get(key);
        } else {
            String defaultValue = defaultValues.get(key);
            valuesFromDB.put(key, defaultValue);
            return defaultValue;
        }
    }


}