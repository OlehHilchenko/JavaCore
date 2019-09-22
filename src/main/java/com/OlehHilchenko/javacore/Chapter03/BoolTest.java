package main.java.com.OlehHilchenko.javacore.Chapter03;

//Demonstrate use value type boolean.

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equally " + b);
        b = true;
        System.out.println("b equally " + b);

        // value type boolean can control operator if
        if (b) System.out.println("this code is executed");
        b = false;
        if (b) System.out.println("this code is not executed");

        // comparison result - value tupe boolean
        System.out.println("10 > 9 equally " + (10 > 9));
    }
}
