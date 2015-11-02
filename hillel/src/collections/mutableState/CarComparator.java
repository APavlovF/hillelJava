package collections.mutableState;

import java.util.Comparator;

/**
 * Created by APavlov on 02.11.2015.
 */
public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {  //use of generic
        // Car car1 = (Car) o1;
        //Car car2 = (Car) o2;
        return car1.model.compareTo(car2.model);
    }
}
