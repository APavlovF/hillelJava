package collections.mutableState;

import java.util.Objects;

/**
 * Created by APavlov on 02.11.2015.
 */
public class Car {
    final String model;
    final int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        return !(model != null ? !model.equals(car.model) : car.model != null);

    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

}
