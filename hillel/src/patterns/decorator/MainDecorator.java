package patterns.decorator;

import java.util.Scanner;

/**
 * Created by APavlov on 12.11.2015.
 */
public class MainDecorator {
    public static void main(String[] args) {

        Beverage beverage = new Arabica();
        //beverage.setMilk(true);
        /*System.out.println(beverage.description() + " " + beverage.cost());

        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();

        check(cash, beverage);
        */
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);

        System.out.println(beverage.description());
        System.out.println(beverage.cost());


    }

    private static void check(int cash, Beverage beverage) {
        if (cash != beverage.cost()) {
            System.out.println("khm!");
        } else {
            System.out.println("ok");
        }
    }
}
