package Java7;

/**
 * Class to understand Threads which are created by extending Thread class.
 * If we extend Thread class, then we cannot extend any other class.
 * 
 *  To start the thread you need to invoke the start().
 *  run() contains our logic.
 *  
 * @author prithviMandula
 */
class ExtendingThread extends Thread{

    /**
     * Constructor
     */
    public ExtendingThread() {}

    /**
     * Constructor to invoke the super Thread class and to invoke start method
     * 
     * @param threadName Name of the thread
     */
    public ExtendingThread(String threadName) {
        super(threadName);
        start();
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
 * Class to understand Threads which are created by extending Thread class.
 * 
 * @author prithviMandula
 */
public class ExtendingThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExtendingThread(), "Thread 1");
        Thread thread2 = new Thread(new ExtendingThread(), "Thread 2");
        Thread thread3 = new Thread(new ExtendingThread());
        Thread thread4 = new Thread(new ExtendingThread());
        ExtendingThread thread5 = new ExtendingThread("Thread 3");
        ExtendingThread thread6 = new ExtendingThread("Thread 6");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
