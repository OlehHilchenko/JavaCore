package main.java.com.OlehHilchenko.javacore.Chapter10;
//
public class FinallyDemo {
    //
    static void procA(){
        try {
            System.out.println("In the body of the method procA() ");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("operator unit finally in method procA() ");
        }
    }

    //
    static void procB() {
        try {
            System.out.println("In the body of method procB() ");
            return;
        }finally {
            System.out.println("operator unit finally in method procB() ");
        }
    }

    //
    static void procC(){
        try{
            System.out.println("In the body of method procC() ");
        }finally {
            System.out.println("operator unit finally in method procC() ");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println("exception caught");
        }

        procB();
        procC();
    }
}
