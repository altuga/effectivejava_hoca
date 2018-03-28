package org.effectivejava.examples.exceptions;

import java.util.Map;
import java.util.Optional;

public class CustomerDepartureInformationV2 {
    // null values are legal
    private Map<String, String> valuesFromDB;

    private static Map<String, String> defaultValues;


    public String getByKey(String key) {

            Optional<String> value = getValueByKey(key);
            if (value.isPresent()) {
                return value.get();
            } else {
                String defaultValue = defaultValues.get(key);
                valuesFromDB.put(key, defaultValue);
                return defaultValue;
            }

    }

    private Optional<String> getValueByKey(String key) {
        if (valuesFromDB.containsKey(key)) {
            return Optional.of(valuesFromDB.get(key));
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

    }
}