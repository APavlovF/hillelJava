package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Elf extends Warrior {

    public Elf(){
        fightWeapon = new ElfFight();
    }
    public String fight(){
        return fightWeapon.fight();
    }
}
