import org.junit.jupiter.api.Test;
import sorting.BubbleSort;
import sorting.ISort;
import sorting.QuickHoareSort;
import sorting.QuickLomutoSort;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    @Test
    void elementsShouldBeSortedByAscending() {
        var sortingAlgorithms = new ISort[]{
                new BubbleSort(),
                new QuickHoareSort(),
                new QuickLomutoSort()
        };

        var expected = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (ISort sortingAlgorithm : sortingAlgorithms) {
            var input1 = new Integer[]{2, 8, 0, 7, 1, 3, 9, 5, 6, 4};
            var input2 = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

            sortingAlgorithm.Sort(input1);
            assertArrayEquals(expected, input1, sortingAlgorithm.GetName() + " is failed on first input");
            sortingAlgorithm.Sort(input2);
            assertArrayEquals(expected, input2, sortingAlgorithm.GetName() + " is failed on second input");
        }
    }
}