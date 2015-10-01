import java.util.Scanner;

/**
 * Created by APavlov on 01.10.2015.
 */
public class ArraysExample {
    public static void main(String[] args) {
        int[] ints = {1, 5, 4, 6, 5};
        int ints2[] = {2, 5, 4, 6, 8};

        int[] intArray = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("index: " + i + ", value: " + intArray[i]);
        }

        for (int value : intArray) {
            System.out.println("value: " + value);
        }

    }
}
