package mordor;

import java.io.*;

/**
 * Created by Oleksandr on 20.11.2015.
 */
public class savePerson {
    public static void main(String[] args) {

        Human human = new Human();
        String person = human.person();
        String humanFight = human.fight();

        saveFight(humanFight, person);

        getSavedFight();

    }

    private static void getSavedFight() {

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\Oleksandr\\Documents/myFile.dat"))) {
            String savedFight = "";
            try {
                while (true) {
                    savedFight = savedFight + dataInputStream.readChar();
                }
            } catch (EOFException e) {
                System.out.println("Info: ");
            }
            System.out.println(savedFight);
        } catch (IOException e) {
            System.out.println(e);
        }


    }

    private static void saveFight(String humanFight, String person) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Oleksandr\\Documents/myFile.dat"))) {

            dataOutputStream.writeChars(person + "\n" + humanFight);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
