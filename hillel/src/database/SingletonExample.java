package database;

/**
 * Created by APavlov on 21.12.2015.
 */
public class SingletonExample {
    private static SingletonExample instance;

    public String someValue;

    private SingletonExample() {

    }

    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

}
