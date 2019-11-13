package main.java.com.OlehHilchenko.javacore.Chapter18;

//
import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //
        ArrayDeque<String> adq = new ArrayDeque<>();

        //
        adq.push("a");
        adq.push("b");
        adq.push("d");
        adq.push("e");
        adq.push("f");

        System.out.println("pop out: ");

        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");

        System.out.println();
    }
}
