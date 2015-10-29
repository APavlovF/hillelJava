package patterns.iterator;

import collections.ListElement;
import collections.RecursiveLinkedList;

import java.util.Iterator;

/**
 * Created by APavlov on 29.10.2015.
 */
public class RecursiveLinkedListIterator implements Iterator {

    private final RecursiveLinkedList list;
    ListElement element;

    public RecursiveLinkedListIterator(RecursiveLinkedList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (element == null) {
            return list.getHead() != null;
        }
        return element != null;
    }


    @Override
    public Object next() {
        if (element == null) {
            element = list.getHead();
        } else {
            element = element.next;
        }
        return element.value;
    }


}
