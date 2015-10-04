import java.util.Scanner;

public class Crypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String someString = scanner.nextLine();

        System.out.println("Enter a key: ");
        char key = scanner.next().charAt(0);

        System.out.println("Crypted message: ");

        someString = crypt(someString, key);

        System.out.println("Uncrypted message: ");
        crypt(someString, key);
    }

    private static String crypt(String someString, char key) {
        char chars[] = someString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
        }
        String cryptString = String.copyValueOf(chars);
        System.out.println(cryptString);
        return cryptString;
    }
}