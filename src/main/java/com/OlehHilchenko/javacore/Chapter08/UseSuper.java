package main.java.com.OlehHilchenko.javacore.Chapter08;

//
class A1{
    int i;
}

//
class B1 extends A1{
    int i;
    B1(int a, int b){
        super.i = a; //
        i = b;
    }
    void show(){
        System.out.println("Member i in super: " + super.i);
        System.out.println("member i in child class: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B1 subOb = new B1(1, 2);

        subOb.show();
    }
}
