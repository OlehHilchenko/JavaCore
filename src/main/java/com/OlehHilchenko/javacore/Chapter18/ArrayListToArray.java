package main.java.com.OlehHilchenko.javacore.Chapter18;

//
import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        //
        ArrayList<Integer> al = new ArrayList<>();

        //
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Array list contents al: " + al);

        //
        Integer ia [] = new Integer[al.size()];
        ia = al.toArray(ia) ;

        int sum = 0;

        //
        for (int i : ia) sum += i;

        System.out.println("Sum: " + sum);
    }
}
