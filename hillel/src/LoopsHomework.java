import java.util.Scanner;

/**
 * Created by Oleksandr on 04.10.2015.
 */
public class LoopsHomework {
    public static void main(String[] args) {
        //deposit();
        //happyTickets();
        //messageCost();
        //guessNumber();

    }

    private static void guessNumber() {
        double guessedNumber = Math.round(Math.random() * 100);
        int yourGuess = 0;
        int triesCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(guessedNumber);
        System.out.println("Try to guess number from 0 to 99");
        do {
            yourGuess = scanner.nextInt();
            triesCount++;
            if (yourGuess < guessedNumber) {
                System.out.println("Your number is less than guessed number");
            }
            if (yourGuess > guessedNumber) {
                System.out.println("Your number is more than guessed number");
            }
        } while (yourGuess != guessedNumber);
        System.out.println("Correct! You've used " + triesCount + " attempts");
    }

    private static void messageCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = scanner.nextLine();
        String[] words = message.split(" ");
        int wordsCount = words.length;
        double wordPrice = 0.256;
        System.out.println("Your message cost is: " + wordsCount * wordPrice);
    }

    private static void happyTickets() {
        int ones, tens, hundreds, thousands, tenThousands, hundredThousands;
        int firstThree, secondThree;
        int happyCount = 0;
        for (int i = 0; i < 1000000; i++) {
            hundredThousands = i / 100000;
            tenThousands = (i - hundredThousands * 100000) / 10000;
            thousands = (i - hundredThousands * 100000 - tenThousands * 10000) / 1000;
            hundreds = (i - hundredThousands * 100000 - tenThousands * 10000 - thousands * 1000) / 100;
            tens = (i - hundredThousands * 100000 - tenThousands * 10000 - thousands * 1000 - hundreds * 100) / 10;
            ones = i - hundredThousands * 100000 - tenThousands * 10000 - thousands * 1000 - hundreds * 100 - tens * 10;
            firstThree = hundredThousands + tenThousands + thousands;
            secondThree = hundreds + tens + ones;
            if (firstThree == secondThree) {
                //System.out.println("Happy number: " + i);
                happyCount++;
            }
        }
        System.out.println("Total number of happy tickets: " + happyCount);
    }

    private static void deposit() {
        double startSum;
        double finalSum;
        double percent = 0.03 / 12;
        double limitSum;
        double months;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start sum: ");
        startSum = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        months = scanner.nextInt();
        for (int i = 0; i < months; i++) {
            startSum = startSum + startSum * percent;
        }
        System.out.println("Final sum is: " + startSum);
        System.out.println("Enter limit sum: ");
        limitSum = scanner.nextDouble();
        //months = 0;
        while (startSum < limitSum) {
            startSum = startSum + startSum * percent;
            months++;
        }
        if (months < 12) {
            System.out.println("You will get limit sum in " + months + " month(s)");
        } else System.out.println("You will get limit sum in " + months / 12 + " year(s)");
    }
}
