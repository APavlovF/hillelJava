package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Ork extends Warrior{

    public Ork(){
        weapon = new Hammer();
    }
    public String fight(){
        return weapon.fight();
    }

    @Override
    String person() {
        return "I'm ork";
    }

    public String damageType() {
        return weapon.damageType();
    }

    public int damage(){
        damageByRace = 2;
        return weapon.damageByWeapon(damageByRace);
    }
}
