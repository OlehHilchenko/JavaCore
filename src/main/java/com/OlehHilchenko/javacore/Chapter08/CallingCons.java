package main.java.com.OlehHilchenko.javacore.Chapter08;

//
class A2 {
    A2 (){
        System.out.println("In constructor A2.");
    }
}

//
class B2 extends A2 {
    B2 (){
        System.out.println("In constructor B2.");
    }
}

//
class C2 extends B2{
    C2 (){
        System.out.println("In constructor C2.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C2 c = new C2();

    }
}
