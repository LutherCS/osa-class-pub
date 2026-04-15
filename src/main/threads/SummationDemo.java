package threads;

/**
 * Multi-threaded Java summation
 **/

import java.util.Scanner;
import java.util.Vector;

class Sum {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

}

class Summation implements Runnable {
    private long upper;
    private Sum sumValue;

    public Summation(long upper, Sum sumValue) {
        this.upper = upper;
        this.sumValue = sumValue;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i <= upper; i++) {
            sum = sum + i;
        }
        sumValue.setSum(sum);
    }
}

public class SummationDemo {
    public static void main(String[] args) {
        long t;
        Sum sumObject = new Sum();
        // Vector<Thread> threads = new Vector<>();
        if (args.length != 1) {
            System.err.println("usage: java DriverSummation [number]");
            System.exit(-1);
        }

        long number = Long.parseLong(args[0]);
        if (number < 0) {
            System.err.printf("%d must be positive\n", number);
            System.exit(-1);
        }

        t = System.nanoTime();
        Thread thrd = new Thread(new Summation(number, sumObject));
        thrd.start();

        try {
            thrd.join();
            t = System.nanoTime() - t;
            System.out.printf("sum is %d%n", sumObject.getSum());
            System.out.printf("calculated in %d μs\n", t / 1000);
        } catch (InterruptedException ie) {
            System.err.printf("%s%n", ie.toString());
        }
    }
}
