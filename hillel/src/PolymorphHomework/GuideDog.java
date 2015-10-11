package PolymorphHomework;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class GuideDog extends Dog {
    public boolean isTrained;

    @Override
    public String makeSound() {
        if (isTrained = true) return hello + "I can take you home";
        else return hello + "woof";
    }
}
