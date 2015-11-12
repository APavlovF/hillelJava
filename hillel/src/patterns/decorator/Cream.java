package patterns.decorator;

/**
 * Created by APavlov on 12.11.2015.
 */
public class Cream extends BeverageDecorator {

    public Cream(Beverage beverage) {
        super(beverage);
        setCost(8);
        setDescription(" with cream");
    }
}
