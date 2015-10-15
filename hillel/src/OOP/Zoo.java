package OOP;

/**
 * Created by APavlov on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        //catCreator();
        //referenceComparison();
        //Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        //Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");
        //System.out.println(tomCat1.equals(tomCat2));
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        String sound = tomCat1.makeSound();
        //System.out.println(sound);
        //Cat cat = new Cat();

        Animal animalCat = new Cat();   //polymorphism

        sound = animalCat.makeSound();
        System.out.println("cat as animal sound: " + sound); //result of polymorphism

        Object cat3 = new Cat();
        cat3.equals(new Object());

        Object cat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Object cat2 = new Cat(true, 3, "Tom", "Blue-gray");

        System.out.println("polymorphic equals: " + cat1.equals(cat2));

        //polymorphismExample();

        //Animal someAnimal = new Animal();   error - because Animal is abstract class
        Animal anotherAnimal = new Cat();
        System.out.println(anotherAnimal.someField);
        System.out.println(anotherAnimal.getSomeField());

        Cat anotherCat = new Cat();
        System.out.println(anotherCat.someField);

        System.out.println(anotherAnimal.getTypeName());
        System.out.println(Animal.getTypeName());
        System.out.println(Cat.getTypeName());
        System.out.println(anotherCat.getTypeName());

    }

    private static void polymorphismExample() {
        Object[] objects = new Object[3];
        objects[0] = "some string";
        objects[1] = new Cat(true, 3, "Tom", "Blue-gray");
        objects[2] = System.in;

        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }

    private static void referenceComparison() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "Blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "Blue-gray");
        System.out.println(tomCat1 == tomCat2);

        tomCat2 = tomCat1;
        System.out.println(tomCat1 == tomCat2);
    }

    private static void catCreator() {
        if (Cat.domestic) {
            System.out.println("Cat is domestic animal");
        }
        if (Cat.predator) {
            System.out.println("Cat is predator");
        }
        Cat tomCat = new Cat(true, 3, "Tom", "Blue-gray");

        //tomCat.init(true, 3, "Tom", "Blue-gray");


        Cat murzik = new Cat();
        murzik.pet = true;
        murzik.setAge(4);
        murzik.color = "black";

        System.out.println(murzik.predator);
    }
}
