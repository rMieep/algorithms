package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public abstract class SortAlgorithmTest {

    protected abstract SortAlgorithm createInstance();

    @Test
    public void testSortAlgorithm() {
        SortAlgorithm algorithm = createInstance();
        int[] array = new int[]{8, 6, 4, 1, 5, 2, 7, 3, 9};
        algorithm.sort(array);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
    }

    @Test
    public void testSortAlgorithmEmpty() {
        SortAlgorithm algorithm = createInstance();
        int[] array = new int[]{};
        algorithm.sort(array);
        Assertions.assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSortAlgorithmThrows() {
        SortAlgorithm algorithm = createInstance();
        Assertions.assertThrows(IllegalArgumentException.class, () -> algorithm.sort(null));
    }

    @Test
    public void testSwap() {
        SortAlgorithm algorithm = createInstance();
        int[] array = new int[]{2,1};
        algorithm.swap(array, 0, 1);
        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(2, array[1]);
    }

    @Test
    public void testSwapThrows() {
        SortAlgorithm algorithm = createInstance();
        int[] array = new int[]{2,1};
        Assertions.assertThrows(IllegalArgumentException.class, () -> algorithm.swap(null, 0, 1));
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> algorithm.swap(array, 3, 1),
                "array.length=2, i=3, j=1"
        );
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> algorithm.swap(array, 1, 3),
                "array.length=2, i=1, j=3"
        );
    }
}
