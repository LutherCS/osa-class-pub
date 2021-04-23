package schedulermem;

/**
 * @author [name]
 */
public class MemoryScheduler {

    private int pageFaultCount;

    public MemoryScheduler(int frames) {
        this.pageFaultCount = 0;
    }

    public int getPageFaultCount() {
        return this.pageFaultCount;
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

}
