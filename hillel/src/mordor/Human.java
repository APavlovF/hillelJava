package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Human extends Warrior {

    public Human() {
        weapon = new Sword();
    }

    public String fight() {
        return weapon.fight();
    }

    @Override
    public String person() {
        return "I'm human";
    }

    public String damageType() {
        return weapon.damageType();
    }

    public int damage(){
        damageByRace = 3;
        return weapon.damageByWeapon(damageByRace);
    }
}
