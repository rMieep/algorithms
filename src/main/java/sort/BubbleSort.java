package sort;

public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        this.sortInPlace(array);
        return array;
    }

    @Override
    public void sortInPlace(int[] array) {
        int n = array.length;

        for(int i = 1; i < n; i++) {
            boolean swapped = false;

            for(int j = 0; j < n - i; j++) {
                if(array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }

            if(!swapped) {
                return;
            }
        }
    }
}
