/**
 * Created by APavlov on 21.09.2015.
 */
public class DataTypes {
    public static void main(String[] args) {
        //primitiveDataTypes();
        //realNumbersComparison();
        byte b = 120;
        short s = b;
        long l = s;
        double d = l;

        l = 15;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Max value: " + maxValue);
        long intMaxValue = maxValue;
        long intOverflow = intMaxValue + 10;
        int i = (int) intOverflow;
        System.out.println("Overflow: " + i);
        d = 3.9;
        i = (int) d;

        System.out.println("3.9 after converting is: " + i);


    }

    private static void realNumbersComparison() {
        if (1.1 + 2.2 == 3.3) {
            System.out.println("they are equal");
        } else {
            System.out.println("they aren't equal");
        }
        System.out.println(1.1 + 2.2);
    }

    private static void primitiveDataTypes() {
        int age = 31;
        int days = age * 365;
        int hours = days * 24;
        int seconds = hours * 3600;
        long milliseconds = seconds * 1000L;

        long longSeconds = milliseconds / 1000;
        seconds = (int) longSeconds;

        seconds = (int) (milliseconds / 1000);

        System.out.println(milliseconds);

        double d = 3.54;
        int i = 10;
        long l = 100000000000L;
        float f = 2.5F;
        boolean bool = true;
        bool = false;
        String s = "helo world";
        char c = 'h';
        byte b = 115;
    }

}
