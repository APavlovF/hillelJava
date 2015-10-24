package Statistics;

/**
 * Created by Oleksandr on 24.10.2015.
 */
public class MyLinkedList {
    private static String firstLink;
    private static String link;

    MyLinkedList(){
        Object o = new Object();
        firstLink = o.toString();
    }

    public String add(Object o) {
        link = firstLink;
        return link;
    }


}
