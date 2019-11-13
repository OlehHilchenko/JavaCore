package main.java.com.OlehHilchenko.javacore.Chapter18;

//
import  java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        //
        ArrayList<String> al = new ArrayList<>();

        //
        al.add("c");
        al.add("a");
        al.add("e");
        al.add("b");
        al.add("d");
        al.add("f");

        //
        //
        System.out.println("The original contents of the al list array: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.println("Modified al List Array Content: ");
        itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //
        System.out.println("Amended list in reverse order: ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
