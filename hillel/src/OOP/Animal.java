package OOP;

import java.util.Arrays;

/**
 * Created by APavlov on 08.10.2015.
 */
public abstract class Animal implements Vaccinable {
    public String someField = "animal's field";
    public String name;
    private int age;
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;

    //public Animal(){ }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (vaccineCounter != animal.vaccineCounter) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(vaccines, animal.vaccines);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (vaccines != null ? Arrays.hashCode(vaccines) : 0);
        result = 31 * result + vaccineCounter;
        return result;
    }

    public void vaccinate(String vaccine) {
        vaccines[vaccineCounter] = vaccine; //vaccines[vaccineCounter++] = vaccine;
        vaccineCounter++;
    }

    public String toString() {
        String result = "name: " + name;
        result += " age: " + age;
        result += " vaccines: " + Arrays.toString(vaccines);
        return result;
    }

    /* public String makeSound() {
         return "noise";
     }
     */
    public abstract String makeSound();

    public String getSomeField() {
        return someField;
    }

    public static String getTypeName() {
        return "Animal";
    }

}
