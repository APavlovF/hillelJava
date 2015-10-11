package PolymorphHomework;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class Dog extends DomesticAnimal{

    @Override
    public String makeSound(){
        if (name != null) return hello + "my name is " + name + ", woof";
        return hello + "woof";
    }
}
