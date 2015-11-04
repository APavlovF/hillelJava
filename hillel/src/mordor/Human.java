package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Human extends Warrior {

    public Human(){
        damageRace.setDamageByRace(3);
    }

    public String fight() {
        return weapon.fight();
    }

    @Override
    public String person() {
        return "I'm human";
    }

}
