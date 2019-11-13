package main.java.com.OlehHilchenko.javacore.Chapter18;
//
import java.util.*;

//
class MyComp implements Comparator<String>{
    public int compare (String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //
        return bStr.compareTo(aStr);
    }
    //
}

public class CompDemo {
    public static void main(String[] args) {
        //
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
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
