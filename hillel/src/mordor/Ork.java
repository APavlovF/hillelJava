package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Ork extends Warrior{

    public Ork(){
        fightWeapon = new OrkFight();
    }
    public String fight(){
        return fightWeapon.fight();
    }
}
