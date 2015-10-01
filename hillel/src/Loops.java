import java.util.Scanner;

/**
 * Created by APavlov on 01.10.2015.
 */
public class Loops {
    public static void main(String[] args) {
        //whileExample();
        //doWhileExample();
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop " + i);
        }

    }

    private static void doWhileExample() {
        Scanner scanner = new Scanner(System.in);
        String yesNo;
        do {
            System.out.println("yes/no");
            yesNo = scanner.next();
        } while (!(yesNo.equals("yes") || yesNo.equals("no")));
    }

    private static void whileExample() {
        int money = 10000;
        int months = 0;

        while (money < 1500) {
            money += 100;
            months++;
        }
        System.out.println("money: " + money + ", months: " + months);
    }
}
