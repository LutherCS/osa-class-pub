package schedulermem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Roman Yasinovskyy
 * @version 2026.5.9
 */
public class MemorySchedulerTest {

    private MemoryScheduler scheduler3;
    private MemoryScheduler scheduler4;

    public MemorySchedulerTest() {
        scheduler3 = new MemoryScheduler(3);
        scheduler4 = new MemoryScheduler(4);
    }

    @AfterEach
    public void tearDown() {
        scheduler3.reset();
        scheduler4.reset();
    }

    /**
     * Testing FIFO scheduling algorithm on 3 frames
     */
    @ParameterizedTest(name = "Reference string {0} yields {1} page faults")
    @CsvSource({ "'7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1', 15",
            "'7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1', 15",
            "'1,2,3,4,1,2,5,1,2,3,4,5', 9",
            "'3,4,1,2,3,4,0,3,4,1,2,0,4,3,4,1,2,0', 14" })
    public void testUseFIFO3(String referenceString, int expectedFaults) {
        System.out.println("Using FIFO with 3 frames");

        scheduler3.useFIFO(referenceString);
        assertEquals(expectedFaults, scheduler3.getPageFaultCount());
    }

    /**
     * Testing FIFO scheduling algorithm on 4 frames
     */
    @ParameterizedTest(name = "Reference string {0} yields {1} page faults")
    @CsvSource({ "'7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1', 10",
            "'7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1', 12",
            "'1,2,3,4,1,2,5,1,2,3,4,5', 10",
            "'3,4,1,2,3,4,0,3,4,1,2,0,4,3,4,1,2,0', 15" })
    public void testUseFIFO4(String referenceString, int expectedFaults) {
        System.out.println("Using FIFO with 4 frames");

        scheduler4.useFIFO(referenceString);
        assertEquals(expectedFaults, scheduler4.getPageFaultCount());
    }

    /**
     * Testing Optimal scheduling algorithm on 3 frames
     */
    @ParameterizedTest(name = "Reference string {0} yields {1} page faults")
    @CsvSource({ "'7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1', 9",
            "'7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1', 11",
            "'1,2,3,4,1,2,5,1,2,3,4,5', 7",
            "'3,4,1,2,3,4,0,3,4,1,2,0,4,3,4,1,2,0', 10" })
    public void testUseOPT3(String referenceString, int expectedFaults) {
        System.out.println("Using Optimal with 3 frames");

        scheduler3.useOPT(referenceString);
        assertEquals(expectedFaults, scheduler3.getPageFaultCount());
    }

    /**
     * Testing Optimal scheduling algorithm on 4 frames
     */
    @ParameterizedTest(name = "Reference string {0} yields {1} page faults")
    @CsvSource({ "'7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1', 8",
            "'7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1', 10",
            "'1,2,3,4,1,2,5,1,2,3,4,5', 6",
            "'3,4,1,2,3,4,0,3,4,1,2,0,4,3,4,1,2,0', 7" })
    public void testUseOPT4(String referenceString, int expectedFaults) {
        System.out.println("Using Optimal with 4 frames");

        scheduler4.useOPT(referenceString);
        assertEquals(expectedFaults, scheduler4.getPageFaultCount());
    }

    /**
     * Testing LRU scheduling algorithm on 3 frames
     */
    @ParameterizedTest(name = "Reference string {0} yields {1} page faults")
    @CsvSource({ "'7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1', 12",
            "'7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1', 13",
            "'1,2,3,4,1,2,5,1,2,3,4,5', 10",
            "'3,4,1,2,3,4,0,3,4,1,2,0,4,3,4,1,2,0', 15" })
    public void testUseLRU3(String referenceString, int expectedFaults) {
        System.out.println("Using LRU with 3 frames");

        scheduler3.useLRU(referenceString);
        assertEquals(expectedFaults, scheduler3.getPageFaultCount());
    }

    /**
     * Testing LRU scheduling algorithm on 4 frames
     */
    @ParameterizedTest(name = "Reference string {0} yields {1} page faults")
    @CsvSource({ "'7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1', 8",
            "'7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1', 12",
            "'1,2,3,4,1,2,5,1,2,3,4,5', 8",
            "'3,4,1,2,3,4,0,3,4,1,2,0,4,3,4,1,2,0', 12" })
    public void testUseLRU4(String referenceString, int expectedFaults) {
        System.out.println("Using LRU with 4 frames");

        scheduler4.useLRU(referenceString);
        assertEquals(expectedFaults, scheduler4.getPageFaultCount());
    }

    /**
     * Testing getPageFaultCount method
     */
    @Test
    public void testGetPageFaultCount() {
        System.out.println("getPageFaultCount");
        assertEquals(0, scheduler3.getPageFaultCount());
        assertEquals(0, scheduler4.getPageFaultCount());
    }

}
