package sort;

public class InsertionSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        if(array == null) {
            throw new IllegalArgumentException("array=null");
        }

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
