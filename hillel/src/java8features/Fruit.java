package java8features;

/**
 * Created by APavlov on 14.01.2016.
 */
public interface Fruit {
    String getName();

    default String chop() {
        return "Chopped " + getName();
    }

    ;
}
