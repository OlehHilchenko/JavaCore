package main.java.com.OlehHilchenko.javacore.Chapter18;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //
        HashMap<String, Double> hm = new HashMap<>();

        //
        hm.put("Jone Doo", new Double(3434.34));
        hm.put("Tom Smit", new Double(123.22));
        hm.put("Jak Beaker", new Double(1378.00));
        hm.put("Tood Holl", new Double(99.22));
        hm.put("Ralph Smit", new Double(-19.08));

        //
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //
        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //
        double balance = hm.get("Jone Doo");
        hm.put("Jone Doo", balance + 1000);
        System.out.println("Jone Doo new account balance: " +
                            hm.get("Jone Doo"));
    }
}
