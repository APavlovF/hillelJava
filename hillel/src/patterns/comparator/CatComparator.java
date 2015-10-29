package patterns.comparator;

import OOP.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by APavlov on 29.10.2015.
 */
public class CatComparator {
    public static void main(String[] args) {

        Cat tom = new Cat(false, 4, "Tom", "black");
        Cat murzik = new Cat(true, 3, "Murzik", "white");
        Cat barsik = new Cat(false, 6, "Barsik", "blue");

        List<Cat> cats = new ArrayList<>();
        cats.add(tom);
        cats.add(murzik);
        cats.add(barsik);

        System.out.println("before sort: ");
        print(cats);
        Collections.sort(cats);

        System.out.println("after sort: ");
        print(cats);

        Collections.sort(cats, new SortByAge());
        System.out.println("Sort by age: ");
        print(cats);

        Collections.sort(cats, new Reversed(new SortByAge()));
        System.out.println("Sort by age: ");
        print(cats);

    }

    public static void print(List<Cat> cats) {
        cats.forEach(System.out::println);
    }
}
