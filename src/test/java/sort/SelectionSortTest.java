package sort;

public class SelectionSortTest extends SortAlgorithmTest {

    @Override
    protected SortAlgorithm createInstance() {
        return new SelectionSort();
    }
}