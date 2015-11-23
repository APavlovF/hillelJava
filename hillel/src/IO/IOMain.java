package IO;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by APavlov on 19.11.2015.
 */
public class IOMain {
    public static void main(String[] args) {
        //pathesAndFileCreation();
        //uglyRead();
        //autoCloseable();
        //readWithResources();
        //copyBytes();
        //charRead();
        //bufferedRead();
        //dataOutput();
        //objectStore();
        //serialVersionUid();

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\APavlov\\IdeaProjects\\MyHillelJava\\hillel\\config.properties");) {

            Properties properties = new Properties();

            properties.load(fileInputStream);
            String carOwner = properties.getProperty("carOwner");
            String carYear = properties.getProperty("carYear");
            String carModel = properties.getProperty("carModel");

            CarOwner owner = new CarOwner(carOwner);
            Car car = new Car(carModel, Integer.parseInt(carYear), owner, "black");
            System.out.println(car);

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    private static void serialVersionUid() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d:/myData.dat"))) {

            List<Car> cars = (List<Car>) inputStream.readObject();

            System.out.println(cars);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void objectStore() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d:/myData.dat"))) {

            CarOwner owner = new CarOwner("Ivan");

            List<Car> cars = Arrays.asList(new Car("BMW", 1985, owner, "white"), new Car("Audi", 2001, owner, "black"));

            for (Car car : cars) {
                owner.addCar(car);
            }

            outputStream.writeObject(cars);

        } catch (IOException e) {
            System.out.println(e);
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d:/myData.dat"))) {

            List<Car> cars = (List<Car>) inputStream.readObject();

            System.out.println(cars);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void dataOutput() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("c:/myData.dat"))) {
            long[] longs = new long[]{1, 2, 3, 4, 5};

            for (long aLong : longs) {
                dataOutputStream.writeLong(aLong);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("c:/myData.dat"))) {
            try {
                while (true) {
                    System.out.println(dataInputStream.readLong());
                }
            } catch (EOFException e) {
                System.out.println("end");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void bufferedRead() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/myFile.txt"), Charset.forName("windows-1251")))) {
            String value = null;
            while ((value = bufferedReader.readLine()) != null) {
                System.out.println(value);
            }
            //throw new IOException("file blabla.txt not found");
        } catch (IOException e) {
            System.out.println(e);           //warning to log
            throw new RuntimeException(e);  //program will stop here
        }
    }

    private static void charRead() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("d:/myFile.txt"), Charset.forName("windows-1251"))) {
            int value;
            while ((value = inputStreamReader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void copyBytes() {
        try (InputStream inputStream = new FileInputStream("d:/myFile.txt");
             OutputStream outputStream = new FileOutputStream("d:/copyOfMyFile.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void readWithResources() {
        try (InputStream inputStream = new FileInputStream("d:/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void autoCloseable() {
        try (MyClose c = new MyClose()) {

        }
    }

    private static void uglyRead() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("d:/myFile.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println((char) value);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    private static void pathesAndFileCreation() throws IOException {
        System.out.println("yes\\no");
        System.out.println("c:\\program files\\myProgram");
        System.out.println("c:/program files/myProgram");
        String win = "c:\\HaxLogs.txt";
        String unix = "c:/HaxLogs.txt";

        File winFile = new File(win);
        System.out.println("win file exists: " + winFile.exists());

        File unixFile = new File(unix);
        System.out.println("unix file exists: " + unixFile.exists());

        Path path = Paths.get("myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("d:/myFile.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());

        if (!Files.exists(absolutePath)) {
            Files.createFile(absolutePath);
            System.out.println("file created");
        } else {
            System.out.println("file already exists");
        }
    }

}

class MyClose implements AutoCloseable {
    public void close() {

    }
}
