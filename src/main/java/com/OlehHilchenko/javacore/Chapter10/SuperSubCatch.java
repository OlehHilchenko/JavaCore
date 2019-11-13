package main.java.com.OlehHilchenko.javacore.Chapter10;
/*
* */
public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        }catch (Exception e){
            System.out.println("Catching general class Exception exceptions. ");
        }
        /*
        *
        catch (ArithmeticException e){ ERROR: non-valid code
            System.out.println("the code is not reliable");
        }
        */
    }
}
