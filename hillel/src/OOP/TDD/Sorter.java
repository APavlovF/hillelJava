package OOP.TDD;

import java.util.Arrays;

/**
 * Created by APavlov on 19.10.2015.
 */
public class Sorter {

    public Comparable[] sort(Comparable[] array) {
        Comparable[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copy.length; i++) {
            for (int j = i + 1; j < copy.length; j++) {

                Comparable first = copy[i];
                Comparable second = copy[j];

                int g = first.compareTo(second);

                if (g > 0) {
                    int temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        return copy;
    }

    public int[] sort(int[] array) {
        //if(true) return array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
