package main.java.com.OlehHilchenko.javacore.Chapter05;

//demonstrate operator continue use

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}
