package java8features;

/**
 * Created by APavlov on 14.01.2016.
 */
public class RedFilter implements Filtrator {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("Red");
    }
}
