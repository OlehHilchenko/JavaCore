package main.java.com.OlehHilchenko.javacore.Chapter18;
//
import java.util.*;

public class SpliteratorDemo {

    public static void main(String[] args) {
        //
        ArrayList<Double> vals = new ArrayList<>();

        //
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        //
        //
        System.out.println("vals list array contents: \n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //
        //
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        //
        //
        System.out.println("sqrs list array contents: \n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
