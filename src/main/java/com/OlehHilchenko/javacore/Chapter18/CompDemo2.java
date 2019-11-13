package main.java.com.OlehHilchenko.javacore.Chapter18;
//
//
import java.util.*;

public class CompDemo2 {
    public static void main(String[] args) {

        //
        //
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        //
        ts.add("c");
        ts.add("a");
        ts.add("b");
        ts.add("e");
        ts.add("f");
        ts.add("d");
        //
        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
