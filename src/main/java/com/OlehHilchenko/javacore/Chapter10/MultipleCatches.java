package main.java.com.OlehHilchenko.javacore.Chapter10;

//

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        }catch (ArithmeticException e){
            System.out.println("Division by zero: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error indexing outside the array: " + e);
        }
        System.out.println("After block try/catch.");
    }
}
