package main.java.com.OlehHilchenko.javacore.Chapter03;
/**Calculate area of a circle.
 * */
public class Area {

    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; //Circle radius.
        pi = 3.1416; //Approximate variable pi number.
        a = pi * r * r; // Calculate area of a circle.

        System.out.println("Area of circle is equal to " + a);
    }
}
