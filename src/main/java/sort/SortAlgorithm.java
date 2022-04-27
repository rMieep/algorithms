package sort;

public interface SortAlgorithm {
    void sort(int[] array);

    default void swap(int[] array, int i, int j) {
        if(array == null) {
            throw new IllegalArgumentException("array=null");
        }

        if(i >= array.length || j >= array.length) {
            throw new IllegalArgumentException(String.format("array.length=%s, i=%s, j=%s", array.length, i, j));
        }

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
