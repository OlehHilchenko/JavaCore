package main.java.com.OlehHilchenko.javacore.Chapter05;

//demonstrate the use of the loop operator do-while

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tact " + n);
            n--;
        } while (n > 0);

        /*
        * do {
        * System.out.println("tact " + n);
        * } while(--n > 0);*/
    }
}
