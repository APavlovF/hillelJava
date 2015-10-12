package OOP;

/**
 * Created by APavlov on 05.10.2015.
 */
public class Cat extends Animal {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    //int age;
    //String name;
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

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';
        return result;
    }

    @Override
    public boolean equals(Object otherObject) {
        System.out.println("in cat's equals method");
        if (!(otherObject instanceof Cat)) return false;
        Cat otherCat = (Cat) otherObject;

        if (pet != otherCat.pet) return false;
        if (age != otherCat.age) return false;
        if (!name.equals(otherCat.name)) return false;
        if (!color.equals(otherCat.color)) return false;
        return true;
    }
    // public void init(boolean pet, int itsAge, String name, String color){
    //   this.pet = pet;
    // this.age = itsAge;
    // this.name = name;
    //this.color = color;
    //}
}
