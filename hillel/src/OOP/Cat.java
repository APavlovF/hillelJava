package OOP;

/**
 * Created by APavlov on 05.10.2015.
 */
public class Cat extends Animal {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    //int age;
    public String someField = "cat's field";
    String color;

    public Cat() {
        super("unknown", 0);
        System.out.println("in Cat constructor");
    }

    public Cat(boolean pet, int itsAge, String name, String color) {
        super(name, itsAge);
        this.pet = pet;
        //this.age = itsAge;
        //this.name = name;
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

        if (!super.equals(otherObject)) return false;

        if (!(otherObject instanceof Cat)) return false;
        Cat otherCat = (Cat) otherObject;

        if (pet != otherCat.pet) return false;
        //if (getAge() != otherCat.getAge()) return false;
        //if (!getName().equals(otherCat.getName())) return false;
        if (!color.equals(otherCat.color)) return false;
        return true;
    }
    // public void init(boolean pet, int itsAge, String name, String color){
    //   this.pet = pet;
    // this.age = itsAge;
    // this.name = name;
    //this.color = color;
    //}


    public String getSomeField() {
        return someField;
    }

    public static String getTypeName() {
        return "Cat";
    }
}
