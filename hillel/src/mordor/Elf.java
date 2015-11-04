package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Elf extends Warrior {

    Damage damageByElf = new Damage(4 / 2);
    int damage = damageByElf.damage;

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


}
