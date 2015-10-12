package OOP;

/**
 * Created by APavlov on 12.10.2015.
 */
public class AbstractZooExample {
    public static void main(String[] args) {
        Animal animalCat = new Cat();
        Animal animalDog = new Dog();

        //printSound(animalCat);
        //printSound(animalDog);

        //printSound(new Cat());

        vaccinate(animalCat);
        vaccinate(animalDog);
        System.out.println(animalCat.toString());
        System.out.println(animalDog.toString());
        System.out.println(animalCat); //finds method toString() and runs it

        Employee employee = new Employee();
        vaccinate(employee);
        System.out.println(employee);

        Human employee2 = new Employee();
        Object employee3 = new Employee();
        Vaccinable employee4 = new Employee();
        employee4.vaccinate("SDF");
        System.out.println(employee4);

        
    }

    public static void vaccinate(Vaccinable animalOrEmployee) {
        animalOrEmployee.vaccinate("ASD-1");
    }

    public static void printSound(Animal animal) {
        System.out.println(animal.makeSound());
    }
}
