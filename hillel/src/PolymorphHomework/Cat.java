package PolymorphHomework;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class Cat extends DomesticAnimal {
    @Override
    public String makeSound(){
        if (name != null) return hello + "my name is " + name + ", meow";
        return hello + " meow";
    }
}
