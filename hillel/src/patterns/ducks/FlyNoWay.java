package patterns.ducks;

/**
 * Created by APavlov on 29.10.2015.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "Fly no way (";
    }
}
