package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUnitTest {
    @Test
    public void testAddition() {
        int a = 2, b = 3;
        assertEquals(5, a + b);
    }
}
