package mordor;

/**
 * Created by Oleksandr on 04.11.2015.
 */
public class Damage {

    String damageType;
    int totalDamage;
    int damageByRace;
    int damageByWeapon;

    public Damage(){

    }

    public int calculateTotalDamage(Weapon weapon, Warrior warrior) {
        return totalDamage = getDamageByWeapon() + getDamageByRace() / 2;
    }

    public void setDamageByRace(int damageByRace) {
        this.damageByRace = damageByRace;
    }

    public void setDamageByWeapon(int damageByWeapon) {
        this.damageByWeapon = damageByWeapon;
    }

    public int getDamageByRace() {
        return damageByRace;
    }

    public int getDamageByWeapon() {
        return damageByWeapon;
    }
}
