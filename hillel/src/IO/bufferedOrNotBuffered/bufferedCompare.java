package IO.bufferedOrNotBuffered;

import java.io.*;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.Instant;

/**
 * Created by Oleksandr on 20.11.2015.
 */
public class bufferedCompare {
    public static void main(String[] args) {

        inputStreamCopy();

        bufferedCopy();

    }

    private static void bufferedCopy() {

        Instant begin = Instant.now();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Oleksandr\\Documents/myFile.txt"), Charset.forName("windows-1251")));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Oleksandr\\Documents/copyOfMyFile.txt"), Charset.forName("windows-1251")))
        ) {
            String value = null;
            while ((value = bufferedReader.readLine()) != null) {
                bufferedWriter.write(value);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println(milliseconds);
    }

    private static void inputStreamCopy() {

        Instant begin = Instant.now();

        try (InputStream inputStream = new FileInputStream("C:\\Users\\Oleksandr\\Documents/myFile.txt");
             OutputStream outputStream = new FileOutputStream("C:\\Users\\Oleksandr\\Documents/copyOfMyFile.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println(milliseconds);

    }
}
