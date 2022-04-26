package sort;

public interface SortAlgorithm {
    void sort(int[] array);

    default void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
