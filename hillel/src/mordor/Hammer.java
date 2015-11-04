package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Hammer implements Weapon {

    Damage damageByHammer = new Damage(0, 7, 0);
    int damage = damageByHammer.damage;

    @Override
    public String fight() {
        return "Fight with hammer!";
    }


}
