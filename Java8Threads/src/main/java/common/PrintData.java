package common;

/**
 * Class representing methods to print data
 * @author prithviMandula
 *
 */
public class PrintData {

    public void printNumbers() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
