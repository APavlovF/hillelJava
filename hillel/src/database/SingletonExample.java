package database;

/**
 * Created by APavlov on 21.12.2015.
 */
public class SingletonExample {
    private static SingletonExample instance = new SingletonExample();

    public String someValue;

    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        return instance;
    }

}
