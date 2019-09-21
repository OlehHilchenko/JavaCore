package main.java.com.OlehHilchenko.javacore.Chapter02;

/*
Demonstrate the use of the conditional if statement.
Name the source file "ifSample. Java"
*/
public class ifSample {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("x lower у");
        x = x * 2;
        if (x == y) System.out.println("x now equally у");
        x = x * 2;
        if (x > y) System.out.println("x now above у");
// этот оператор не будет ниче го выводить
        if (x == y) System.out.println("you will not see this");
    }
}