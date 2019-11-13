package main.java.com.OlehHilchenko.javacore.Chapter18;

///
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("The initial size of the list array: " + al.size());

        //
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("Size of the list array al after entering items: "
                + al.size());

        //
        System.out.println("list array contents al: " + al);

        //
        al.remove("F");
        al.remove(2);
        System.out.println("Size of the list array al after deleting items: "
                + al.size());

        System.out.println("list array contents al: " + al);

    }
}
