package patterns.iterator;

import OOP.Cat;
import collections.RecursiveLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by APavlov on 29.10.2015.
 */
public class MainIterator {
    public static void main(String[] args) {
        Cat tom = new Cat(false, 4, "Tom", "black");
        Cat murzik = new Cat(true, 3, "Murzik", "white");
        Cat barsik = new Cat(false, 6, "Barsik", "blue");

        RecursiveLinkedList cats = new RecursiveLinkedList();
        cats.add(tom);
        cats.add(murzik);
        cats.add(barsik);

        Iterator iterator = new RecursiveLinkedListIterator(cats);

        /*while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        List someList = new ArrayList<>();
        System.out.println("In forEach loop:");

        for (Object o : cats) {
            System.out.println(o);
        }

        Iterator iterator1 = cats.iterator();

        for (int i = 0; i < cats.size(); i++) {
            cats.get(i);
        }


    }
}
