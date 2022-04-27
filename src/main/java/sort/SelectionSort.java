package sort;

public class SelectionSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        if(array == null) {
            throw new IllegalArgumentException("array=null");
        }

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
