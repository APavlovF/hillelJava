package bank;

import java.util.Random;

/**
 * Created by APavlov on 30.11.2015.
 */
public class Bankier extends Thread {
    private Bank bank;
    private Random random = new Random();
    private long transactionCount;

    public Bankier(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            transactionCount++;
            int randomAmount = random.nextInt(1000);
            boolean randomDirection = random.nextBoolean();
            bank.transaction(randomAmount, randomDirection);
        }
    }

    @Override
    public String toString() {
        return "transactionCount=" + transactionCount;
    }
}
