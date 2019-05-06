package schedulerdisk;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author yasiro01
 */
public class DiskSchedulerTest {

    private DiskScheduler instance200;
    private DiskScheduler instance5000;
    private String requestQueue1;
    private String requestQueue2;

    public DiskSchedulerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance200 = new DiskScheduler(200, 53, 54);
        instance5000 = new DiskScheduler(5000, 143, 125);
        requestQueue1 = "98,183,37,122,14,124,65,67";
        requestQueue2 = "86,1470,913,1774,948,1509,1022,1750,130";
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTotalMoves method, of class DiskScheduler.
     */
    @Test(timeout=1000)
    public void testGetTotalMoves() {
        System.out.println("getTotalMoves");

        assertEquals(0, instance200.getTotalMoves());
        assertEquals(0, instance5000.getTotalMoves());
    }

    /**
     * Test of useFCFS method, of class DiskScheduler.
     */
    @Test(timeout=1000)
    public void testUseFCFS() {
        System.out.println("useFCFS");

        instance200.useFCFS(requestQueue1);
        instance5000.useFCFS(requestQueue2);

        assertEquals(640, instance200.getTotalMoves());
        assertEquals(0, instance5000.getTotalMoves());
    }

    /**
     * Test of useSSTF method, of class DiskScheduler.
     */
    @Test(timeout=1000)
    public void testUseSSTF() {
        System.out.println("useSSTF");

        instance200.useSSTF(requestQueue1);
        instance5000.useSSTF(requestQueue2);

        assertEquals(236, instance200.getTotalMoves());
        assertEquals(0, instance5000.getTotalMoves());  // Homework 11, question 6
    }

    /**
     * Test of useLOOK method, of class DiskScheduler.
     */
    @Test(timeout=1000)
    public void testUseLOOK() {
        System.out.println("useLOOK");

        instance200.useLOOK(requestQueue1);
        instance5000.useLOOK(requestQueue2);

        assertEquals(208, instance200.getTotalMoves());
        assertEquals(0, instance5000.getTotalMoves());  // Homework 11, question 8
    }

    /**
     * Test of useCLOOK method, of class DiskScheduler.
     */
    @Test(timeout=1000)
    public void testUseCLOOK() {
        System.out.println("useCLOOK");

        instance200.useCLOOK(requestQueue1);
        instance5000.useCLOOK(requestQueue2);

        assertEquals(322, instance200.getTotalMoves());
        assertEquals(0, instance5000.getTotalMoves());  // Homework 11, question 10
    }

}
