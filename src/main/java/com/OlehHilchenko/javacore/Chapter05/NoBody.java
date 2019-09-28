package main.java.com.OlehHilchenko.javacore.Chapter05;

//the target part of the loop may be empty

public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        //calculate average value of variables i and j
        while (++i < --j) ; //this cycle has no body

        System.out.println("average value is " + i);
    }
}
