package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Human extends Warrior {

    Damage damageByHuman = new Damage(3 / 2);
    int damage = damageByHuman.damage;

    public String fight() {
        return weapon.fight();
    }

    @Override
    public String person() {
        return "I'm human";
    }

}
