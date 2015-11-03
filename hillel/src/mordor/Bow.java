package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Bow implements Weapon {

    @Override
    public String fight() {
        return "Fight with bow!";
    }

    @Override
    public String damageType() {
        return "Pierce";
    }

    @Override
    public int damageByWeapon(int damageByRace) {
        return 5 + damageByRace;
    }
}
