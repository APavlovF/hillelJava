/**
 * Created by APavlov on 17.09.2015.
 */
public class MyFirstClass {
    public static void main(String[] args) {

        sayHello();
        int age = 30;
        age = someMethoed(age);
        int maxAge = calculateAge();
        System.out.println(age);
    }

    private static int someMethoed(int age) {
        System.out.println(age);
        age = 50;
        return age;
        //int alexAge = calculateAge(1982);
        //System.out.println(alexAge);
    }

    public static void sayHello() {
        String helloMessage = "Hello world";
        System.out.println(helloMessage);
    }

    public static int calculateAge() {
        final int birthYear = 1984;
        int year = 2015;
        int age = year - birthYear;
        return age;
    }

    public static int calculateAge(int birthYear) {
        int year = 2015;
        int age = year - birthYear;
        return age;
    }

}
