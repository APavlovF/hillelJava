package PolymorphHomework;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class DomesticAnimal extends Animal{
    public String name;
    public boolean isVaccinated;

    @Override
    public String makeSound(){
        if (name != null) return hello + "my name is " + name;
        return hello;
    }
}
