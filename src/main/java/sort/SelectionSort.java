package sort;

public class SelectionSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        this.sortInPlace(array);
        return array;
    }

    @Override
    public void sortInPlace(int[] array) {
        int n = array.length;

        for(int i = 0; i < n; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }
}
