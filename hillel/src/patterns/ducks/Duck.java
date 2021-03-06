package patterns.ducks;

/**
 * Created by APavlov on 26.10.2015.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public String quack() {
        return quackBehavior.quack();
    }

    abstract String display();

    public String fly() {
        return flyBehavior.fly();
    }

    public String swim() {
        return "I can swim";
    }
}
