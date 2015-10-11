package PolymorphHomework;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class TaskAnimals {

    public static void main(String[] args) {
        String sound;

        Fish fish = new Fish();
        sound = fish.makeSound();
        System.out.println("Fish: " + sound);

        Dog dog = new Dog();
        dog.name = "Tuzik";
        sound = dog.makeSound();
        System.out.println("Dog: " + sound);

        Cat cat = new Cat();
        cat.name = "Barsik";
        sound = cat.makeSound();
        System.out.println("Cat: " + sound);

        Wolf wolf = new Wolf();
        sound = wolf.makeSound();
        System.out.println("Wolf: " + sound);

        Lion lion = new Lion();
        sound = lion.makeSound();
        System.out.println("Lion: " + sound);

        Giraffe giraffe = new Giraffe();
        giraffe.isPredator = false;
        sound = giraffe.makeSound();
        System.out.println("Giraffe: " + sound);

        Crocodile crocodile = new Crocodile();
        sound = crocodile.makeSound();
        System.out.println("Crocodile: " + sound);

        Hamster hamster = new Hamster();
        sound = hamster.makeSound();
        System.out.println("Hamster: " + sound);

        GuideDog guideDog = new GuideDog();
        guideDog.isTrained = true;
        guideDog.name = "Mukhtar";
        sound = guideDog.makeSound();
        System.out.println("Guide-dog: " + sound);
    }
}
