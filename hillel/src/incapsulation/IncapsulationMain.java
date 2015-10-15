package incapsulation;

/**
 * Created by APavlov on 15.10.2015.
 */
public class IncapsulationMain {
    public static void main(String[] args) {
        ImprovedArray array = new ImprovedArray();
        array.add(1);
        array.add(11);
        array.add(21);
        array.add(31);
        array.add(41);
        array.add(51);

        System.out.println(array);
        System.out.println(array.get(3));

    }
}
