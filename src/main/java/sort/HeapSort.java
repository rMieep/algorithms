package sort;

public class HeapSort implements SortAlgorithm {

    @Override
    public void sort(int[] array) {
        if(array == null) {
            throw new IllegalArgumentException("array=null");
        }

        int n = array.length;
        buildHeap(array, n);

        for(int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, 0, i);
        }
    }

    private void buildHeap(int[] array, int length) {
        int lastParent = (length - 1) / 2;
        for(int i = lastParent; i >= 0; i--) {
            heapify(array, i, length);
        }
    }

    private void heapify(int[] array, int index, int length) {
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;
        if(rightIndex < length) {
            int parent = array[index];
            int left = array[leftIndex];
            int right = array[rightIndex];
            if(left > parent || right > parent) {
                if(left > right) {
                    swap(array, index, leftIndex);
                    heapify(array, leftIndex, length);
                } else {
                    swap(array, index, rightIndex);
                    heapify(array, rightIndex, length);
                }
            }
        } else if(leftIndex < length) {
            if(array[leftIndex] > array[index]) {
                swap(array, index, leftIndex);
                heapify(array, leftIndex, length);
            }
        }
    }
}
