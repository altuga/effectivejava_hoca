package org.effectivejava.examples.chapter10.item66.fixedstopthread3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class StopThread {
    private static AtomicBoolean stopRequested = new AtomicBoolean();


    // Bu uygulama nasıl calisir ?
    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!stopRequested.get()) {
                    i++;
                }

                System.out.println(i);
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested.set(true);
    }
}
