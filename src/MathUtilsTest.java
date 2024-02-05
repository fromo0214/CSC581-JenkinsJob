import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        int sum = 4 + 5;
        assertEquals(sum, 9);
    }

    @Test
    public void testSubtract() {
        int sum = 10 - 5;
        assertEquals(sum, 5);
    }

    @Test
    public void testMultiply() {
        int product = 5 * 2;
        assertEquals(product, 10);
    }

    @Test
    public void testDivide() {
        double quotient1 = 10 / 2;
        assertEquals(quotient1, 5.0);
    }
}
