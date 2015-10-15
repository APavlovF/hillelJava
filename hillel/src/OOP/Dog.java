package OOP;

/**
 * Created by APavlov on 12.10.2015.
 */
public class Dog extends Animal {

    public Dog() {
        super("dog", 0);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
