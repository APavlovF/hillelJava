package PolymorphHomework;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class WildAnimal extends Animal{
    public  boolean isPredator = true;

    @Override
    public String makeSound(){
        if (isPredator == true) return hello + "I'm a wild animal and I'm angry";
        else
        return hello + "I'm a wild animal";
    }
}
