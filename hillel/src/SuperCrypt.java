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

    }
}
class Cryptor {
    Cryptor(String keyString){
        char[] keyChar = new char[5];
    }
    public String cryptedMessage(String message){
        String crypt = "a";
        return crypt;
    }
}