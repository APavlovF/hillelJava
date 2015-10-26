package patterns.ducks;

/**
 * Created by APavlov on 26.10.2015.
 */
public class Decoy extends Duck {

    @Override
    String display() {
        return "decoy";
    }

    @Override
    public String fly() {
        return "fly no way :(";
    }
}
