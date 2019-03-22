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
        for (long i = 0; i <= upper; i++) {
            sum = sum + i;
        }
        sumValue.setSum(sum);
    }
}


public class DriverSummation {
    public static void main(String[] args) {
        long upper = 0;
        Sum sumObject = new Sum();
        // Vector<Thread> threads = new Vector<>();

        if (args.length > 0) {
            if (Long.parseLong(args[0]) < 0) {
                System.err.println("Parameter must be positive");
            } else {
                upper = Long.parseLong(args[0]);
            }
        } else {
            Scanner console = new Scanner(System.in);
            System.out.printf("Enter a number%n");
            upper = console.nextLong();
            console.close();
        }
        Thread thrd = new Thread(new Summation(upper, sumObject));
        thrd.start();

        try {
            thrd.join();
            System.out.printf("the sum of %d is %d%n", upper, sumObject.getSum());
        } catch (InterruptedException ie) {
            System.err.printf("%s%n", ie.toString());
        }
    }
}
