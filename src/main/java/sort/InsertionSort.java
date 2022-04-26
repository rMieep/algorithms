package sort;

public class InsertionSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        this.sortInPlace(array);
        return array;
    }

    @Override
    public void sortInPlace(int[] array) {
        int n = array.length;

        for(int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
        }
    }
}
