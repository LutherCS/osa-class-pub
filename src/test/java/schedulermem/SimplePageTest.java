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
public class SimplePageTest {

    private SimplePage instance;
    private SimplePage instance1;
    private SimplePage instance2;

    public SimplePageTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.instance = new SimplePage(0);
        this.instance1 = new SimplePage(1);
        this.instance2 = new SimplePage(1);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPageId method, of class SimplePage.
     */
    @Test
    public void testGetPageId() {
        System.out.println("getPageId");
        assertEquals(0, instance.getPageId());
    }

    /**
     * Test of equals method, of class SimplePage.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        assertEquals(instance1, instance2);
    }

    /**
     * Test of hashCode method, of class SimplePage.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        assertEquals(39, instance.hashCode());
        assertEquals(40, instance1.hashCode());
        assertEquals(40, instance2.hashCode());
    }

    /**
     * Test of toString method, of class SimplePage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals("[0]", instance.toString());
        assertEquals("[1]", instance1.toString());
        assertEquals("[1]", instance2.toString());
    }

}
