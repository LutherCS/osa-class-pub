import java.util.Scanner;

class Sum {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}
class Summation implements Runnable {
    private int upper;
    private Sum sumValue;

    public Summation(int upper, Sum sumValue) {
        this.upper = upper;
        this.sumValue = sumValue;
    }
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= upper; i++) {
            sum = sum + i;
        }
        sumValue.setSum(sum);
    }
}


public class DriverSummation {
    public static void main(String[] args) {
        int upper = 0;
        Sum sumObject = new Sum();

        if (args.length > 0) {
            if (Integer.parseInt(args[0]) < 0) {
                System.err.println("Parameter must be positive");
            } else {
                upper = Integer.parseInt(args[0]);
            }
        } else {
            Scanner console = new Scanner(System.in);
            System.out.printf("Enter a number%n");
            upper = console.nextInt();
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
