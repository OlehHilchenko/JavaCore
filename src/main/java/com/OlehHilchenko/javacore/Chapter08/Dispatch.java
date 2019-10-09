package main.java.com.OlehHilchenko.javacore.Chapter08;

//
class A5{
    void callme(){
        System.out.println("Method callme() of class A5");
    }
}

class B5 extends  A5{
    //
    void callme(){
        System.out.println("Method callme() of class B5");
    }
}

class C5 extends A5{
    //
    void callme(){
        System.out.println("Method callme() of class C5");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A5 a = new A5(); //
        B5 b = new B5(); //
        C5 c = new C5(); //

        A5 r;  //
        r = a;   //
        r.callme(); //

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
