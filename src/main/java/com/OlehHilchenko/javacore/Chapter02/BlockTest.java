package main.java.com.OlehHilchenko.javacore.Chapter02;

/*Demonstrate the use block code

 * Name the source file "BlockTest"*/

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
//The code block serves as the destination for this loop statement.
        for (x = 0; x < 10; x++) {
            System.out.println("Value x: " + x);
            System.out.println("Value y: " + y);
            y = y - 2;
        }
    }
}
