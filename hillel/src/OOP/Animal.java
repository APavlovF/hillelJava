package OOP;

import java.util.Arrays;

/**
 * Created by APavlov on 08.10.2015.
 */
public abstract class Animal implements Vaccinable {
    String name;
    int age;
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;


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
}
