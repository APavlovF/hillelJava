package mordor;

/**
 * Created by Oleksandr on 30.10.2015.
 */
public class Sword implements Weapon {

    public Sword(){
        damageWeapon.setDamageByWeapon(6);
    }

    @Override
    public String fight() {
        return "Fight with sword!";
    }

}
