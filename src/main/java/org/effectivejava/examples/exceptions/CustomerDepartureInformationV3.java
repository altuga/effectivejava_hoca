package org.effectivejava.examples.exceptions;


import java.util.HashMap;
import java.util.Map;
import com.google.common.base.Optional;


public class CustomerDepartureInformationV3 {
    // null values are legal
    private static Map<String, String> valuesFromDB = new HashMap<>();

    private static Map<String, String> defaultValues = new HashMap<>();




    public String getByKey(String key) {

        return  Optional.fromNullable( getValueByKey(key)).get().
                or(Optional.fromNullable(defaultValues.get(key))
                        .or("default"));

    }

    private Optional<String> getValueByKey(String key) {
        if (valuesFromDB.containsKey(key)) {
            return Optional.of(valuesFromDB.get(key));
        } else {
            return Optional.absent();
        }
    }


}