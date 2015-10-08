/**
 * Created by Oleksandr on 07.10.2015.
 */
public class ImprovedArray {
    static String[] someArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] other;
    static int counter = 0;

    public static void main(String[] args) {
        ImprovedArray improvedArray = new ImprovedArray();

        System.out.println(improvedArray.get(4));

        for (int i = 0; i < 12; i++) {

            improvedArray.add(" a one");
        }
        System.out.println(improvedArray.other[counter]);

    }


    public void add(String value) {
        if (counter < someArray.length) {
            someArray[counter] = value;
        } else {
            other = new String[someArray.length * 2];
            //other = someArray;
            other[counter] = value;
        }
        counter++;

    }

    public String get(int index) {
        return someArray[index];
    }

    public int size() {
        return counter;
    }

}
