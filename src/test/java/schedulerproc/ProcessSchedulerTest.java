package schedulerproc;

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
public class ProcessSchedulerTest {

    public ProcessSchedulerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of useFirstComeFirstServe method, of class ProcessScheduler.
     */
    @Test
    public void testUseFirstComeFirstServe() {
        System.out.println("useFirstComeFirstServe");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(24, 0, 0));
        instance.add(new SimpleProcess(3, 0, 0));
        instance.add(new SimpleProcess(3, 0, 0));

        double expResult = 17.0;
        double result = instance.useFirstComeFirstServe();

        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of useFirstComeFirstServe method, of class ProcessScheduler.
     */
    @Test
    public void testUseFirstComeFirstServe2() {
        System.out.println("useFirstComeFirstServe");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(9, 0, 1));
        instance.add(new SimpleProcess(5, 0, 2));
        instance.add(new SimpleProcess(4, 0, 3));
        instance.add(new SimpleProcess(6, 0, 4));
        instance.add(new SimpleProcess(8, 0, 5));

        double expResult = 13.0;
        double result = instance.useFirstComeFirstServe();

        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of useShortestJobFirst method, of class ProcessScheduler.
     */
    @Test
    public void testUseShortestJobFirst() {
        System.out.println("useShortestJobFirst");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(24, 0, 1));
        instance.add(new SimpleProcess(3, 0, 2));
        instance.add(new SimpleProcess(3, 0, 3));

        double expResult = 3.0;
        double result = instance.useShortestJobFirst();

        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of useShortestJobFirst method, of class ProcessScheduler.
     */
    @Test
    public void testUseShortestJobFirst2() {
        System.out.println("useShortestJobFirst2");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(9, 0, 0));
        instance.add(new SimpleProcess(5, 0, 0));
        instance.add(new SimpleProcess(4, 0, 0));
        instance.add(new SimpleProcess(6, 0, 0));
        instance.add(new SimpleProcess(8, 0, 0));

        double expResult = 10.2;
        double result = instance.useShortestJobFirst();

        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of usePriorityScheduling method, of class ProcessScheduler.
     */
    @Test
    public void testUsePriorityScheduling() {
        System.out.println("usePriorityScheduling");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(24, 2, 1));
        instance.add(new SimpleProcess(3, 1, 2));
        instance.add(new SimpleProcess(3, 3, 3));

        double expResult = 10.0;
        double result = instance.usePriorityScheduling();

        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of usePriorityScheduling method, of class ProcessScheduler.
     */
    @Test
    public void testUsePriorityScheduling2() {
        System.out.println("usePriorityScheduling");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(9, 5, 0));
        instance.add(new SimpleProcess(5, 4, 0));
        instance.add(new SimpleProcess(4, 3, 0));
        instance.add(new SimpleProcess(6, 2, 0));
        instance.add(new SimpleProcess(8, 1, 0));

        double expResult = 12.6;
        double result = instance.usePriorityScheduling();

        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of useRoundRobin method, of class ProcessScheduler.
     */
    @Test
    public void testUseRoundRobin() {
        System.out.println("useRoundRobin");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(24, 0, 1));
        instance.add(new SimpleProcess(3, 0, 2));
        instance.add(new SimpleProcess(3, 0, 3));

        double expResult = 5.66;
        double result = instance.useRoundRobin(4);

        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of useRoundRobin method, of class ProcessScheduler.
     */
    @Test
    public void testUseRoundRobin2() {
        System.out.println("useRoundRobin");
        ProcessScheduler instance = new ProcessScheduler();
        instance.add(new SimpleProcess(9, 0, 0));
        instance.add(new SimpleProcess(5, 0, 0));
        instance.add(new SimpleProcess(4, 0, 0));
        instance.add(new SimpleProcess(6, 0, 0));
        instance.add(new SimpleProcess(8, 0, 0));

        double expResult = 19.0;
        double result = instance.useRoundRobin(4);

        assertEquals(expResult, result, 0.01);
    }
}
