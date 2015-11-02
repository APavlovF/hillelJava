package collections.mutableState;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by APavlov on 02.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        carDreams();

        String s = "asd";
        String copy = s;
        s += "aaa";

        System.out.println(copy == s);

        Integer i = 255;
        Integer copyI = i;
        i++;
        System.out.println(i);
        copyI = 256;
        System.out.println(i == copyI);


    }

    private static void carDreams() {
        Set<Car> dreamList = new TreeSet<>(new CarComparator());

        Car peterDream = new Car("Mercedes-Benz", 2014);
        Car ivanDream = new Car("Audi", 2013);
        Car alexDream = new Car("Porsche", 2015);

        dreamList.add(ivanDream);
        dreamList.add(peterDream);
        dreamList.add(alexDream);

        System.out.println(dreamList);
        /*
        dreamList.remove(alexDream);
        alexDream.model = "Acura";
        dreamList.add(alexDream);
        */
        System.out.println("ivan dream is in list: " + dreamList.contains(ivanDream));
        System.out.println("peter dream is in list: " + dreamList.contains(peterDream));
        System.out.println("alex dream is in list: " + dreamList.contains(alexDream));

        System.out.println(dreamList);

        dreamList.remove(alexDream);
        alexDream = new Car("Porsche", 2015);
        dreamList.add(alexDream);

        Set<Car> hashedCars = new HashSet<>();
        hashedCars.add(alexDream);
        hashedCars.add(peterDream);
        hashedCars.add(ivanDream);

        Car seekedCar = new Car("Porsche", 2015);

        System.out.println("hashcode is: " + seekedCar.hashCode());
        System.out.println("hashset contains porsche: " + hashedCars.contains(seekedCar));

        System.out.println(peterDream.hashCode());

    }
}
