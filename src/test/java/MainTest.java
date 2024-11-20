import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {

    @Test
    public void testSortArray() {
        int[] input = {13, 5, 3, 1, 8, 1, 2};
        int[] expected = {1, 1, 2, 3, 5, 8, 13};
        assertArrayEquals(expected, Main.sortArray(input));
    }
}
