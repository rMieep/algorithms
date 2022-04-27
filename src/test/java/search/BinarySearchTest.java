package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest extends SearchAlgorithmTest {

    @Override
    protected SearchAlgorithm createInstance() {
        return new BinarySearch();
    }

    @Test
    @Override
    public void testSearchAlgorithmValuePresent() {
        SearchAlgorithm algorithm = createInstance();
        int value = 3;
        int[] array = new int[]{1, 2, 3, 4, 5, 7, 7, 8, 9};
        int index = algorithm.search(array, value);
        Assertions.assertEquals(2, index);
    }

    @Test
    @Override
    public void testSearchAlgorithmValueNotPresent() {
        SearchAlgorithm algorithm = createInstance();
        int value = 12;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = algorithm.search(array, value);
        Assertions.assertEquals(-1, index);
    }
}
