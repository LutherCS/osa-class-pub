package schedulermem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author Roman Yasinovskyy
 * @version 2026.5.9
 */
public class SimplePageTest {

    static Stream<Arguments> pageMaker() {
        return Stream.of(
                Arguments.of(new SimplePage(0), 0, 226, "[0]"),
                Arguments.of(new SimplePage(1), 1, 2, "[1]"),
                Arguments.of(new SimplePage(1), 1, 2, "[1]"));
    }

    /**
     * Testing the page class
     */
    @ParameterizedTest(name = "{3} is a page with id {1} and hash {2}")
    @MethodSource("pageMaker")
    public void testGetPageProperties(SimplePage p, int pageId, int pageHash, String pageStr) {
        System.out.println("Checking page properties");
        assertEquals(pageId, p.getPageId());
        assertEquals(pageHash, p.hashCode());
        assertEquals(pageStr, p.toString());
    }

    /**
     * Testing page comparison
     */
    @Test
    public void testEquals() {
        System.out.println("Checking page comparison");
        SimplePage page1 = new SimplePage(1);
        SimplePage page2 = new SimplePage(1);
        assertEquals(page1, page2);
    }

}
