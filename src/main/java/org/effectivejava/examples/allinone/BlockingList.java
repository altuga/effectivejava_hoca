// ITEM 81
package org.effectivejava.examples.allinone;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BlockingList<T> {

    /*
    *
    *  1 -  If you use LinkedList, ArrayList ... then synchronization is your responsibility
    *  2 -  Always use the wait inside a loop;
    */

    private Queue<T> queue = new LinkedList<>();
    private int capacity;

    public BlockingList(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(T element) throws InterruptedException {
        while(queue.size() == capacity) {
            /*
            Always use the wait inside a loop;
            */
            wait();
        }

        queue.add(element);
        notify(); // 3 - notifyAll() for multiple producer/consumer threads
    }

    public synchronized T take() throws InterruptedException {
        while(queue.isEmpty()) {
            /*
            Always use the wait inside a loop;
            */
            wait();
        }

        T item = queue.remove();
        notify(); // notifyAll() for multiple producer/consumer threads
        return item;
    }
}