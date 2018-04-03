package org.effectivejava.examples.exceptions;

import java.text.DateFormatSymbols;
import java.util.Locale;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class MonthUtil {
    /**
     * Turkce ay ismini geri dondurur. monthNo maksimum 12 olur.
     * @param monthNo
     * @return
     */
    public static String monthName(int monthNo){
        if(monthNo>12)
            throw new IllegalArgumentException("Ay 12'den buyuk olamaz. Hata !!!");
        Locale locale = new Locale("tr","TR");
        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        String[] months = symbols.getMonths();
        return months[monthNo+1];
    }
}
