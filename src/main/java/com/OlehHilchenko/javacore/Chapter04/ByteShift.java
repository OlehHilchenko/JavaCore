package main.java.com.OlehHilchenko.javacore.Chapter04;

//left shift value type byte

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("initial value a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
