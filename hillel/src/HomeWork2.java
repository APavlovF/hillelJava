import java.util.Scanner;

/**
 * Created by Oleksandr on 27.09.2015.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //firstTask(scanner);
        //secondTask(scanner);
        //thirdTask(scanner);
        //ternaryExample(scanner);
        double d = 2.0;
        isEven((int) d);
        isEven(d, true);


        boolean todayIsThursday = true;
        boolean iShouldStayHere = true;
        todayIsThursday = !todayIsThursday;
        todayIsThursday = !(todayIsThursday && iShouldStayHere);
        boolean isEven = !isOdd(10);
    }

    private static void ternaryExample(Scanner scanner) {
        int number = scanner.nextInt();
        String isEven = isEven(number);

        isEven = (number % 2 == 0) ? "yes" : "no";
    }

    public static String isEven(int someNumber) {
        System.out.println("int");
        if (someNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static boolean isEven(double someNumber, boolean anotherNumber) {
        System.out.println("double and boolean");
        if (someNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean isOdd(int someNumber) {
        if (someNumber % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void firstTask(Scanner scanner) {
        System.out.println("1. Enter a number: ");
        int number1 = scanner.nextInt();
        if (number1 % 2 > 0) {
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");

        }
    }

    private static void secondTask(Scanner scanner) {
        System.out.println("2. Enter two numbers: ");
        int number21 = scanner.nextInt();
        int number22 = scanner.nextInt();
        int check1 = Math.abs(number21 - 10);
        int check2 = Math.abs(number22 - 10);
        if (check1 < check2) {
            System.out.println("The first number (" + number21 + ") is closer to ten");
        } else {
            System.out.println("The second number (" + number22 + ") is closer to ten");

        }
    }

    private static void thirdTask(Scanner scanner) {
        String negativeAnswer = "Such figure doesn't exist";
        System.out.println("Enter perimeter: ");
        int number31 = scanner.nextInt();
        System.out.println("Enter area: ");
        int number32 = scanner.nextInt();

        int p = number31; //perimeter
        int s = number32; //area
        //int x, y; //sides
        if (p % 2 > 0) {
            System.out.println(negativeAnswer);
        } else {
            //2 * x + 2 * y = p;
            //x * y = s;
            //x = (p - 2 * y) / 2;
            //(p / 2 - y) * y = s;
            //y * y - y * p / 2 + s = 0;
            double d; // discriminant
            double x1, x2, y1, y2; //sides
            d = p * p / 4 - 4 * s; //check for negative discriminant is later

            x1 = (p / 2 + Math.sqrt(d)) / 2;
            x2 = (p / 2 - Math.sqrt(d)) / 2;
            y1 = s / x1;
            y2 = s / x2;

            double checkX1 = x1 - (int) x1; //check that sides are integer
            //double checkY1 = y1 - (int) y1; - if one side is integer - other also integer
            double checkX2 = x2 - (int) x2;

            if (checkX1 != 0 | d < 0) {
                System.out.println(negativeAnswer);
            } else {
                System.out.println("Sides are: " + x1 + " and " + y1);
                if (x1 != y2) {                                      //how to check: checkX2 = 0 ?
                    System.out.println("Sides are: " + x2 + " and " + y2);
                }
            }

        }
    }
}
