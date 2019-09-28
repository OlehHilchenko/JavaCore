package main.java.com.OlehHilchenko.javacore.Chapter05;

//loops can be nested
public class Nested {
    public static void main(String[] args) {
        int i, j;

        for(i = 0; i < 10; i++){
            for(j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
