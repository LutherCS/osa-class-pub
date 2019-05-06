package schedulerdisk;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author [name]
 */
public class DiskScheduler {

    private final int cylinders;
    private int currentCylinder;
    private final int previousCylinder;
    private int totalMoves;

    public DiskScheduler(int cylinders, int currentCylinder, int previousCylinder) {
        this.cylinders = cylinders;
        this.currentCylinder = currentCylinder;
        this.previousCylinder = previousCylinder;
        this.totalMoves = 0;
    }

    public int getTotalMoves() {
        return this.totalMoves;
    }

    public void useFCFS(String requestQueue) {
        throw new UnsupportedOperationException();
    }

    public void useSSTF(String requestQueue) {
        throw new UnsupportedOperationException();
    }

    public void useLOOK(String requestQueue) {
        throw new UnsupportedOperationException();
    }

    public void useCLOOK(String requestQueue) {
        throw new UnsupportedOperationException();
    }

}
