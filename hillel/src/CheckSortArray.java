import java.util.Arrays;

/**
 * Created by Oleksandr on 16.10.2015.
 */
public class CheckSortArray {
    public static void main(String[] args) {
        SortArray sortExample = new SortArray(10);
        System.out.println(sortExample);

        int[] myArray = {1, 2, 5 , 4, 1, 0, 25};

        String checkSortedArray = Arrays.toString(sortExample.sortedArray(myArray));
        System.out.println(checkSortedArray);

    }
}
