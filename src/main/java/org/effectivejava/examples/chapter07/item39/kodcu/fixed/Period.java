// Broken "immutable" time period class - Page 184
package org.effectivejava.examples.chapter07.item39.kodcu.fixed;

import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;


    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
    }

    public Date start() {
        return start;
    }


    public Date end() {
        return new Date(end.getTime());
    }

    public String toString() {
        return start + " - " + end;
    }

    // Remainder omitted
}