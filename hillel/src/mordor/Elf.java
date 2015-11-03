package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Elf extends Warrior {

    public Elf(){
        weapon = new Bow();
    }
    public String fight(){
        return weapon.fight();
    }
    @Override
    public String person(){
        return "I'm elf";
    }

    public String damageType() {
        return weapon.damageType();
    }

    public int damage(){
        damageByRace = 4;
        return weapon.damageByWeapon(damageByRace);
    }
}
