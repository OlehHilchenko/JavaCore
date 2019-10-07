package main.java.com.OlehHilchenko.javacore.Chapter07;

//
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = { "One", "Two", "Three" };
        int i = 0;
        for(String s: str)
            System.out.println("str[" + i++ + "]: " + s);
    }
}
