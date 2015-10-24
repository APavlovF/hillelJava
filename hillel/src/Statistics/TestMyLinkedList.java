package Statistics;

import org.junit.Test;

/**
 * Created by Oleksandr on 24.10.2015.
 */
public class TestMyLinkedList {
    @Test
    public void testMyLinkedList() {

        MyLinkedList linkedList = new MyLinkedList();
        Object o1 = new Object();
        System.out.println(linkedList.add(o1));
        Object o2 = new Object();
        System.out.println(linkedList.add(o2));
    }
}

