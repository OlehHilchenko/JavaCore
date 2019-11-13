package main.java.com.OlehHilchenko.javacore.Chapter18;

//
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        //
        TreeSet<String> ts = new TreeSet<>();

        //
        ts.add("c");
        ts.add("a");
        ts.add("b");
        ts.add("e");
        ts.add("f");
        ts.add("d");

        System.out.println(ts);
        System.out.println(ts.subSet("c", "f"));
    }
}
