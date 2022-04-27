package sort;

public class HeapSortTest extends SortAlgorithmTest {
    @Override
    protected SortAlgorithm createInstance() {
        return new HeapSort();
    }
}
