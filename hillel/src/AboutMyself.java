/**
 * Created by Oleksandr on 20.09.2015.
 */
public class AboutMyself {
    public static void main(String[] args){
        String myFirstName = "Oleksandr";
        String myLastName = "Pavlov";

        //System.out.println(myFirstName + " " + myLastName);
        System.out.print(myFirstName + " ");
        System.out.print(myLastName);
        System.out.println();
        
        int birthYear = 1982;
        int thisYear = 2015;
        int age = thisYear - birthYear;

        System.out.println(age);
    }
}
