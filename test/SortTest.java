import org.junit.jupiter.api.Test;
import sorting.BubbleSort;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    @Test
    void elementsShouldBeSortedByAscending() {
        var input = new Integer[]{3, 1, 2};
        var expected = new Integer[]{1, 2, 3};

        var actual = new BubbleSort().Sort(input);

        assertArrayEquals(expected, actual);
    }
}