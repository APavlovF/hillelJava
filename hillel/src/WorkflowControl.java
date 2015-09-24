import java.util.Scanner;

/**
 * Created by APavlov on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age < 20) {
            System.out.println("you are young");
        } else {
            System.out.println("you aren't so young");
        }
        if (age < 10) {
            System.out.println("kid");
        } else if (age < 20) {
            System.out.println("teen");
        } else if (age < 50) {
            System.out.println("adult");
        } else {
            System.out.println("old");
        }

        if (age >= 0 && age < 10) {
            System.out.println("kid");
        }
        if (age >= 10 && age < 20) {
            System.out.println("teen");
        }
        if (age >= 20 && age < 50) {
            System.out.println("adult");
        }
        if (age >= 50) {
            System.out.println("old");
        }
    }

    private static void ifExplanation() {
        boolean condition = false;
        if (condition) {
            System.out.println("in IF");
            System.out.println("still in IF block");
        } else {
            System.out.println("in ELSE block");
        }
        System.out.println("out of IF block");
    }
}
