package foobar;

/**
 * Foobar testing
 *
 * @author Roman Yasinovskyy
 * @version 2025.2
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FoobarTest {

    public FoobarTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Testing Foobar");
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    static Stream<Arguments> numsProvider() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(3, 3),
                Arguments.of(10, 22),
                Arguments.of(100, 2632)
        );
    }

    /**
     * Test of check method, of class Foobar.
     * 
     * @param value: value to check
     * @param expResult: expected result
     */
    @ParameterizedTest
    @MethodSource("numsProvider")
    public void testCheck(int value, int expResult) {
        System.out.println("check");
        int result = new Foobar().check(value);
        assertEquals(expResult, result);
    }
}
