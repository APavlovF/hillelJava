import java.util.Scanner;

/**
 * Created by APavlov on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //switchCaseString();
        //switchCaseExample();

        //int age = scanner.nextInt();
        //ifExample(age);
    }

    private static void switchCaseString() {
        String month = "mars";
        switch (month) {
            case "jan":
            case "feb":
            case "dec":
                System.out.println("Winter");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println("Spring");
                break;
            default:
                System.out.println("Wrong month name: " + month);
                break;
        }
    }

    private static void switchCaseExample() {
        int month = 15;
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 5:
                System.out.println("May");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Wrong month number");
                break;
        }
    }

    private static void ifExample(int age) {
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
