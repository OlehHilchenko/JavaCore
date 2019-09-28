package main.java.com.OlehHilchenko.javacore.Chapter04;

//demonstrate ternary operation ?

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; //get absolute value i variable
        System.out.print("absolute value ");
        System.out.println(i + " equal " + k);

        i = -10;
        k = i < 0 ? -i : i; //get absolute value i variable
        System.out.print("absolute value ");
        System.out.println(i + " equal " + k);
    }
}
