package sort;

public class QuickSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        this.sortInPlace(array);
        return array;
    }

    @Override
    public void sortInPlace(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if(left < right) {
            int middle = partition(array, left, right);

            sort(array, left, middle - 1);
            sort(array, middle + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for(int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, j, i);
            }
        }
        swap(array, i + 1, right);

        return i + 1;
    }
}
