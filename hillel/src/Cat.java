/**
 * Created by APavlov on 05.10.2015.
 */
public class Cat {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    int age;
    String name;
    String color;

    public Cat() {
        System.out.println("in Cat constructor");
    }

    public Cat(boolean pet, int itsAge, String name, String color) {
        this.pet = pet;
        this.age = itsAge;
        this.name = name;
        this.color = color;
    }

    // public void init(boolean pet, int itsAge, String name, String color){
    //   this.pet = pet;
    // this.age = itsAge;
    // this.name = name;
    //this.color = color;
    //}
}
