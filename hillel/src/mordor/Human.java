package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Human extends Warrior {

    Damage damageByHuman = new Damage(3 / 2, 0, 0);
    int damage = damageByHuman.damage;

    public Human(){
        weapon = new Sword();
    }

    public String fight() {
        return weapon.fight();
    }

    @Override
    public String person() {
        return "I'm human";
    }

}
