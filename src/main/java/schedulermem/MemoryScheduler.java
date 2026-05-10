package schedulermem;

/**
 * @author
 * @version
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MemoryScheduler {

    private final ArrayList<SimplePage> memoryFrames;
    private int pageFaultCount;

    public MemoryScheduler(int frames) {
        this.memoryFrames = new ArrayList<>(Arrays.asList(new SimplePage[frames]));
        this.pageFaultCount = 0;
    }

    public int getPageFaultCount() {
        return this.pageFaultCount;
    }

    public void reset() {
        this.memoryFrames.clear();
    }

    public void useFIFO(String referenceString) {
        throw new UnsupportedOperationException();

    }

    public void useOPT(String referenceString) {
        throw new UnsupportedOperationException();
    }

    public void useLRU(String referenceString) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
    }
}
