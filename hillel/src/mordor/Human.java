package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Human extends Warrior{

    public Human(){
        fightWeapon = new HumanFight();
    }
    public String fight(){
        return fightWeapon.fight();
    }
}
