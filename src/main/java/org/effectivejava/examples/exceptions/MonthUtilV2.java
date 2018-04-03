package org.effectivejava.examples.exceptions;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class MonthUtilV2 {
    /**
     * Turkce ay ismini dondurur. monthNo maksimum 12 olur.
     *
     * @param monthNo
     * @return
     */
    public static String monthName(AyEnum ay) {

        Locale locale = new Locale("tr", "TR");
        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        String[] months = symbols.getMonths();
        return months[ay.getAy() + 1];
    }
}

class Main {

    public static void main(String[] args) {
        String sonuc = MonthUtilV2.monthName(AyEnum.EYLUL);
        System.out.println(sonuc);
    }
}

enum AyEnum {
    OCAK(-1), SUBAT(0), MART(1), NISAN(2), MAYIS(3), HAZIRAN(4), TEMMUZ(5),
    AGUSTOS(6) , EYLUL(7), EKIM(8), KASIM(9), ARALIK (10),  ;


    private int ay;

    AyEnum(int ay) {
        this.ay = ay;
    }


    public int getAy() {
        return ay;
    }
}
