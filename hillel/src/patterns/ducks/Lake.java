package patterns.ducks;

/**
 * Created by APavlov on 26.10.2015.
 */
public class Lake {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        //test(duck);
        //test(new MallardDuck());
        //test(new Decoy());

        Duck pilot = new RubberDuck();
        test(pilot);
        pilot.flyBehavior = new Jet();
        test(pilot);

    }

    private static void test(Duck duck) {
        System.out.println(duck.quack());
        System.out.println(duck.fly());
        System.out.println(duck.display());
        System.out.println();
    }
}
