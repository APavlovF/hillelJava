package Statistics;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Oleksandr on 24.10.2015.
 */
public class TestStatistics {
    @Test
    public void testArrayList() {
        MyArrayList myTestArrayList = new MyArrayList();

        for (int i = 0; i < 10000000; i++) {
            myTestArrayList.add(new Integer(i));
        }
        Instant begin = Instant.now();
        Object element = myTestArrayList.get(2);
        Instant end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Get element " + element + " takes " + milliseconds + " milliseconds");

        begin = Instant.now();
        element = myTestArrayList.get(9900999);
        end = Instant.now();
        milliseconds = Duration.between(begin, end).toMillis();
        System.out.println("Get element " + element + " takes " + milliseconds + " milliseconds");
    }

}
