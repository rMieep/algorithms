package search;

public class BinarySearch implements SearchAlgorithm {

    @Override
    public int search(int[] array, int value) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while(leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            if(array[middleIndex] == value) {
                return middleIndex;
            } else if(array[middleIndex] > value) {
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
