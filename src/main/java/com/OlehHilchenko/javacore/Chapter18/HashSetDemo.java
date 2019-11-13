package main.java.com.OlehHilchenko.javacore.Chapter18;

//
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        //
        HashSet<String> hs = new HashSet<>();

        //
        hs.add("Aa");
        hs.add("Bs");
        hs.add("Gf");
        hs.add("GG");
        hs.add("vV");
        hs.add("Nm");
        LinkedHashSet<String> lhs = new LinkedHashSet<>(hs);

        System.out.println(hs);
        System.out.println(lhs);
    }
}
