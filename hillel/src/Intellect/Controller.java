package Intellect;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class Controller {
    public static void main(String[] args) {
        Intel guesser = new Intel();
        Intel guessing = new Intel();

        double secretNumber = guessing.getNumber();
        double guesserTry = guesser.getNumber();
        int counter = 0;

        System.out.println("1st player guesses a number: " + secretNumber);
        while (guesserTry != secretNumber) {
            System.out.println("2nd player try: " + guesserTry);
            guesserTry = guesser.getNumber();
            counter++;
        }
        System.out.println("2nd player guessed the number " + guesserTry + " after " + counter + " tries");

    }
}
