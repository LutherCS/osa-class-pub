package schedulermem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class MemorySchedulerTest {

    private MemoryScheduler instance3;
    private MemoryScheduler instance4;

    public MemorySchedulerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance3 = new MemoryScheduler(3);
        instance4 = new MemoryScheduler(4);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of useFIFO method, of class MemoryScheduler.
     */
    @Test
    public void testUseFIFO() {
        System.out.println("useFIFO");
        String referenceString = "7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1";

        instance3.useFIFO(referenceString);
        instance4.useFIFO(referenceString);

        assertEquals(15, instance3.getPageFaultCount());
        assertEquals(10, instance4.getPageFaultCount());
    }

    /**
     * Test of useFIFO method, of class MemoryScheduler.
     */
    @Test
    public void testUseFIFO2() {
        System.out.println("useFIFO");
        String referenceString = "7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1";

        instance3.useFIFO(referenceString);
        instance4.useFIFO(referenceString);

        assertEquals(15, instance3.getPageFaultCount());
        assertEquals(12, instance4.getPageFaultCount());
    }

    /**
     * Test of useFIFO method, of class MemoryScheduler.
     */
    @Test
    public void testUseFIFOBA() {
        System.out.println("useFIFO runs into Belady's anomaly");
        String referenceString = "1,2,3,4,1,2,5,1,2,3,4,5";

        instance3.useFIFO(referenceString);
        instance4.useFIFO(referenceString);

        assertEquals(9, instance3.getPageFaultCount());
        assertEquals(10, instance4.getPageFaultCount());
    }

    /**
     * Test of useFIFO method, of class MemoryScheduler.
     */
    @Test
    public void testUseFIFOBA2() {
        System.out.println("useFIFO runs into Belady's anomaly");
        String referenceString = "3,4,1,2,3,4,0,3,4,1,2,0,4,3,4,1,2,0";

        instance3.useFIFO(referenceString);
        instance4.useFIFO(referenceString);

        assertEquals(14, instance3.getPageFaultCount());
        assertEquals(15, instance4.getPageFaultCount());
    }

    /**
     * Test of useOPT method, of class MemoryScheduler.
     */
    @Test
    public void testUseOPT() {
        System.out.println("useOPT");
        String referenceString = "7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1";

        instance3.useOPT(referenceString);
        instance4.useOPT(referenceString);

        assertEquals(9, instance3.getPageFaultCount());
        assertEquals(8, instance4.getPageFaultCount());
    }

    /**
     * Test of useOPT method, of class MemoryScheduler.
     */
    @Test
    public void testUseOPT2() {
        System.out.println("useOPT");
        String referenceString = "7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1";

        instance3.useOPT(referenceString);
        instance4.useOPT(referenceString);

        assertEquals(11, instance3.getPageFaultCount());
        assertEquals(10, instance4.getPageFaultCount());
    }

    /**
     * Test of useLRU method, of class MemoryScheduler.
     */
    @Test
    public void testUseLRU() {
        System.out.println("useLRU");
        String referenceString = "7,0,1,2,0,3,0,4,2,3,0,3,0,3,2,1,2,0,1,7,0,1";

        instance3.useLRU(referenceString);
        instance4.useLRU(referenceString);

        assertEquals(12, instance3.getPageFaultCount());
        assertEquals(8, instance4.getPageFaultCount());
    }

    /**
     * Test of useLRU method, of class MemoryScheduler.
     */
    @Test
    public void testUseLRU2() {
        System.out.println("useLRU");
        String referenceString = "7,0,6,2,0,3,1,4,2,3,0,3,2,1,2,1,1,7,5,1";

        instance3.useLRU(referenceString);
        instance4.useLRU(referenceString);

        assertEquals(13, instance3.getPageFaultCount());
        assertEquals(12, instance4.getPageFaultCount());
    }

    /**
     * Test of getPageFaultCount method, of class MemoryScheduler.
     */
    @Test
    public void testGetPageFaultCount() {
        System.out.println("getPageFaultCount");
        assertEquals(0, instance3.getPageFaultCount());
        assertEquals(0, instance4.getPageFaultCount());
    }

}
