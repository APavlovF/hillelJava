import java.util.Scanner;

/**
 * Created by Oleksandr on 29.09.2015.
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result;
        System.out.println("Enter a number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter an operation: ");
        String operation = scanner.next();
        double secondNumber;
        switch (operation) {
            case "trunk":
                System.out.println("Result is: " + Math.floor(firstNumber) + resultType(Math.floor(firstNumber)));  //use method resultType
                break;
            case "fract":
                System.out.println("Result is: " + (firstNumber - Math.floor(firstNumber)) + " (double)");
                break;

            case "+":
                System.out.println("Enter another number: ");
                secondNumber = scanner.nextDouble();
                result = firstNumber + secondNumber;
                System.out.println("Result is: " + result + resultType(result));
                break;
            case "-":
                System.out.println("Enter another number: ");
                secondNumber = scanner.nextDouble();
                result = firstNumber - secondNumber;
                System.out.println("Result is: " + result + resultType(result));
                break;
            case "*":
                System.out.println("Enter another number: ");
                secondNumber = scanner.nextDouble();
                result = firstNumber * secondNumber;
                System.out.println("Result is: " + result + resultType(result));
                break;
            case "/":
                System.out.println("Enter another number: ");
                secondNumber = scanner.nextDouble();
                result = firstNumber / secondNumber;
                System.out.println("Result is: " + result + resultType(result));
                break;
            default:
                System.out.println("Incorrect operation");
                break;
        }
    }

    public static String resultType(double result) {
        String resType = " (number is too large)";
        if ((result - Math.floor(result)) != 0) {  //снова проверка, что число целое.
            resType = " (double)";
        } else if (Math.abs(result) < 127) {
            resType = " (byte)";
        } else if (Math.abs(result) < 32767) {
            resType = " (short)";
        } else if (Math.abs(result) < 2147483647) {
            resType = " (int)";
        } else if (Math.abs(result) < 9223372036854775807L) {
            resType = " (long)";
        }

        return resType;
    }

}
