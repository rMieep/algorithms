package search;

public class LinearSearch implements SearchAlgorithm {

    @Override
    public int search(int[] array, int value) {
        if(array == null) {
            throw new IllegalArgumentException("array=null");
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
