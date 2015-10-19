package OOP.TDD;

import OOP.Cat;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by APavlov on 19.10.2015.
 */
public class SortingTest {

    @Test
    public void sortInAscendingOrder() {
        Integer[] unsorted = {111, 999, 888, 444, 666, 333, 222, 555, 777};

        Sorter sorter = new Sorter();
        Integer[] sorted = (Integer[]) sorter.sort(unsorted);

        Integer[] expected = {111, 222, 333, 444, 555, 666, 777, 888, 999};

        Assert.assertArrayEquals("Sorting is broken", expected, sorted);

       /* if (Arrays.equals(sorted, expected)) {
            System.out.println("Sorting is ok");
        } else {
            System.out.println("Sorting is broken. Expected: " + Arrays.toString(expected) + ", but found: " + Arrays.toString(sorted));
        } */
    }

    @Test
    public void catShouldBeSortedByName() {
        Cat cat = new Cat(false, 2, "Tom", "black");
        Cat cat2 = new Cat(false, 2, "Cat's name", "black");

        Cat[] cats = new Cat[2];
        cats[0] = cat;
        cats[1] = cat2;

        Sorter sorter = new Sorter();
        Cat[] sorted = (Cat[]) sorter.sort(cats);

        Cat[] expected = {cat2, cat};

        Assert.assertArrayEquals("Cats aren't sorted", expected, sorted);
    }

    @Test
    public void sourceArrayShouldBeUnsorted() {
        Integer[] unsorted = {111, 999, 888, 444, 666, 333, 222, 555, 777};
        Integer[] expected = {111, 999, 888, 444, 666, 333, 222, 555, 777};

        Sorter sorter = new Sorter();
        sorter.sort(unsorted);

        Assert.assertArrayEquals("Source array is sorted", expected, unsorted);
    }

}
