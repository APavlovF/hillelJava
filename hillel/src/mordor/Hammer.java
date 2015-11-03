package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Hammer implements Weapon {
    @Override
    public String fight() {
        return "Fight with hammer!";
    }

    @Override
    public String damageType() {
        return "Crush";
    }

    @Override
    public int damageByWeapon(int damageByRace) {
        return 7 + damageByRace;
    }
}
