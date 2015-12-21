package database;

/**
 * Created by APavlov on 21.12.2015.
 */
public class SingletonMain {
    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        singleton.someValue = "asd";

        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println(singleton2.someValue);
    }

}
