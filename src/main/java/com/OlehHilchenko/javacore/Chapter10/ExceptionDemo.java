package main.java.com.OlehHilchenko.javacore.Chapter10;
//
class MyException extends Exception{
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString(){
        return "MyException[" + detail + "]";
    }
}

public class ExceptionDemo {
    static void computer(int a) throws MyException{
        System.out.println("compute(" + a + ") method called.");
        if (a > 10)
            throw new MyException(a);
        System.out.println("normal completion");
    }

    public static void main(String[] args) {
        try{
            computer(1);
            computer(20);
        }catch (MyException e){
            System.out.println("exception caught: " + e);
        }
    }
}
