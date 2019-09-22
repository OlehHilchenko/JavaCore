package main.java.com.OlehHilchenko.javacore.Chapter03;

//This example demonstrates dynamic initialization.

public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // Dynamic initialization variable c.
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse is equal " + c);
    }
}
