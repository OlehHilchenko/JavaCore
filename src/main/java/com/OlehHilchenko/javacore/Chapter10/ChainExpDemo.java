package main.java.com.OlehHilchenko.javacore.Chapter10;
//
public class ChainExpDemo {
    static void demoproc(){

        //
        NullPointerException e = new NullPointerException("upper level");

        //
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            //
            System.out.println("exception caught: " + e);

            //
            //
            System.out.println("root cause: " + e.getCause());
        }
    }
}
