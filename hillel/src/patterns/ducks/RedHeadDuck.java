package patterns.ducks;

/**
 * Created by APavlov on 26.10.2015.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "read head duck";
    }

}
