package main.java.com.OlehHilchenko.javacore.Chapter18;

//
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        //
        LinkedList<String> ll = new LinkedList<>();

        //
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("source content of ll linked list: " + ll);

        //
        ll.remove("F");
        ll.remove(2);
        System.out.println("ll linked list content after deleting items: " + ll);

        //
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll linked list content after deleting first and last items: " + ll);

        //
        String val = ll.get(2);
        ll.set(2, val + " changed");
        System.out.println("ll linked list content after change items: " + ll);
    }
}
