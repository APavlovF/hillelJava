package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Bow implements Weapon {

    Damage damageByBow = new Damage(0, 0, 5);
    int damage = damageByBow.damage;

    @Override
    public String fight() {
        return "Fight with bow!";
    }

}
