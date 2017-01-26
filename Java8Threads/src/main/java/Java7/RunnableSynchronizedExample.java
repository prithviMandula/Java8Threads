package Java7;

import common.PrintData;

/**
 * Class to understand synchronization in Threads which are created by implementing Runnable interface.
 * If we implement Runnable interface, then we can implement any number of Interfaces.
 * 
 *  To start the thread you need to invoke the start().
 *  run() contains our logic.
 *  
 * @author prithviMandula
 */
class RunnableSynchronized implements Runnable, Test {

    Thread runner;
    PrintData printData;

    /**
     * Constructor
     */
    public RunnableSynchronized() {}

    /**
     * Constructor to create new thread and to invoke start method
     * 
     * @param threadName Name of the thread
     * @param printData {@code PrintCount} object
     */
    public RunnableSynchronized(String threadName, PrintData data) {
        runner = new Thread(this, threadName);
        runner.start();
        printData = data;
    }

    /**
     * run method which contains our logic(Print data)
     */
    public void run() {
        synchronized(printData) {
            printData.printNumbers();
        }
    }
}

/**
 * Class to understand synchronization in Threads which are created by implementing Runnable interface.
 * 
 * @author prithviMandula
 */
public class RunnableSynchronizedExample {
    public static void main(String[] args) {
        PrintData Pd = new PrintData();
        RunnableSynchronized thread1 = new RunnableSynchronized("Thread 1", Pd);
        RunnableSynchronized thread2 = new RunnableSynchronized("Thread 2", Pd);
        RunnableSynchronized thread3 = new RunnableSynchronized("Thread 3", Pd);
        RunnableSynchronized thread4 = new RunnableSynchronized("Thread 4", Pd);
        RunnableSynchronized thread5 = new RunnableSynchronized("Thread 5", Pd);
        RunnableSynchronized thread6 = new RunnableSynchronized("Thread 6", Pd);
    }
}
