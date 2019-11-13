package main.java.com.OlehHilchenko.javacore.Chapter10;
//
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("In the body of the method throwOne().");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("exception caught: " + e);
        }
    }
}
