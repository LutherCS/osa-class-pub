package schedulerdisk;

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
public class SimpleRequestTest {

    SimpleRequest instance1;
    SimpleRequest instance2;

    public SimpleRequestTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance1 = new SimpleRequest(0);
        instance2 = new SimpleRequest(0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCylinder method, of class SimpleRequest.
     */
    @Test
    public void testGetCylinder() {
        System.out.println("getCylinder");

        assertEquals(0, instance1.getCylinder());
        assertEquals(0, instance2.getCylinder());
    }

    /**
     * Test of hashCode method, of class SimpleRequest.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");

        assertEquals(553, instance1.hashCode());
        assertEquals(553, instance2.hashCode());
    }

    /**
     * Test of equals method, of class SimpleRequest.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        assertEquals(instance1, instance2);
    }

    /**
     * Test of toString method, of class SimpleRequest.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

        assertEquals("[0]", instance1.toString());
        assertEquals("[0]", instance2.toString());
    }

}
