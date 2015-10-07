import java.util.Scanner;

/**
 * Created by Oleksandr on 07.10.2015.
 */
public class SuperCrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String someString = scanner.nextLine();

        System.out.println("Enter a key: ");
        String key = scanner.next();

        Cryptor cryptor = new Cryptor(key);
        System.out.println("Crypted message: " + cryptor.cryptedMessage(someString));
        System.out.println("Uncrypted message: " + cryptor.cryptedMessage(cryptor.cryptedMessage(someString)));
    }
}
