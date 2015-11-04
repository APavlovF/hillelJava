package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Sword implements Weapon {

    Damage damageBySword = new Damage(6);
    int damage = damageBySword.damage;


    @Override
    public String fight() {
        return "Fight with sword!";
    }

}
