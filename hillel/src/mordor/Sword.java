package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Sword implements Weapon {
    @Override
    public String fight(){
        return "Fight with sword!";
    }

    @Override
    public String damageType() {
        return "Cut";
    }

    @Override
    public int damageByWeapon(int damageByRace) {
        return 6 + damageByRace;
    }
}
