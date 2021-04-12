package schedulerproc;
/**
 * @author yasiro01
 */
import java.util.Comparator;

/**
 * Simple process
 * 
 * nextBurst - next burst of execution of the process
 * priority - process priority
 * arrivaltime - time of arrival into the queue (not used)
 */
public class SimpleProcess {
    private final int nextBurst;
    private final int priority;
    private final int arrivalTime;

    public SimpleProcess(int nextBurst, int priority, int arrivalTime) {
        this.nextBurst = nextBurst;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
    }

    public int getNextBurst() {
        return this.nextBurst;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getArrivalTime() {
        return this.arrivalTime;
    }
}
