// ITEM 82
package org.effectivejava.examples.allinone;

import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import java.util.Collections;
import java.util.HashMap;

@NotThreadSafe
@Immutable
public class CalculateItems {

    private final int key;
    private final int value;

    public CalculateItems(int key, int value) {
        this.key = key;
        this.value = value;
    }
    // TODO : what makes thread safe ?
    public void process() {
        // ...
    }
}
