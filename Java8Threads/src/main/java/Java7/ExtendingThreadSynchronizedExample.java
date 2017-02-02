package Java7;

import common.PrintData;

/**
 * Class to understand synchronization in Threads which are created by extending Thread class.
 * If we extend Thread class, then we cannot extend any other class.
 * 
 *  To start the thread you need to invoke the start().
 *  run() contains our logic.
 * @author prithviMandula
 *
 */
class ExtendingThreadSynchronized extends Thread{

    PrintData Pd;

    /**
     * Constructor
     */
    public ExtendingThreadSynchronized() {}

    /**
     * Constructor to invoke the super Thread class and to invoke start method
     * 
     * @param threadName Name of the thread
     * @param printData {@code PrintData} object
     */
    public ExtendingThreadSynchronized(String threadName, PrintData printData) {
        super(threadName);
        Pd = printData;
        start();
    }

    /**
     * run method which contains our logic(Print numbers)
     */
    public void run() {
        synchronized(Pd) {
            Pd.printNumbers();
        }
    }
}

/**
 * Class to understand synchronization in Threads which are created by extending Thread class.
 * 
 * @author prithviMandula
 */
public class ExtendingThreadSynchronizedExample {

    public static void main(String[] args) {
        PrintData Pd = new PrintData();
        ExtendingThreadSynchronized thread1 = new ExtendingThreadSynchronized("Thread 1", Pd);
        ExtendingThreadSynchronized thread2 = new ExtendingThreadSynchronized("Thread 2", Pd);
        ExtendingThreadSynchronized thread3 = new ExtendingThreadSynchronized("Thread 3", Pd);
        ExtendingThreadSynchronized thread4 = new ExtendingThreadSynchronized("Thread 4", Pd);
        ExtendingThreadSynchronized thread5 = new ExtendingThreadSynchronized("Thread 5", Pd);
    }
}
