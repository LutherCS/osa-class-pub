package schedulerproc;

/**
 *
 * @author
 * @version
 */
import java.util.Comparator;

/**
 * Simple process
 * 
 * nextBurst - next burst of execution of the process
 * priority - process priority
 * arrivaltime - time of arrival into the queue (not used)
 */
public class SimpleProcess implements Comparable<SimpleProcess> {

    private int nextBurst;
    private final int priority;
    private final int arrivalTime;
    private int waitingTime;
    private int remainingTime;
    private int lastRunTime;

    public SimpleProcess(int nextBurst, int priority, int arrivalTime) {
        this.nextBurst = nextBurst;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.waitingTime = 0;
        this.remainingTime = nextBurst;
        this.lastRunTime = 0;
    }

    public int getNextBurst() {
        return this.nextBurst;
    }

    public void setNextBurst(int newValue) {
        throw new UnsupportedOperationException();
    }

    public int getPriority() {
        return this.priority;
    }

    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setWaitingTime(int newValue) {
        throw new UnsupportedOperationException();
    }

    public int getRemainingTime() {
        return this.remainingTime;
    }

    public void setRemainingTime(int newValue) {
        throw new UnsupportedOperationException();
    }

    public int getLastRunTime() {
        return this.lastRunTime;
    }

    public void setLastRunTime(int newValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(SimpleProcess sp) {
        throw new UnsupportedOperationException();
    }

    public static class Comparators {
        throw new UnsupportedOperationException();
    }
}
