package schedulerproc;

/**
 *
 * @author
 * @version
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 * Process scheduler
 * 
 * readyQueue is a list of processes ready for execution
 * rrQuantum is the time quantum used by round-robin algorithm
 * add() and clear() are wrappers around ArrayList methods
 */
public class ProcessScheduler {

    private final ArrayList<SimpleProcess> readyQueue;
    private int rrQuantum;

    public ProcessScheduler() {
        this.readyQueue = new ArrayList<>();
        this.rrQuantum = 0;
    }

    public void add(SimpleProcess newProcess) {
        this.readyQueue.add(newProcess);
    }

    public void clear() {
        this.readyQueue.clear();
    }

    /**
     * FCFS scheduling algorithm implementation
     *
     * @return average waiting time for all processes
     */
    public double useFirstComeFirstServe() {
        throw new UnsupportedOperationException();
    }

    /**
     * SJF scheduling algorithm implementation
     *
     * @return average waiting time for all processes
     */
    public double useShortestJobFirst() {
        throw new UnsupportedOperationException();
    }

    /**
     * Priority scheduling algorithm implementation
     *
     * @return average waiting time for all processes
     */
    public double usePriorityScheduling() {
        throw new UnsupportedOperationException();
    }

    /**
     * Round-robin scheduling algorithm implementation
     *
     * @return average waiting time for all processes
     */
    public double useRoundRobin(int rrQuantum) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        System.out.printf("Project 5");
    }
}
