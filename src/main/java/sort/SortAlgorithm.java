package sort;

public interface SortAlgorithm {
    int[] sort(int[] array);
    void sortInPlace(int[] array);

    default void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
