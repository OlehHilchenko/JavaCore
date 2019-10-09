package main.java.com.OlehHilchenko.javacore.Chapter08;

//
abstract class A6{
    abstract void callme();

    //
    void callmetoo(){
        System.out.println("this is a specific method");
    }
}

class B6 extends A6{
    void callme (){
        System.out.println("callme() method implementation from class B6 ");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B6 b = new B6();

        b.callme();
        b.callmetoo();
    }
}
