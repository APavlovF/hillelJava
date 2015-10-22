package collections;

import OOP.Cat;
import OOP.Kitten;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by APavlov on 22.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        //rawList();
        //genericsAndCollections();
        List<Cat> cats = new ArrayList<>();

        Set<Cat> catSet = new TreeSet<>();

        catSet.add(new Cat(false, 10, "Tom", "white"));
        catSet.add(new Cat(false, 5, "Tom", "black"));
        catSet.add(new Cat(false, 10, "Murzik", "black"));
        System.out.println(catSet.size());

        System.out.println("sorted cats:");
        for (Cat cat : catSet) {
            System.out.println(cat);
        }
    }


    private static void genericsAndCollections() {
        ArrayList<Cat> cats = new ArrayList<>(); //generic
        cats.add(new Cat(false, 10, "Tom", "white"));
        //cats.add(10);  error
        cats.add(new Kitten(false, 10, "Tom", "white"));

        Cat cat = cats.get(0);
        Object o = cats.get(1);
    }

    private static void rawList() {
        ArrayList list = new ArrayList();
        list.add(new Cat(false, 10, "Tom", "black"));
        list.add(10);
        list.add("word");
/*
        for (Object o : list) {
            System.out.println(o);
        }

        list.forEach(System.out::println);
*/
        Cat cat = (Cat) list.get(0);
        Integer i = (Integer) list.get(1);
        String s = (String) list.get(2);
    }
}
