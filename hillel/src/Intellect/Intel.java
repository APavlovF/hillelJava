package Intellect;

/**
 * Created by Oleksandr on 11.10.2015.
 */
public class Intel {
    public double guessedNumber;

    public double getNumber() {
        guessedNumber = Math.round(Math.random() * 10);
        return guessedNumber;
    }

}
