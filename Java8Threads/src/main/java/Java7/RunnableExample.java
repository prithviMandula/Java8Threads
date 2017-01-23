package Java7;

/**
 * Class to understand Threads which are created by implementing Runnable interface.
 * If we implement Runnable interface, then we cannot implement any other interface.
 * 
 *  To start the thread you need to invoke the start().
 *  run() contains our logic.
 *  
 * @author prithviMandula
 */
class RunnableThread implements Runnable {

    Thread runner;

    /**
     * Constructor
     */
    public RunnableThread() {}

    /**
     * Constructor to create thread and to invoke start method
     * 
     * @param threadName Name of the thread
     */
    public RunnableThread(String threadName) {
        runner = new Thread(this, threadName);
        runner.start();
    }

    /**
     * run method which contains our logic(Print numbers)
     */
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

/**
 * Class to understand Threads which are created by implementing Runnable interface.
 * 
 * @author prithviMandula
 */
public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableThread(), "Thread 1");
        Thread thread2 = new Thread(new RunnableThread(), "Thread 2");
        Thread thread3 = new Thread(new RunnableThread(), "Thread 3");
        Thread thread4 = new Thread(new RunnableThread(), "Thread 4");
        RunnableThread thread5 = new RunnableThread("Thread 5");
        RunnableThread thread6 = new RunnableThread("Thread 6");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}