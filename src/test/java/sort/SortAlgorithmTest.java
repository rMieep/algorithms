package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public abstract class SortAlgorithmTest {

    protected abstract SortAlgorithm createInstance();

    @Test
    public void testSortAlgorithm() {
        SortAlgorithm algorithm = createInstance();
        int[] array = algorithm.sort(new int[]{3, 6, 4, 1, 2, 5, 7, 8, 9});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
    }

    @Test
    public void testSortAlgorithmInPlace() {
        SortAlgorithm algorithm = createInstance();
        int[] array = new int[]{3, 6, 4, 1, 2, 5, 7, 8, 9};
        algorithm.sortInPlace(array);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
    }

    @Test
    public void testSwap() {
        SortAlgorithm algorithm = createInstance();
        int[] array = new int[]{2,1};
        algorithm.swap(array, 0, 1);
        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(2, array[1]);
    }
}
