package mordor;

/**
 * Created by Oleksandr on 04.11.2015.
 */
public class Damage {

    int damage;

    public Damage(int cut, int crush, int pierce) {
        this.damage = cut + crush + pierce;
    }
}
