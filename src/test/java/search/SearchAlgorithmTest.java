package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public abstract class SearchAlgorithmTest {

    protected abstract SearchAlgorithm createInstance();

    @Test
    public void testSearchAlgorithmThrows() {
        SearchAlgorithm algorithm = createInstance();
        int value = 3;
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> algorithm.search(null, value)
        );
    }

    @Test
    public void testSearchAlgorithmValuePresent() {
        SearchAlgorithm algorithm = createInstance();
        int value = 3;
        int[] array = new int[]{8, 6, 4, 1, 5, 2, 7, 3, 9};
        int index = algorithm.search(array, value);
        Assertions.assertEquals(7, index);
    }

    @Test
    public void testSearchAlgorithmValueNotPresent() {
        SearchAlgorithm algorithm = createInstance();
        int value = 12;
        int[] array = new int[]{8, 6, 4, 1, 5, 2, 7, 3, 9};
        int index = algorithm.search(array, value);
        Assertions.assertEquals(-1, index);
    }


}
