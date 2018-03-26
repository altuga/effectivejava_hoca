package org.effectivejava.examples.exceptions;

/**
 * Ders : Eğer kendi hata sınıflarımızı yapacaksak,
 * Öncelikle RuntimeException'dan türetmeyi düşünmeliyiz.
 * Exception sınıfından türetmek ancak zorunlu koşullarda olmalı
 * Error dan türetmeyi aklımızdan geçirmeyelim  .
 */
public class AccoutingException extends RuntimeException {

    private int errorCode;
    private String errorMessage;
    public AccoutingException(String errorMessage, int errorCode) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " " + errorMessage;
    }

    @Override
    public String getLocalizedMessage() {
        if (errorCode == 3911) {
            return "Invalid Balanced " + errorMessage;
        } else if (errorCode == 6282) {
            return "Over Balanced " + errorMessage;
        } else {
            return "Contact with Vendor " + errorMessage;
        }

    }
}
