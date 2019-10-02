package main.java.com.OlehHilchenko.javacore.Chapter05;

// show operator application return
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("before return");

        if (t) return; // return to calling code

        System.out.println("this statement will not be executed ");
    }
}
