package main.java.com.OlehHilchenko.javacore.Chapter03;

//demonstrate type casting

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion type int in type byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nConversion type double in type int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("\nConversion type double in type byte. ");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
