import java.util.Arrays;

/**
 * Created by Oleksandr on 16.10.2015.
 */
public class SortArray {
    private int[] sortArray;
    private int size;

    SortArray(int size) {
        this.size = size;
        sortArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortArray[i] = (int) (Math.random() * 10);
        }
    }

    private void sort1() {
        for (int i = 0; i < sortArray.length; i++) {
            int minimum = sortArray[i];
            int minimumIndex = i;
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[j] < minimum) {
                    minimum = sortArray[j];
                    minimumIndex = j;
                }
            }
            if (i != minimumIndex) {
                int auxiliary = sortArray[i];
                sortArray[i] = sortArray[minimumIndex];
                sortArray[minimumIndex] = auxiliary;
            }
        }
    }
    public String sortedArray(){
        sort1();
        return Arrays.toString(sortArray);
    }

    @Override
    public String toString() {
        return "SortArray{" +
                "sortArray=" + Arrays.toString(sortArray) +
                '}';
    }
}
