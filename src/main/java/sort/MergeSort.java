package sort;

public class MergeSort implements SortAlgorithm {

    @Override
    public void sort(int[] array) {
        if(array == null) {
            throw new IllegalArgumentException("array=null");
        }

        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;

            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
        int mergedIndex = left;
        int leftPartitionIndex = 0;
        int rightPartitionIndex = middle + 1;
        int[] leftPartition = new int[middle - left + 1];
        System.arraycopy(array, left, leftPartition, 0, middle - left + 1);

        while(leftPartitionIndex < leftPartition.length && rightPartitionIndex <= right) {
            if(leftPartition[leftPartitionIndex] < array[rightPartitionIndex]) {
                array[mergedIndex] = leftPartition[leftPartitionIndex];
                mergedIndex++;
                leftPartitionIndex++;
            } else {
                array[mergedIndex] = array[rightPartitionIndex];
                mergedIndex++;
                rightPartitionIndex++;
            }
        }

        while(leftPartitionIndex < leftPartition.length) {
            array[mergedIndex] = leftPartition[leftPartitionIndex];
            mergedIndex++;
            leftPartitionIndex++;
        }

        while(rightPartitionIndex <= right) {
            array[mergedIndex] = array[rightPartitionIndex];
            mergedIndex++;
            rightPartitionIndex++;
        }
    }
}
