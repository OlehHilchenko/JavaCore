package main.java.com.OlehHilchenko.javacore.Chapter18;
//
//
import java.util.*;

//
class TComp implements Comparator<String> {
    public int compare (String aStr, String bStr){
        int i, j, k;

        //
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k==0)//
            return aStr.compareTo(bStr);
        else
            return k;
    }
    //
}
public class TreeMapDemo2 {
    public static void main(String[] args) {
        //
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        //
        tm.put("Jone Doo", new Double(3434.34));
        tm.put("Tom Smit", new Double(123.22));
        tm.put("Jak Beaker", new Double(1378.00));
        tm.put("Tood Holl", new Double(99.22));
        tm.put("Ralph Smit", new Double(-19.08));

        //
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //
        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //
        double balance = tm.get("Jone Doo");
        tm.put("Jone Doo", balance + 1000);
        System.out.println("Jone Doo new account balance: " +
                tm.get("Jone Doo"));
    }
}
