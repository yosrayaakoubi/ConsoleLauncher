import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void testMultiply() {
        int result = 2 * 3;
        assertEquals(6, result, "2 * 3 should equal 6");
    }
}
